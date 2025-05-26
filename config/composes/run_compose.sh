#!/bin/bash

run_compose() {
  local NAME="$1"
  if [ -z "$NAME" ]; then
    echo "❗ Please provide the base name of the docker-compose file (without extension):"
    echo "   Example: run_compose sb-b-sql-all_in_one"
    return 1
  fi

  local COMPOSE_DIR
  COMPOSE_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
  local BASE_FILE="$COMPOSE_DIR/docker-compose-$NAME.yml"
  local OVERRIDE_FILE="$COMPOSE_DIR/docker-compose-$NAME.override.yml"
  local ENV_FILE="$COMPOSE_DIR/../../.env"

  if [ ! -f "$BASE_FILE" ]; then
    echo "❌ File not found: $BASE_FILE"
    return 1
  fi

  # === Detect container_name using yq ===
  local CONTAINER_NAME
  CONTAINER_NAME=$(yq e '.services[] | select(.container_name) | .container_name' "$BASE_FILE" | head -n 1)

  if [ -n "$CONTAINER_NAME" ]; then
    local STATUS
    STATUS=$(docker inspect -f '{{.State.Status}}' "$CONTAINER_NAME" 2>/dev/null)
    if [ "$STATUS" == "running" ]; then
      echo "🟢 Container '$CONTAINER_NAME' is already running — skipping."
      return 0
    fi
  fi

  # === Check override file ===
  local USE_OVERRIDE=true
  if [ ! -f "$OVERRIDE_FILE" ]; then
    echo "⚠️  Override file not found: $OVERRIDE_FILE (will use base file only)"
    USE_OVERRIDE=false
  fi

  # === Load environment variables ===
# === Load environment variables from all .env files ===
ENV_DIR="$(pwd)"
for env_file in "$ENV_DIR"/*.env; do
  if [ -f "$env_file" ]; then
    echo "📄 Loading environment variables from: $env_file"
    while IFS= read -r line || [ -n "$line" ]; do
      # Skip comments and empty lines
      if [[ $line && ! $line =~ ^[[:space:]]*# ]]; then
        # Remove any inline comments
        line=${line%%#*}
        # Trim whitespace
        line=$(echo "$line" | xargs)
        if [ -n "$line" ]; then
          export "$line"
          echo $line
        fi
      fi
    done < "$env_file"
  fi
done

  # === Handle external networks ===
  echo "🔍 Checking for external networks..."
  local EXTERNAL_NETWORKS
  EXTERNAL_NETWORKS=$(yq e '.networks | with_entries(select(.value.external == true)) | keys | .[]' "$BASE_FILE" 2>/dev/null)

  echo "🔧 Found external networks:"
  echo "$EXTERNAL_NETWORKS"

  for NET in $EXTERNAL_NETWORKS; do
    echo "🔎 Checking network '$NET'..."
    if docker network inspect "$NET" >/dev/null 2>&1; then
      echo "✅ Network '$NET' already exists."
    else
      echo "🔗 Creating missing network: $NET"
      docker network create "$NET"
    fi
  done

  # === Run docker compose ===
  echo "🚀 Running docker compose:"
  echo "  Base file:     $BASE_FILE"
  $USE_OVERRIDE && echo "  Override file: $OVERRIDE_FILE"

  if $USE_OVERRIDE; then
    docker compose -f "$BASE_FILE" -f "$OVERRIDE_FILE" up -d
  else
    docker compose -f "$BASE_FILE" up -d
  fi

  if [ $? -eq 0 ]; then
    echo "✅ Containers started successfully!"
    return 0
  else
    echo "❌ An error occurred while starting containers."
    return 1
  fi
}

# === Run only if script is called directly ===
if [[ "${BASH_SOURCE[0]}" == "${0}" ]]; then
  run_compose "$@"
fi
