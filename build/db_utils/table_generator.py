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

lines = ["SELECT"]

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

    ref_map = {}       # key → (alias, type)
    options_map = {}   # key → {id: label}

    for key, name, field_type, options_json in ref_fields:
        alias = transliterate(name)
        ref_map[key] = (alias, field_type)
        if options_json and options_json.strip() != "[]":
            try:
                parsed = json.loads(options_json)
                options_map[key] = {str(o["id"]): o["label"] for o in parsed if "id" in o and "label" in o}
            except json.JSONDecodeError:
                print(f"Не удалось распарсить OPTIONS для {key}")


extracted_fields = []
for col in deal_columns:
    alias_entry = ref_map.get(col) or ref_map.get(col.lower())
    alias = alias_entry[0] if alias_entry else col
    ref_map.pop(col, None)
    ref_map.pop(col.lower(), None)
    # 💡 MAX даже для полей из DEALS
    extracted_fields.append((col, alias, f"    MAX(d.`{col}`) AS `{alias}`,"))

for key, (alias, field_type) in ref_map.items():
    if key in options_map:
        options = options_map[key]
        if field_type == "set":
            expr = "dc.STRING_VALUE"
            for raw_id, label in options.items():
                label_clean = label.replace("'", "''")
                expr = f"REPLACE({expr}, '{raw_id}', '{label_clean}')"
            sql_expr = f"    MAX(CAST(CASE WHEN dc.PIPEDRIVE_KEY = '{key}' THEN {expr} ELSE NULL END AS CHAR)) AS `{alias}`,"
        elif field_type == "enum":
            case_parts = []
            for val, label in options.items():
                label_clean = label.replace("'", "''")
                case_parts.append(f"WHEN dc.STRING_VALUE = '{val}' THEN '{label_clean}'")
            case_block = "CASE " + " ".join(case_parts) + " ELSE dc.STRING_VALUE END"
            sql_expr = f"    MAX(CAST(CASE WHEN dc.PIPEDRIVE_KEY = '{key}' THEN {case_block} ELSE NULL END AS CHAR)) AS `{alias}`,"
        else:
            sql_expr = f"    MAX(CAST(CASE WHEN dc.PIPEDRIVE_KEY = '{key}' THEN dc.STRING_VALUE ELSE NULL END AS CHAR)) AS `{alias}`,"
    else:
        sql_expr = f"    MAX(CAST(CASE WHEN dc.PIPEDRIVE_KEY = '{key}' THEN dc.STRING_VALUE ELSE NULL END AS CHAR)) AS `{alias}`,"
    extracted_fields.append((key, alias, sql_expr))

extracted_fields = sorted(extracted_fields, key=lambda x: x[1])
lines += [tpl for _, _, tpl in extracted_fields]

# Удаляем запятую в конце последнего поля
if lines[-1].strip().endswith(','):
    lines[-1] = lines[-1].rstrip(',')

# 🧾 FROM + JOIN + GROUP BY по d.SOURCE_REQUEST_ID
lines.append("""
FROM SB_PD_OKACADEMY.DEALS d
LEFT JOIN SB_PD_OKACADEMY.DEAL_CUSTOM_FIELDS dc
  ON dc.MAIN_ENTITY_PIPEDRIVE_ID = d.ID_PIPEDRIVE
 AND (
      dc.SOURCE_REQUEST_ID = d.SOURCE_REQUEST_ID
   OR (dc.SOURCE_REQUEST_ID IS NULL AND d.SOURCE_REQUEST_ID IS NULL)
)
GROUP BY d.SOURCE_REQUEST_ID;
""")

sql = "\n".join(lines)
with open("deals_view_materialized.sql", "w", encoding="utf-8") as f:
    f.write(sql)