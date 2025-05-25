import subprocess
import sys
import os
import logger
from pathlib import Path

log = logger.get_logger("build-script")

# === Базовый путь к корню проекта (crmsis-1)
BASE_DIR = Path(__file__).resolve().parents[2]

# === Конфигурация приложений
PROJECTS = {
    "sb-b-app": {
        "path": BASE_DIR / "clients-back",
        "image": "ivandrozda/sb-b-app"
    },
    "sb-b-app-webhooks": {
        "path": BASE_DIR / "webhooks",
        "image": "ivandrozda/sb-b-app-webhooks"
    }
}

# === Поддерживаемые режимы сборки
VALID_BUILD_TYPES = {"jvm", "native", "native-micro", "legacy-jar"}

# === Переменные окружения
BUILD_ENV = {
    "QUARKUS_HIBERNATE_ORM_WEBHOOKS_PACKAGES": "dti.crmsis.back.dao.wh",
    "QUARKUS_HIBERNATE_ORM_PACKAGES": "dti.crmsis.back.dao.pd",
    "QUARKUS_HIBERNATE_ORM_APP_PACKAGES": "dti.crmsis.back.dao.app"
}

# === Путь к кэшу Gradle на диске D:
GRADLE_CACHE_PATH = "/mnt/d/gradle/gradle_user_home_linux"
if not GRADLE_CACHE_PATH.exists():
    log.info(f"📁 Создание Gradle-кэша на D-диске: {GRADLE_CACHE_PATH}")
    GRADLE_CACHE_PATH.mkdir(parents=True, exist_ok=True)
else:
    log.info(f"📦 Используется Gradle-кэш: {GRADLE_CACHE_PATH}")

def run(cmd, cwd=None, env_override=None):
    log.info(f"➡️  Executing: {' '.join(str(c) for c in cmd)}")
    try:
        env = os.environ.copy()
        env["GRADLE_USER_HOME"] = str(GRADLE_CACHE_PATH)
        if env_override:
            env.update(env_override)
        subprocess.run(cmd, cwd=cwd, env=env, check=True)
    except subprocess.CalledProcessError as e:
        log.error(f"❌ Command failed with code {e.returncode}")
        sys.exit(e.returncode)

def main():
    if len(sys.argv) < 3:
        log.error("Usage: python build_and_package.py <sb-b-app|sb-b-app-webhooks> <jvm|native|...> [--push]")
        sys.exit(1)

    app_code = sys.argv[1]
    build_type = sys.argv[2]
    do_push = "--push" in sys.argv

    if app_code not in PROJECTS:
        log.error(f"❌ Unknown app: {app_code}")
        sys.exit(1)

    if build_type not in VALID_BUILD_TYPES:
        log.error(f"❌ Unknown build type: {build_type}")
        log.info(f"Valid build types: {', '.join(VALID_BUILD_TYPES)}")
        sys.exit(1)

    app_path = PROJECTS[app_code]["path"].resolve()
    image_name = PROJECTS[app_code]["image"]
    dockerfile = app_path / "src/main/docker" / f"Dockerfile.{build_type}"

    log.info(f"📦 Application: {app_code}")
    log.info(f"📁 Project path: {app_path}")
    log.info(f"⚙️ Build type: {build_type}")
    log.info(f"🐳 Dockerfile: {dockerfile}")

    # === Gradle build через host ./gradlew
    log.info(f"🔨 Сборка через Gradle: {build_type}")
    gradle_cmd = [
        "./gradlew", "clean", "build",
        "-x", "test"
    ]

    if build_type == "native" or build_type == "native-micro":
        gradle_cmd.extend([
            "-Dquarkus.native.enabled=true",
            "-Dquarkus.native.container-build=true",
            "-Dquarkus.native.container-runtime=docker"
        ])

        if build_type == "native-micro":
            gradle_cmd.append("-Dquarkus.native.additional-build-args=--no-fallback,--initialize-at-build-time")

    run(gradle_cmd, cwd=app_path, env_override=BUILD_ENV)

    # === Docker build
    log.info(f"📦 Docker сборка образа: {image_name}:{build_type}")
    run([
        "docker", "build",
        "-f", str(dockerfile),
        "-t", f"{image_name}:{build_type}",
        "."
    ], cwd=app_path)

    # === Docker push (если нужно)
    if do_push:
        log.info(f"📤 Push to Docker Hub: {image_name}:{build_type}")
        run(["docker", "push", f"{image_name}:{build_type}"])

    log.info(f"✅ Сборка завершена: {image_name}:{build_type}")

if __name__ == "__main__":
    main()
