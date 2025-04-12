import json
from pathlib import Path
import pandas as pd
from google.cloud import bigquery

def infer_bq_type(series: pd.Series, name: str | None = None, logger=None) -> str:
    """
    Infers BigQuery type for a pandas Series.
    Applies rules based on column name patterns first, then pandas dtype.
    """
    name = name or series.name or ""
    name_lower = name.lower()

    inferred_type = "STRING"  # default fallback

    # === Pattern-based overrides ===
    if name_lower.endswith("_id"):
        inferred_type = "INT64"
    if name_lower.endswith("_uuid"):
        inferred_type = "STRING"
    elif name_lower.startswith("is_") or name_lower.startswith("has_"):
        inferred_type = "BOOL"
    elif name_lower.endswith("_date"):
        inferred_type = "DATE"
    elif name_lower.endswith("_time") or name_lower.endswith("_timestamp"):
        inferred_type = "TIMESTAMP"
    elif pd.api.types.is_integer_dtype(series):
        inferred_type = "INT64"
    elif pd.api.types.is_float_dtype(series):
        inferred_type = "FLOAT64"
    elif pd.api.types.is_bool_dtype(series):
        inferred_type = "BOOL"
    elif pd.api.types.is_datetime64_any_dtype(series):
        inferred_type = "TIMESTAMP"

    if logger:
        logger.debug(f"Inferred type for column '{name}' as '{inferred_type}'")

    return inferred_type

def resolve_bq_types(df: pd.DataFrame, schema_path: Path, logger) -> dict[str, str]:
    """
    Resolves and saves BQ types for a DataFrame based on column values and naming.
    Updates the schema_map.json file.
    """
    if schema_path.exists():
        with open(schema_path, "r", encoding="utf-8") as f:
            schema_map = json.load(f)
    else:
        schema_map = {}

    new_columns = {}
    for col in df.columns:
        if col not in schema_map:
            inferred_type = infer_bq_type(df[col], name=col, logger=logger)
            new_columns[col] = inferred_type

    if new_columns:
        logger.info(f"New inferred fields: {new_columns}")
        schema_map.update(new_columns)
        with open(schema_path, "w", encoding="utf-8") as f:
            json.dump(schema_map, f, indent=2)
    else:
        logger.info("No new columns found for BigQuery schema")

    return schema_map

def to_bq_schema(schema_map: dict[str, str]) -> list[bigquery.SchemaField]:
    """
    Converts schema_map dictionary into a list of BigQuery SchemaField.
    """
    return [
        bigquery.SchemaField(name=col, field_type=col_type, mode="NULLABLE")
        for col, col_type in schema_map.items()
    ]
