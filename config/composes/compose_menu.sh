#!/bin/bash

# === Source the reusable run_compose function ===
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
source "$SCRIPT_DIR/run_compose.sh"

# === Find base docker-compose files (exclude override) ===
AVAILABLE_FILES=()
LABELS=()

for file in "$SCRIPT_DIR"/docker-compose-*.yml; do
  [ -e "$file" ] || continue  # skip if no match
  filename=$(basename "$file")
  name=$(echo "$filename" | sed -E 's/^docker-compose-(.+)\.yml$/\1/')

  # Skip override files
  if [[ "$name" =~ \.override$ ]]; then
    continue
  fi

  # Check if override exists
  if [ -f "$SCRIPT_DIR/docker-compose-$name.override.yml" ]; then
    label="$name (+ override)"
  else
    label="$name"
  fi

  AVAILABLE_FILES+=("$name")
  LABELS+=("$label")
done

# === If no files found ===
if [ ${#AVAILABLE_FILES[@]} -eq 0 ]; then
  echo "❌ No docker-compose-*.yml files found."
  exit 1
fi

# === Display menu ===
echo "🧩 Available compose projects:"
for i in "${!LABELS[@]}"; do
  index=$((i+1))
  echo "  [$index] ${LABELS[$i]}"
done

# === Get user selection ===
echo -n "👉 Select a project to start [1-${#LABELS[@]}]: "
read -r selection

if ! [[ "$selection" =~ ^[0-9]+$ ]] || [ "$selection" -lt 1 ] || [ "$selection" -gt "${#AVAILABLE_FILES[@]}" ]; then
  echo "❌ Invalid selection."
  exit 1
fi

CHOSEN_NAME="${AVAILABLE_FILES[$((selection - 1))]}"
echo "🚀 Starting: $CHOSEN_NAME"
run_compose "$CHOSEN_NAME"
