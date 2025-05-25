import os
import yaml
import re
from pathlib import Path
from typing import List, Dict

ENV_VAR_PATTERN = re.compile(r"\$\{([^}]+)\}")

# === CONFIGURATION ===
ENV_FILES = [
    "revised.env"
]

COMPOSE_FILES = [
    "docker-compose-sb-b-app-mufiksoft.yml"
]

def parse_env_file(file: Path) -> Dict[str, str]:
    envs = {}
    if not file.exists():
        return envs
    for line in file.read_text(encoding="utf-8").splitlines():
        line = line.strip()
        if not line or line.startswith("#") or "=" not in line:
            continue
        key, value = line.split("=", 1)
        envs[key.strip()] = value.strip().strip('"').strip("'")
    return envs

def resolve_value(val: str) -> str:
    def replace(match):
        var_name = match.group(1)
        return os.environ.get(var_name, f"${{{var_name}}}")
    return ENV_VAR_PATTERN.sub(replace, val)

def parse_compose_envs(compose_path: Path) -> Dict[str, str]:
    envs = {}
    if not compose_path.exists():
        return envs
    with compose_path.open(encoding="utf-8") as f:
        content = yaml.safe_load(f)

    services = content.get("services", {})
    for _, service in services.items():
        raw_envs = service.get("environment", [])
        if isinstance(raw_envs, dict):
            for k, v in raw_envs.items():
                envs[k.strip()] = resolve_value(str(v).strip())
        elif isinstance(raw_envs, list):
            for item in raw_envs:
                if isinstance(item, str) and "=" in item:
                    k, v = item.split("=", 1)
                    envs[k.strip()] = resolve_value(v.strip())
                elif isinstance(item, str):
                    envs[item.strip()] = os.environ.get(item.strip(), f"${{{item.strip()}}}")
    return envs

def collect_all_envs(env_paths: List[str], compose_paths: List[str]) -> Dict[str, str]:
    result = {}
    for env_file in env_paths:
        result.update(parse_env_file(Path(env_file)))
    for compose_file in compose_paths:
        result.update(parse_compose_envs(Path(compose_file)))
    return result

def format_for_idea(envs: Dict[str, str]) -> str:
    return " ".join([f'{k}={v}\n' for k, v in sorted(envs.items())])

if __name__ == "__main__":
    print("hello")
    all_envs = collect_all_envs(ENV_FILES, COMPOSE_FILES)
    print("💡 Paste the following into IntelliJ 'Environment Variables':\n")
    print(format_for_idea(all_envs))
