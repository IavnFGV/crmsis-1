from textual.app import App, ComposeResult
from textual.widgets import Input, Button, Static
from textual.message import Message
from textual.containers import Vertical

import mysql.connector
import os
from dotenv import load_dotenv
import logging

from commands.helpers import create_db, generate_compose_file, update_nginx_config

# Настройка логирования
logging.basicConfig(
    filename="debug_add.log",
    filemode="a",
    level=logging.DEBUG,
    format="%(asctime)s [%(levelname)s] %(message)s"
)

class AddClientApp(App):
    """Add new client form"""

    CSS_PATH = None

    def compose(self) -> ComposeResult:
        yield Static("Add New Client", classes="title")
        yield Input(placeholder="Full Name", id="full_name")
        yield Input(placeholder="Pipedrive URL", id="url")
        yield Input(placeholder="CUSTOMER_NAME", id="customer_name")
        yield Input(placeholder="API Token", id="token", password=True)
        yield Button("Submit", id="submit")
        yield Static("⬇️ Press Ctrl+C to exit", id="footer")
        yield Static("", id="message")

    def connect_db(self, user_key, pass_key, port_key, db_name=None):
        if(user_key=="root"):
            user="root"
        else:
            user=os.getenv(user_key)
        return mysql.connector.connect(
            user=user,
            password=os.getenv(pass_key),
            host="localhost",
            port=os.getenv(port_key),
            database=db_name
        )

    def customer_exists(self, cursor, customer_name):
        logging.debug(f"Checking if customer '{customer_name}' exists in DB...")
        cursor.execute("SELECT COUNT(*) FROM CUSTOMERS WHERE CUSTOMER_NAME = %s", (customer_name,))
        result = cursor.fetchone()
        logging.debug(f"Result from DB: {result}")
        return result and result[0] > 0

    def insert_customer(self, cursor, full_name, url, customer_name, token):
        logging.debug(f"Inserting customer '{customer_name}' into DB...")
        cursor.execute(
            "INSERT INTO CUSTOMERS (FULL_NAME, URL, CUSTOMER_NAME, API_TOKEN) VALUES (%s, %s, %s, %s)",
            (full_name, url, customer_name, token)
        )

    async def on_button_pressed(self, event: Button.Pressed):
        full_name = self.query_one("#full_name", Input).value.strip()
        url = self.query_one("#url", Input).value.strip()
        customer_name = self.query_one("#customer_name", Input).value.strip()
        token = self.query_one("#token", Input).value.strip()
        msg = self.query_one("#message", Static)

        logging.debug(f"Submitted data: full_name='{full_name}', url='{url}', customer_name='{customer_name}'")

        if not all([full_name, url, customer_name, token]):
            msg.update("❌ All fields must be filled.")
            return

        load_dotenv()

        try:
            admin_conn = self.connect_db("SB_ADMIN_MYSQL_USER", "SB_ADMIN_MYSQL_PASSWORD", "SB_ADMIN_MYSQL_PORT", "SB_ADMIN")
            admin_cursor = admin_conn.cursor()

            if self.customer_exists(admin_cursor, customer_name):
                msg.update(f"⚠️ CUSTOMER_NAME '{customer_name}' already exists in DB.")
                return

            self.insert_customer(admin_cursor, full_name, url, customer_name, token)
            admin_conn.commit()
            admin_cursor.close()
            admin_conn.close()

            # Создание баз
            root_conn = self.connect_db("root", "SB_CLIENTS_BACK_MYSQL_ROOT_PASSWORD", "SB_CLIENTS_BACK_MYSQL_PORT")
            root_cursor = root_conn.cursor()

            pd_db = create_db(root_cursor, "SB_PD", customer_name, "sb_usr")
            wh_db = create_db(root_cursor, "SB_WH", customer_name, "sb_usr")
            root_conn.commit()
            root_cursor.close()
            root_conn.close()

            # Генерация docker-compose
            replacements = {
                "$@{SB_APP_URL_PATH}": customer_name,
                "$@{SB_NEW_DATABASE_NAME}": pd_db,
                "$@{SB_NEW_WH_DATABASE_NAME}": wh_db,
                "$@{SB_APP_TOKEN}": token,
                "$@{CUSTOMER_FULL_NAME}": full_name,
                "$@{CUSTOMER_NAME}": customer_name,
                "$@{SERVICE_SUFFIX}": customer_name
            }

            generate_compose_file(
                "../../composes/docker-compose-sb-b-app-template.yml",
                f"../../composes/docker-compose-sb-b-app-{customer_name}.yml",
                replacements
            )

            generate_compose_file(
                "../../composes/docker-compose-sb-b-app-wh-template.yml",
                f"../../composes/docker-compose-sb-b-app-wh-{customer_name}.yml",
                replacements
            )

            # Обновление nginx
            update_nginx_config(customer_name, "../../config/nginx/nginx.conf")

            msg.update(f"✅ Client '{full_name}' fully registered! Compose + DB + Nginx done.")

        except Exception as e:
            logging.exception("Exception occurred:")
            msg.update(f"❌ Error: {e}")
