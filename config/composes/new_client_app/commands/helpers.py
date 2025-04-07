import os
import shutil
import mysql.connector
import logging

def confirm(msg: str) -> bool:
    response = input(f"{msg} [y/N]: ")
    return response.strip().lower() in ("y", "yes")

def create_db(cursor, prefix: str, suffix: str, user: str) -> str:
    db_name = f"{prefix}_{suffix}".upper()
    cursor.execute(f"CREATE DATABASE IF NOT EXISTS {db_name}")
    cursor.execute(f"GRANT ALL PRIVILEGES ON {db_name}.* TO '{user}'@'%'")
    logging.info(f"Created database {db_name} and granted access to {user}")
    return db_name

def generate_compose_file(template_path: str, output_path: str, replacements: dict):
    if os.path.exists(output_path):
        logging.warning(f"File {output_path} already exists.")
        return
    with open(template_path, "r") as f:
        content = f.read()
    for key, value in replacements.items():
        content = content.replace(key, value)
    with open(output_path, "w") as f:
        f.write(content)
    logging.info(f"Generated docker-compose file: {output_path}")

def update_nginx_config(customer_name: str, nginx_conf_path: str):
    if not os.path.exists(nginx_conf_path):
        logging.warning(f"nginx config not found: {nginx_conf_path}")
        return
    backup_path = nginx_conf_path + ".bak"
    shutil.copyfile(nginx_conf_path, backup_path)
    logging.info(f"Backup saved: {backup_path}")
    with open(nginx_conf_path, "r") as f:
        content = f.read()
    new_location = f"""
      location /v1/webhook/{customer_name} {{
            proxy_pass http://sb_b_app_wh_{customer_name}:8080;
      }}
      location /api/{customer_name}{{
          proxy_pass http://sb_b_app_{customer_name}:8080;
      }}
#ADD_NEXT_LOCATION_HERE
"""
    content = content.replace("#ADD_NEXT_LOCATION_HERE", new_location)
    with open(nginx_conf_path, "w") as f:
        f.write(content)
    logging.info(f"Nginx config updated at {nginx_conf_path}")
