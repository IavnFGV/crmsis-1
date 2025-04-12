import os
import json
from pathlib import Path
from dotenv import load_dotenv
from deals_export_logger import get_logger


# 1. Загружаем из родительской директории
parent_env = Path(__file__).resolve().parent.parent /"composes" / ".env"
if parent_env.exists():
    load_dotenv(dotenv_path=parent_env, override=False)

# 2. Загружаем из текущей директории (переопределяет переменные из родительской)
current_env = Path(__file__).resolve().parent / ".env"
if current_env.exists():
    load_dotenv(dotenv_path=current_env, override=True)


GOOGLE_APPLICATION_CREDENTIALS = os.getenv("GOOGLE_APPLICATION_CREDENTIALS")
GCP_PROJECT_ID = os.getenv("GCP_PROJECT_ID")
BQ_DATASET = os.getenv("BQ_DATASET")
BQ_TABLE = os.getenv("BQ_TABLE")
MYSQL_URL = os.getenv("MYSQL_URL")

# === Initialize logger ===
logger = get_logger("deals_export")

# === Load last exported state ===
state_path = Path(__file__).resolve().parent / "last_state.json"
if state_path.exists():
    with open(state_path, "r", encoding="utf-8") as f:
        state = json.load(f)
else:
    state = {"last_exported_id": 0}
    initial_load = True

last_exported_id = state.get("last_exported_id", 0)
initial_load = state.get("initial_load", False)
logger.info(f"Last exported SOURCE_REQUEST_ID: {last_exported_id}")

from sqlalchemy import create_engine, text

# === Connect to MySQL ===
engine = create_engine(MYSQL_URL)
logger.info("Connected to MySQL")

with engine.connect() as conn:
    # 1. Получаем список колонок из DEALS
    deal_columns = [row[0] for row in conn.execute(text("""
        SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS
        WHERE TABLE_SCHEMA = 'SB_PD_OKACADEMY' AND TABLE_NAME = 'DEALS'
    """)).fetchall()]
    logger.info(f"Found {len(deal_columns)} columns in DEALS")

    # 2. Получаем кастомные поля
    ref_fields = conn.execute(text("""
        SELECT KEY_PIPEDRIVE, NAME_PIPEDRIVE_TRANSLIT, FIELD_TYPE, OPTIONS
        FROM REF_DEAL_FIELDS
        WHERE KEY_PIPEDRIVE IS NOT NULL
    """)).fetchall()
    logger.info(f"Loaded {len(ref_fields)} custom field definitions")

    # 3. Трансформируем в структуры

    ref_map = {}
    options_map = {}
    for key, name, field_type, options_json in ref_fields:
        alias = name
        ref_map[key] = (alias, field_type)
        if options_json and options_json.strip() != "[]":
            try:
                parsed = json.loads(options_json)
                options_map[key] = {str(o["id"]): o["label"] for o in parsed if "id" in o and "label" in o}
            except json.JSONDecodeError:
                logger.warning(f"Failed to parse options for {key}")

    logger.info(f"Prepared {len(ref_map)} custom field aliases")

import pandas as pd
from bq_type_resolver import resolve_bq_types


# === Генерация SQL-запроса с агрегацией кастомных полей ===
used_keys = list(ref_map.keys())
key_filter = ", ".join(f"'{k}'" for k in used_keys)

cte_lines = ["WITH custom_fields_agg AS ("]
cte_lines.append("  SELECT")
cte_lines.append("    MAIN_ENTITY_PIPEDRIVE_ID,")
cte_lines.append("    SOURCE_REQUEST_ID,")

agg_fields = []
for key, (alias, field_type) in ref_map.items():
    if key in options_map:
        options = options_map[key]
        if field_type == "set":
            expr = "STRING_VALUE"
            for raw_id, label in options.items():
                label_clean = label.replace("'", "''")
                expr = f"REPLACE({expr}, '{raw_id}', '{label_clean}')"
            agg_fields.append(f"    MAX(CASE WHEN PIPEDRIVE_KEY = '{key}' THEN {expr} ELSE NULL END) AS `{alias}`")
        elif field_type == "enum":
            case_parts = []
            for val, label in options.items():
                label_clean = label.replace("'", "''")
                case_parts.append(f"WHEN STRING_VALUE = '{val}' THEN '{label_clean}'")
            case_block = "CASE " + " ".join(case_parts) + " ELSE STRING_VALUE END"
            agg_fields.append(f"    MAX(CASE WHEN PIPEDRIVE_KEY = '{key}' THEN {case_block} ELSE NULL END) AS `{alias}`")
        else:
            agg_fields.append(f"    MAX(CASE WHEN PIPEDRIVE_KEY = '{key}' THEN STRING_VALUE ELSE NULL END) AS `{alias}`")
    else:
        agg_fields.append(f"    MAX(CASE WHEN PIPEDRIVE_KEY = '{key}' THEN STRING_VALUE ELSE NULL END) AS `{alias}`")

# Добавляем запятые
for i in range(len(agg_fields)):
    if i < len(agg_fields) - 1:
        agg_fields[i] += ","

cte_lines += agg_fields
cte_lines.append("  FROM SB_PD_OKACADEMY.DEAL_CUSTOM_FIELDS")
cte_lines.append(f"  WHERE PIPEDRIVE_KEY IN ({key_filter})")
cte_lines.append("  GROUP BY MAIN_ENTITY_PIPEDRIVE_ID, SOURCE_REQUEST_ID")
cte_lines.append(")")

# SELECT часть
select_lines = ["SELECT"]
deal_select_fields = [f"    MAX(d.`{col}`) AS `{col}`" for col in deal_columns]
custom_aliases = [f"    MAX(dc.`{alias}`) AS `{alias}`" for alias, _ in ref_map.values()]
all_fields = deal_select_fields + custom_aliases

# Добавляем запятые между SELECT полями
for i in range(len(all_fields)):
    if i < len(all_fields) - 1:
        select_lines.append(all_fields[i] + ",")
    else:
        select_lines.append(all_fields[i])

select_lines.append("FROM SB_PD_OKACADEMY.DEALS d FORCE INDEX (idx_deals_source_request)")
select_lines.append("LEFT JOIN custom_fields_agg dc")
select_lines.append("  ON dc.MAIN_ENTITY_PIPEDRIVE_ID = d.ID_PIPEDRIVE")
if not initial_load:
    select_lines.append(" AND dc.SOURCE_REQUEST_ID <=> d.SOURCE_REQUEST_ID")
    select_lines.append(f"WHERE d.SOURCE_REQUEST_ID > {last_exported_id}")
else:
    select_lines.append(" AND dc.SOURCE_REQUEST_ID = d.SOURCE_REQUEST_ID")

select_lines.append("GROUP BY d.SOURCE_REQUEST_ID, d.ID_PIPEDRIVE")


final_sql = "\n".join(cte_lines + select_lines)

logger.info("Executing dynamic SQL to load new data...")
df = pd.read_sql(final_sql, con=engine)
logger.info(f"Loaded {len(df)} new rows from MySQL")
# === Определение и сохранение типов колонок (централизованно) ===
schema_path = Path(__file__).resolve().parent / "schema_map.json"
schema_map = resolve_bq_types(df, schema_path, logger)


from google.cloud import bigquery

# === Инициализация клиента BigQuery ===
bq_client = bigquery.Client(project=GCP_PROJECT_ID)

# Полное имя таблицы
table_ref = f"{GCP_PROJECT_ID}.{BQ_DATASET}.{BQ_TABLE}"

# Преобразуем schema_map в список полей BigQuery
bq_schema = [
    bigquery.SchemaField(name=col, field_type=col_type, mode="NULLABLE")
    for col, col_type in schema_map.items()
]

# Проверяем наличие таблицы
try:
    table = bq_client.get_table(table_ref)
    logger.info(f"Table {table_ref} already exists")
except Exception as e:
    logger.info(f"Table {table_ref} does not exist. Creating...")
    table = bigquery.Table(table_ref, schema=bq_schema)
    table = bq_client.create_table(table)
    logger.info(f"Created table {table_ref}")

# Получаем существующие поля таблицы
existing_fields = {field.name.lower() for field in table.schema}
missing_fields = [col for col in df.columns if col.lower() not in existing_fields]

# Добавляем недостающие поля (расширение схемы)
if missing_fields:
    logger.info(f"Adding {len(missing_fields)} missing fields to BigQuery table")
    updated_schema = list(table.schema)
    for field_name in missing_fields:
        field_type = schema_map.get(field_name, "STRING")
        updated_schema.append(bigquery.SchemaField(name=field_name, field_type=field_type, mode="NULLABLE"))
    table.schema = updated_schema
    table = bq_client.update_table(table, ["schema"])
    logger.info("Table schema updated")
else:
    logger.info("Table schema is up to date")

# from datetime import datetime
from google.cloud.bigquery import LoadJobConfig, WriteDisposition

if df.empty:
    logger.info("No new data to export. Exiting.")
    exit(0)

# === Временная таблица для UPSERT ===
from datetime import datetime, timezone
timestamp_suffix = datetime.now(timezone.utc).strftime("%Y%m%d_%H%M%S")
temp_table_ref = f"{table_ref}_staging_{timestamp_suffix}"

# Загружаем во временную таблицу
job_config = LoadJobConfig(schema=bq_schema, write_disposition=WriteDisposition.WRITE_TRUNCATE)
load_job = bq_client.load_table_from_dataframe(df, temp_table_ref, job_config=job_config)
load_job.result()
logger.info(f"Uploaded data to temporary table: {temp_table_ref}")

# === MERGE UPSERT ===
merge_condition = "T.SOURCE_REQUEST_ID IS NOT DISTINCT FROM S.SOURCE_REQUEST_ID AND T.ID_PIPEDRIVE = S.ID_PIPEDRIVE"
update_assignments = ", ".join([f"T.{col} = S.{col}" for col in df.columns])
insert_columns = ", ".join(df.columns)
insert_values = ", ".join([f"S.{col}" for col in df.columns])

merge_sql = f"""
MERGE `{table_ref}` T
USING `{temp_table_ref}` S
ON {merge_condition}
WHEN MATCHED THEN UPDATE SET {update_assignments}
WHEN NOT MATCHED THEN INSERT ({insert_columns}) VALUES ({insert_values})
"""

logger.info("Executing MERGE to upsert data...")
bq_client.query(merge_sql).result()
logger.info("UPSERT completed successfully")

# === Обновляем last_exported_id ===
if initial_load:
    logger.info(f"Initial load of {len(df)} new rows from BigQuery table")
    state["initial_load"] = False
else:
    new_max_id = df["SOURCE_REQUEST_ID"].max()
    logger.info(f"Updated last_exported_id to {new_max_id}")
    state["last_exported_id"] = int(new_max_id)

with open(state_path, "w", encoding="utf-8") as f:
    json.dump(state, f, indent=2)
logger.info(f"State is saved:{state}")