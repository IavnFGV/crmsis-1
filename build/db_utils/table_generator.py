from sqlalchemy import create_engine, text
from sqlalchemy.engine import Result
import re

# 🔤 Функция транслитерации
def transliterate(name: str) -> str:
    table = {
        # Русский
        'А':'A','Б':'B','В':'V','Г':'G','Д':'D','Е':'E','Ё':'E','Ж':'Zh','З':'Z','И':'I','Й':'Y','К':'K',
        'Л':'L','М':'M','Н':'N','О':'O','П':'P','Р':'R','С':'S','Т':'T','У':'U','Ф':'F','Х':'Kh','Ц':'Ts',
        'Ч':'Ch','Ш':'Sh','Щ':'Shch','Ы':'Y','Э':'E','Ю':'Yu','Я':'Ya','Ь':'','Ъ':'',
        'а':'a','б':'b','в':'v','г':'g','д':'d','е':'e','ё':'e','ж':'zh','з':'z','и':'i','й':'y','к':'k',
        'л':'l','м':'m','н':'n','о':'o','п':'p','р':'r','с':'s','т':'t','у':'u','ф':'f','х':'kh','ц':'ts',
        'ч':'ch','ш':'sh','щ':'shch','ы':'y','э':'e','ю':'yu','я':'ya','ь':'','ъ':'',

        # Украинский
        'Є': 'Ye', 'І': 'I', 'Ї': 'Yi', 'Ґ': 'G',
        'є': 'ye', 'і': 'i', 'ї': 'yi', 'ґ': 'g',
    }

    # 1. Убираем лишние пробелы и заменяем их на один _
    cleaned = re.sub(r'\s+', '_', name.strip())

    # 2. Транслитерация
    transliterated = ''.join(table.get(c, c) for c in cleaned)

    # 3. Удаляем все символы кроме латиницы, цифр и подчёркивания
    return re.sub(r'[^a-zA-Z0-9_]', '_', transliterated)



lines = ["SELECT"]


with engine.connect() as conn:
    # Получаем все колонки из DEALS
    deal_columns = conn.execute(text("""
        SELECT COLUMN_NAME
        FROM INFORMATION_SCHEMA.COLUMNS
        WHERE TABLE_SCHEMA = 'SB_PD_OKACADEMY' AND TABLE_NAME = 'DEALS'
    """)).fetchall()
    deal_columns = [row[0] for row in deal_columns]

    # Мапа кастомных полей
    ref_fields = conn.execute(text("""
        SELECT KEY_PIPEDRIVE, NAME_PIPEDRIVE
        FROM REF_DEAL_FIELDS
        WHERE KEY_PIPEDRIVE IS NOT NULL
    """)).fetchall()
    ref_map = {key: transliterate(name) for key, name in ref_fields}

extracted_fields =[];

# Добавляем d.* колонки с алиасами (если есть в ref_map)
for col in deal_columns:
    k =col;
    alias = ref_map.get(k)
    if not alias:
        k=col.lower()
        alias = ref_map.get(k)
    if alias and alias != col:
        ref_map.pop(k)
        extracted_fields.append((col, alias,"    d.`$col` AS `$alias`,"))
    else:
        extracted_fields.append((col, col,"    d.`$col` AS `$alias`,"))

        # lines.append(f"    d.`{col}` AS `{alias}`,")
        # lines.append(f"    d.`{col}`,")
        #
        # lines.append(
        #  f"    MAX(CAST(CASE WHEN dc.PIPEDRIVE_KEY = '{key}' THEN dc.STRING_VALUE ELSE NULL END AS CHAR)) AS `{alias}`,")




# Добавляем кастомные поля
for key, alias in ref_map.items():
    extracted_fields.append((key,alias,"    MAX(CAST(CASE WHEN dc.PIPEDRIVE_KEY = '$col' THEN dc.STRING_VALUE ELSE NULL END AS CHAR)) AS `$alias`,"))

extracted_fields = sorted(extracted_fields,key=lambda x:x[1])

for col,alias,template in extracted_fields:
    lines.append(template.replace("$alias", alias).replace("$col", col))


if lines[-1].strip().endswith(','):
    lines[-1] = lines[-1].rstrip(',')

lines.append("""
FROM SB_PD_OKACADEMY.DEALS d
LEFT JOIN SB_PD_OKACADEMY.DEAL_CUSTOM_FIELDS dc
  ON dc.MAIN_ENTITY_PIPEDRIVE_ID = d.ID_PIPEDRIVE
 AND (
      dc.SOURCE_REQUEST_ID = d.SOURCE_REQUEST_ID
   OR (dc.SOURCE_REQUEST_ID IS NULL AND d.SOURCE_REQUEST_ID IS NULL)
 )
GROUP BY d.ID;
""")


sql = "\n".join(lines)
print("\n✅ Сгенерированный SQL-запрос:\n")
print(sql)

with open("deals_view_materialized.sql", "w", encoding="utf-8") as f:
    f.write(sql)
print("\n💾 SQL записан в файл: deals_view_materialized.sql")