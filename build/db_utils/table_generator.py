import re
import json
from sqlalchemy import create_engine, text
from db_utils.table_generator_connection import db_config

def transliterate(name: str) -> str:
    table = {
        'А':'A','Б':'B','В':'V','Г':'G','Д':'D','Е':'E','Ё':'E','Ж':'Zh','З':'Z','И':'I','Й':'Y','К':'K',
        'Л':'L','М':'M','Н':'N','О':'O','П':'P','Р':'R','С':'S','Т':'T','У':'U','Ф':'F','Х':'Kh','Ц':'Ts',
        'Ч':'Ch','Ш':'Sh','Щ':'Shch','Ы':'Y','Э':'E','Ю':'Yu','Я':'Ya','Ь':'','Ъ':'',
        'а':'a','б':'b','в':'v','г':'g','д':'d','е':'e','ё':'e','ж':'zh','з':'z','и':'i','й':'y','к':'k',
        'л':'l','м':'m','н':'n','о':'o','п':'p','р':'r','с':'s','т':'t','у':'u','ф':'f','х':'kh','ц':'ts',
        'ч':'ch','ш':'sh','щ':'shch','ы':'y','э':'e','ю':'yu','я':'ya','ь':'','ъ':'',
        'Є': 'Ye', 'І': 'I', 'Ї': 'Yi', 'Ґ': 'G', 'є': 'ye', 'і': 'i', 'ї': 'yi', 'ґ': 'g',
    }
    cleaned = re.sub(r'\s+', '_', name.strip())
    transliterated = ''.join(table.get(c, c) for c in cleaned)
    return re.sub(r'[^a-zA-Z0-9_]', '_', transliterated)

DATABASE_URL = f"mysql+mysqlconnector://{db_config['user']}:{db_config['password']}@{db_config['host']}:{db_config['port']}/{db_config['database']}"
engine = create_engine(DATABASE_URL)

with engine.connect() as conn:
    deal_columns = [row[0] for row in conn.execute(text("""
        SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS
        WHERE TABLE_SCHEMA = 'SB_PD_OKACADEMY' AND TABLE_NAME = 'DEALS'
    """)).fetchall()]

    ref_fields = conn.execute(text("""
        SELECT KEY_PIPEDRIVE, NAME_PIPEDRIVE, FIELD_TYPE, OPTIONS
        FROM REF_DEAL_FIELDS
        WHERE KEY_PIPEDRIVE IS NOT NULL
    """)).fetchall()

    ref_map = {}
    options_map = {}
    for key, name, field_type, options_json in ref_fields:
        alias = transliterate(name)
        ref_map[key] = (alias, field_type)
        if options_json and options_json.strip() != "[]":
            try:
                parsed = json.loads(options_json)
                options_map[key] = {str(o["id"]): o["label"] for o in parsed if "id" in o and "label" in o}
            except json.JSONDecodeError:
                print(f"Не удалось распарсить OPTIONS для {key}")

# Генерация CTE
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

# SELECT
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
select_lines.append(" AND dc.SOURCE_REQUEST_ID <=> d.SOURCE_REQUEST_ID")
select_lines.append("GROUP BY d.SOURCE_REQUEST_ID;")

sql = "\n".join(cte_lines + select_lines)
with open("deals_view_materialized.sql", "w", encoding="utf-8") as f:
    f.write(sql)

sql[:1000]
