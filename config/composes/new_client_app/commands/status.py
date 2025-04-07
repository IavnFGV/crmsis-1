from textual.app import App, ComposeResult
from textual.widgets import Static, DataTable
from textual.containers import Vertical
from dotenv import load_dotenv
import mysql.connector
import os

class StatusApp(App):
    """Show client list from database"""

    def compose(self) -> ComposeResult:
        yield Static("📋 List of Registered Clients", classes="title")
        table = DataTable(id="client_table")
        table.add_columns("ID", "Full Name", "Customer", "URL")
        yield table

    def connect_db(self):
        return mysql.connector.connect(
            user=os.getenv("SB_ADMIN_MYSQL_USER"),
            password=os.getenv("SB_ADMIN_MYSQL_PASSWORD"),
            host="localhost",
            port=os.getenv("SB_ADMIN_MYSQL_PORT"),
            database="SB_ADMIN"
        )

    def on_mount(self):
        load_dotenv()
        try:
            conn = self.connect_db()
            cursor = conn.cursor()
            cursor.execute("SELECT ID, FULL_NAME, CUSTOMER_NAME, URL FROM CUSTOMERS ORDER BY ID DESC")
            rows = cursor.fetchall()
            table = self.query_one("#client_table", DataTable)
            for row in rows:
                table.add_row(*[str(cell) for cell in row])
        except Exception as e:
            self.exit(f"❌ Error: {e}")
        finally:
            if 'cursor' in locals(): cursor.close()
            if 'conn' in locals(): conn.close()
