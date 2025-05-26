import os
import script_executor

from file_utils import load_file

from configuration import config_map as cf

def update_open_api_files():
    get_openApi_v1()
    get_openApi_v2()


def get_openApi_v1(config_map=cf, force_load=False):
    load_file(config_map["openapi_v1"], os.path.join(config_map["storage"], "openapi_v1.yaml"),
             force_load)

def get_openApi_v2(config_map=cf, force_load=False):
    load_file(config_map["openapi_v2"], os.path.join(config_map["storage"], "openapi_v2.yaml"),
              force_load)


def rebuild_webhooks_app():
    script_executor.build_webhooks_app()
    script_executor.build_webhooks_docker_image()

def rebuild_clients_back_app():
    script_executor.build_clients_back_app()
    script_executor.build_clients_back_docker_image()


def start_database():
    script_path = f"./linux/start_all_in_one_database.sh"
    script_executor.execute_shell_command(script_path)