import yaml
import re
import os
from pathlib import Path

DOCKER_COMPOSE_PATH = "docker-compose-sb-b-app-wh-mufiksoft.yml"
OUTPUT_PATH = "from_docker.env"

env_var_pattern = re.compile(r"\$\{([^}]+)\}")

def resolve_env_value(value: str) -> str:
    # Replace ${VAR} with env value if exists, otherwise keep ${VAR}
    def replace_var(match):
        var_name = match.group(1)
        return os.environ.get(var_name, f"${{{var_name}}}")
    return env_var_pattern.sub(replace_var, value)

def extract_env_variables(compose_path: str) -> dict:
    with open(compose_path, encoding="utf-8") as f:
        content = yaml.safe_load(f)

    result = {}
    services = content.get("services", {})
    for service_name, service in services.items():
        envs = service.get("environment", [])
        for item in envs:
            if isinstance(item, str) and "=" in item:
                key, value = item.split("=", 1)
                result[key.strip()] = resolve_env_value(value.strip())
            elif isinstance(item, str):
                result[item.strip()] = os.environ.get(item.strip(), f"${{{item.strip()}}}")
            elif isinstance(item, dict):
                for k, v in item.items():
                    v_str = str(v) if v is not None else ""
                    result[k.strip()] = resolve_env_value(v_str.strip())
    return result

def write_env_file(env_map: dict, output_path: str):
    lines = [f"{k}={v}" for k, v in env_map.items()]
    Path(output_path).write_text("\n".join(lines), encoding="utf-8")
    print(f"Saved {len(lines)} variables to {output_path}")

if __name__ == "__main__":
    pass
    # env_map = extract_env_variables(DOCKER_COMPOSE_PATH)
    # write_env_file(env_map, OUTPUT_PATH)
