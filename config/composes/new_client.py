#!/usr/bin/env python3

import sys
import mysql.connector
import os
from dotenv import load_dotenv


load_dotenv()
# Read input data
full_name = input("FULL_NAME: ")
url = input("URL: ")
url_path = input("URL_PATH: ")
api_token = input("API_TOKEN: ")

# Insert data into MySQL database
db_config = {
    'user': os.getenv('SB_APP_MYSQL_USER'),
    'password': os.getenv('SB_APP_MYSQL_PASSWORD'),
    'host': "localhost",
    'port': os.getenv('SB_APP_MYSQL_PORT'),
    'database': 'SB_APP'
}

conn = mysql.connector.connect(**db_config)


cursor = conn.cursor()

# Check for existing URL_PATH
check_query = "SELECT COUNT(*) FROM CUSTOMERS WHERE URL_PATH = %s"
cursor.execute(check_query, (url_path,))
if cursor.fetchone()[0] > 0:
    print(f"Error: A record with URL_PATH '{url_path}' already exists.")
    cursor.close()
    conn.close()
    exit(1)

insert_query = """
INSERT INTO CUSTOMERS (FULL_NAME, URL, URL_PATH, API_TOKEN)
VALUES (%s, %s, %s, %s)
"""
cursor.execute(insert_query, (full_name, url, url_path, api_token))
conn.commit()

cursor.close()
conn.close()

# Process docker-compose file
with open('docker-compose-sb-b-app.yml', 'r') as file:
    docker_compose_content = file.read()

docker_compose_content = docker_compose_content.replace('$@{SB_APP_URL_PATH}', url_path)
docker_compose_content = docker_compose_content.replace('$@{SB_APP_TOKEN}', api_token)

output_file_name = f'docker-compose-sb-b-app-{url_path}.yml'
with open(output_file_name, 'w') as file:
    file.write(docker_compose_content)

print(f'Docker compose file saved as {output_file_name}')


