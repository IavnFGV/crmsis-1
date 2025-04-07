#!/usr/bin/env python3

import os
import sys
import shutil
from dotenv import load_dotenv
import mysql.connector



def load_env():
    load_dotenv()
    print("Environment variables loaded.")

def get_input():
    full_name = input("FULL_NAME description of client: ").strip()
    url = input("URL pipedrive address: ").strip()
    customer_name = input("CUSTOMER_NAME postfix (used in path and db name): ").strip()
    api_token = input("API_TOKEN: ").strip()

    for field, value in [("FULL_NAME", full_name), ("URL", url), ("CUSTOMER_NAME", customer_name), ("API_TOKEN", api_token)]:
        if not value:
            print(f"❌ Error: {field} cannot be empty.")
            exit(1)

    return full_name, url, customer_name, api_token

def confirm(prompt: str) -> bool:
    answer = input(f"{prompt} [y/N]: ").strip().lower()
    return answer == "y"

def check_customer_exists(cursor, customer_name: str) -> bool:
    cursor.execute("SELECT COUNT(*) FROM CUSTOMERS WHERE CUSTOMER_NAME = %s", (customer_name,))
    return cursor.fetchone()[0] > 0

def insert_customer(cursor, full_name, url, customer_name, api_token):
    cursor.execute("""
        INSERT INTO CUSTOMERS (FULL_NAME, URL, CUSTOMER_NAME, API_TOKEN)
        VALUES (%s, %s, %s, %s)
    """, (full_name, url, customer_name, api_token))

def create_db(root_cursor, db_type: str, customer_name: str, grant_user: str) -> str:
    db_name = f"{db_type}_{customer_name}".upper()
    root_cursor.execute(f"CREATE DATABASE IF NOT EXISTS {db_name}")
    root_cursor.execute(f"GRANT ALL PRIVILEGES ON {db_name}.* TO '{grant_user}'@'%'")
    return db_name

def generate_compose_file(template_path: str, output_path: str, replacements: dict):
    if os.path.exists(output_path):
        if not confirm(f"File {output_path} already exists. Overwrite?"):
            print("Aborted writing file.")
            return
    with open(template_path, "r") as f:
        content = f.read()
    for key, value in replacements.items():
        content = content.replace(key, value)
    with open(output_path, "w") as f:
        f.write(content)
    print(f"Generated {output_path}")

def update_nginx_config(customer_name: str, nginx_conf_path: str):
    if not os.path.exists(nginx_conf_path):
        print(f"nginx config not found: {nginx_conf_path}")
        return
    backup_path = nginx_conf_path + ".bak"
    shutil.copyfile(nginx_conf_path, backup_path)
    print(f"Backup saved: {backup_path}")
    with open(nginx_conf_path, "r") as f:
        content = f.read()
    new_location = f"""
      location /v1/webhook/{customer_name} {{
            proxy_pass http://sb_b_app_wh_{customer_name};
      }}
      location /api/{customer_name}{{
          proxy_pass http://sb_b_app_{customer_name}:8080;
      }}
#ADD_NEXT_LOCATION_HERE
"""
    content = content.replace("#ADD_NEXT_LOCATION_HERE", new_location)
    with open(nginx_conf_path, "w") as f:
        f.write(content)
    print(f"Nginx config updated at {nginx_conf_path}")

def main():
    load_env()
    full_name, url, customer_name, api_token = get_input()

    # Подключение к базе SB_ADMIN
    admin_conn = mysql.connector.connect(
        user=os.getenv("SB_ADMIN_MYSQL_USER"),
        password=os.getenv("SB_ADMIN_MYSQL_PASSWORD"),
        host="localhost",
        port=os.getenv("SB_ADMIN_MYSQL_PORT"),
        database="SB_ADMIN"
    )
    admin_cursor = admin_conn.cursor()
    if check_customer_exists(admin_cursor, customer_name):
        if not confirm(f"CUSTOMER_NAME '{customer_name}' already exists. Proceed anyway?"):
            print("Aborting.")
            return
    else:
        print(f"[DEBUG] Inserting: full_name={full_name!r}, url={url!r}, customer_name={customer_name!r}, api_token={api_token!r}")
        insert_customer(admin_cursor, full_name, url, customer_name, api_token)
        admin_conn.commit()
        print(f"Inserted new customer: {customer_name}")
    admin_cursor.close()
    admin_conn.close()

    # Подключение к MySQL как root
    root_conn = mysql.connector.connect(
        user="root",
        password=os.getenv("SB_CLIENTS_BACK_MYSQL_ROOT_PASSWORD"),
        host="localhost",
        port=os.getenv("SB_CLIENTS_BACK_MYSQL_PORT")
    )
    root_cursor = root_conn.cursor()
    pd_db = create_db(root_cursor, "SB_PD", customer_name, "sb_usr")
    wh_db = create_db(root_cursor, "SB_WH", customer_name, "sb_usr")
    root_conn.commit()
    root_cursor.close()
    root_conn.close()

    # Генерация docker-compose файлов
    replacements = {
        "$@{SB_APP_URL_PATH}": customer_name,
        "$@{SB_NEW_DATABASE_NAME}": pd_db,
        "$@{SB_NEW_WH_DATABASE_NAME}": wh_db,
        "$@{SB_APP_TOKEN}": api_token,
        "$@{CUSTOMER_FULL_NAME}": full_name,
        "$@{CUSTOMER_NAME}": customer_name,
        "$@{SERVICE_SUFFIX}": customer_name
    }

    generate_compose_file(
        "../composes/docker-compose-sb-b-app-template.yml",
        f"docker-compose-sb-b-app-{customer_name}.yml",
        replacements
    )

    generate_compose_file(
        "../composes/docker-compose-sb-b-app-wh-template.yml",
        f"docker-compose-sb-b-app-wh-{customer_name}.yml",
        replacements
    )

    # Обновление nginx.conf
    update_nginx_config(customer_name, "/config/config/nginx/nginx.conf")

if __name__ == "__main__":
    main()
