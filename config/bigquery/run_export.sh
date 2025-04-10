#!/bin/bash

cd "$(dirname "$0")"

echo "=== Starting export at $(date) ==="

# Активируем virtualenv
if [ -d "venv" ]; then
    source venv/bin/activate
    echo "[VENV] Activated"
else
    echo "[VENV] Not found. Please run: python3 -m venv venv && source venv/bin/activate"
    exit 1
fi

# Запускаем Python-скрипт
python3 deals_incremental_export.py >> export.log 2>&1

echo "=== Finished at $(date) ==="