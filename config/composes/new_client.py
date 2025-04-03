#!/usr/bin/env python3

import sys
import mysql.connector
import os
from dotenv import load_dotenv
import shutil

load_dotenv()
print("Environment variables loaded.")
# Read input data
full_name = input("FULL_NAME description of client: ")
print(f"Received FULL_NAME: {full_name}")
url = input("URL pipedrive address: ")
print(f"Received URL: {url}")
customer_name = input("CUSTOMER_NAME we will catch webhooks on this postfix for our server: ")
print(f"Received URL_PATH: {customer_name}")
api_token = input("API_TOKEN: ")
print("Received API_TOKEN")

# Insert data into MySQL database
db_config = {
    'user': os.getenv('SB_ADMIN_MYSQL_USER'),
    'password': os.getenv('SB_ADMIN_MYSQL_PASSWORD'),
    'host': "localhost",
    'port': os.getenv('SB_ADMIN_MYSQL_PORT'),
    'database': 'SB_ADMIN'
}

conn = mysql.connector.connect(**db_config)
print("Connected to MySQL database.")

cursor = conn.cursor()
print("MySQL cursor created.")

# Check for existing CUSTOMER_NAME
check_query = "SELECT COUNT(*) FROM CUSTOMERS WHERE CUSTOMER_NAME = %s"
cursor.execute(check_query, (customer_name,))
print("Executed query to check for existing URL_PATH.")
if cursor.fetchone()[0] > 0:
    print(f"Error: A record with CUSTOMER_NAME '{customer_name}' already exists.")
    cursor.close()
    conn.close()
    exit(1)

insert_query = """
INSERT INTO CUSTOMERS (FULL_NAME, URL, CUSTOMER_NAME, API_TOKEN)
VALUES (%s, %s, %s, %s)
"""
cursor.execute(insert_query, (full_name, url, customer_name, api_token))
print("Inserted new customer record into the database.")
conn.commit()
print("Database changes committed.")

cursor.close()
print("MySQL cursor closed.")
conn.close()
print("MySQL connection closed.")

# Connect to MySQL as root to create a new database and grant privileges
root_db_config = {
    'user': 'root',
    'password': os.getenv('SB_CLIENTS_BACK_MYSQL_ROOT_PASSWORD'),
    'host': "localhost",
    'port': os.getenv('SB_CLIENTS_BACK_MYSQL_PORT')
}

root_conn = mysql.connector.connect(**root_db_config)
print("Connected to MySQL as root.")
root_cursor = root_conn.cursor()
print("Root MySQL cursor created.")


def create_db_for_client(type = "",suffix=customer_name, grant_to_user ='sb_usr'):
    new_db_name = f'{type}_{suffix}'.upper()
    # Create new database and grant privileges
    create_db_query = f"CREATE DATABASE IF NOT EXISTS {new_db_name};"
    grant_privileges_query = f"GRANT ALL PRIVILEGES ON {new_db_name}.* TO '{grant_to_user}'@'%';"
    root_cursor.execute(create_db_query)
    print(f"Executed query to create database {new_db_name}.")
    root_cursor.execute(grant_privileges_query)
    print(f"Executed query to grant privileges on {new_db_name}.")
    root_conn.commit()
    print("Root database changes committed.")
    return new_db_name


new_pipedrive_db_name = create_db_for_client(type ="SB_PD", suffix=customer_name, grant_to_user='sb_usr')

new_webhook_db_name = create_db_for_client(type ="SB_WH",suffix=customer_name, grant_to_user='sb_usr')

root_cursor.close()
print("Root MySQL cursor closed.")
root_conn.close()
print("Root MySQL connection closed.")

# Process docker-compose file
with open('../composes/docker-compose-sb-b-app-template.yml', 'r') as file:
    docker_compose_content = file.read()
print("Read docker-compose template file.")

docker_compose_content = docker_compose_content.replace('$@{SB_APP_URL_PATH}', customer_name)
docker_compose_content = docker_compose_content.replace('$@{SB_NEW_DATABASE_NAME}', new_pipedrive_db_name)
docker_compose_content = docker_compose_content.replace('$@{SB_NEW_WH_DATABASE_NAME}', new_webhook_db_name)
docker_compose_content = docker_compose_content.replace('$@{SB_APP_TOKEN}', api_token)
docker_compose_content = docker_compose_content.replace('$@{CUSTOMER_FULL_NAME}', full_name)
docker_compose_content = docker_compose_content.replace('$@{CUSTOMER_NAME}', customer_name)
docker_compose_content = docker_compose_content.replace('$@{SERVICE_SUFFIX}', customer_name)


print("Replaced placeholders in docker-compose content.")

output_file_name = f'docker-compose-sb-b-app-{customer_name}.yml'
with open(output_file_name, 'w') as file:
    file.write(docker_compose_content)

with open('../composes/docker-compose-sb-b-app-wh-template.yml', 'r') as file:
    docker_compose_content = file.read()
print("Read docker-compose template for webhook file.")

docker_compose_content = docker_compose_content.replace('$@{SB_APP_URL_PATH}', customer_name)
docker_compose_content = docker_compose_content.replace('$@{SB_NEW_DATABASE_NAME}', new_pipedrive_db_name)
docker_compose_content = docker_compose_content.replace('$@{SB_NEW_WH_DATABASE_NAME}', new_webhook_db_name)
docker_compose_content = docker_compose_content.replace('$@{SB_APP_TOKEN}', api_token)
docker_compose_content = docker_compose_content.replace('$@{CUSTOMER_FULL_NAME}', full_name)
docker_compose_content = docker_compose_content.replace('$@{CUSTOMER_NAME}', customer_name)
docker_compose_content = docker_compose_content.replace('$@{SERVICE_SUFFIX}', customer_name)


print("Replaced placeholders in docker-compose content.")

output_file_name = f'docker-compose-sb-b-app-wh-{customer_name}.yml'
with open(output_file_name, 'w') as file:
    file.write(docker_compose_content)

# nginx_conf_file_name = f'../config/nginx/nginx.conf'
# backup_nginx_conf_file_name = f'../config/nginx/nginx.conf.bak'

nginx_conf_file_name = f'D:\\projects\\crmsis-1\\config\\nginx\\nginx.conf'
backup_nginx_conf_file_name = f'D:\\projects\\crmsis-1\\config\\nginx\\nginx.conf.bak'

shutil.copyfile(nginx_conf_file_name, backup_nginx_conf_file_name)
print(f'Backup of nginx config saved as {backup_nginx_conf_file_name}')

with open(nginx_conf_file_name, 'r') as file:
    nginx_conf_file_content = file.read()

new_location_config = f"""
      location /v1/webhook/{customer_name} {{
            proxy_pass http://sb_b_app_wh_{customer_name};
      }}
      location /api/{customer_name}{{
          proxy_pass http://sb_b_app_{customer_name}:8080;
      }}
#ADD_NEXT_LOCATION_HERE
"""

nginx_conf_file_content = nginx_conf_file_content.replace('#ADD_NEXT_LOCATION_HERE', new_location_config)
with open(nginx_conf_file_name, 'w') as file:
    file.write(nginx_conf_file_content)

print(f'Nginx config updated with new location for {customer_name}')

print(f'Docker compose file saved as {output_file_name}')
