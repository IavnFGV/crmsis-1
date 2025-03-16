import pandas as pd
import numpy as np
from collections import defaultdict
from datetime import datetime
from IPython.display import display

# Предположим, что у нас есть словарь field_values, который содержит значения для каждого поля
# Например:
# field_values = {
#     ("entity1", "field1"): [1, 2, 3
def detect_mysql_type_extended(key,values):
    """
    Определяет тип данных MySQL, который покрывает все переданные значения, включая даты в разных форматах.
    """
    mysql_type = "TEXT"
    java_type = "String"

    # guess from name
    if(key[1].endswith("_id")):
        mysql_type, java_type=  "BIGINT", "Long"
    elif(key[1].endswith("_date")):
        mysql_type, java_type= "DATE", "LocalDate"
    elif(key[1].endswith("_datetime")):
        mysql_type, java_type= "DATETIME", "LocalDateTime"
    elif(key[1].endswith("_time")):
        mysql_type, java_type= "DATETIME", "LocalDateTime"
    elif(key[1].startswith("is_")):
        mysql_type, java_type= "BOOLEAN", "Boolean"

    if all(v is None for v in values):
        if(key[1].endswith("_id")):
             mysql_type, java_type=  "BIGINT", "Long"
        elif(key[1].endswith("_date")):
             mysql_type, java_type= "DATE", "LocalDate"
        elif(key[1].endswith("_datetime")):
             mysql_type, java_type= "DATETIME", "LocalDateTime"
        elif(key[1].endswith("_time")):
             mysql_type, java_type= "DATETIME", "LocalDateTime"
        elif(key[1].startswith("is_")):
             mysql_type, java_type= "BOOLEAN", "Boolean"
        return mysql_type, java_type
    values = [v for v in values if v is not None and v != "" ]  # Игнорируем NULL значения (None

    if all(isinstance(v, bool) for v in values):
        return "BOOLEAN", "Boolean"
    elif all(isinstance(v, int) for v in values):
            return "BIGINT", "Long"
    elif all(isinstance(v, float) or isinstance(v, int) for v in values):
        return "DOUBLE",  "Double"
    elif all(isinstance(v, str) for v in values):
        # Проверяем, являются ли все строки датами
        possible_date_formats = [
            ("%Y-%m-%d", "DATE", "LocalDate"),
            ("%Y-%m-%d %H:%M:%S", "DATETIME", "LocalDateTime"),
            ("%Y-%m-%dT%H:%M:%S", "DATETIME", "LocalDateTime")
        ]
        for date_format, mysql_candidate, java_candidate in possible_date_formats:
            try:
                parsed_dates = [datetime.strptime(v, date_format) for v in values]
                return mysql_candidate, java_candidate
            except ValueError:
                continue

        # Если это просто текстовые данные
        max_length = max(len(v) for v in values)
        if max_length <= 255:
            return f"VARCHAR({255})", "String"
        else:
            return "TEXT", "String"
    elif all(isinstance(v, list) for v in values):
        return "JSON", "String"
    elif all(isinstance(v, dict) for v in values):
        return "JSON", "String"
    else:
        return "TEXT", "String"

def analise_data(field_values):
    """
    Анализирует данные и определяет типы данных MySQL для каждого поля.
    """
    field_types = {key: detect_mysql_type_extended(key,values) for key, values in field_values.items()}
    # Преобразуем в DataFrame для удобного отображения
    df_extended = pd.DataFrame([
        {"Entity": entity, "Field": field, "MySQL Type": field_types[(entity, field)][0], "Java Type": field_types[(entity, field)][1]}
        for (entity, field) in field_types
    ])
    display(df_extended)
    return field_types