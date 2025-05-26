from subprocess import Popen, PIPE
import sys
import os
from threading import Thread
import logger

# Configure logger
logger = logger.get_logger("script_executor")

def stream_output(pipe, is_error: bool = False):
    for line in iter(pipe.readline, b''):
        decoded_line = line.decode().rstrip()
        if is_error:
            logger.error(decoded_line)
        else:
            logger.info(decoded_line)

def execute_shell_command(command: str, check_return: bool = True) -> int:
    logger.info(f"Executing command: {command}")

    p = Popen(
        command,
        stdout=PIPE,
        stderr=PIPE,
        shell=True,
        bufsize=1,
        universal_newlines=False  # Keep as bytes for proper encoding handling
    )

    # Create and start output threads
    stdout_thread = Thread(target=stream_output, args=(p.stdout, False))
    stderr_thread = Thread(target=stream_output, args=(p.stderr, True))

    stdout_thread.start()
    stderr_thread.start()

    # Wait for process to complete
    return_code = p.wait()

    # Wait for output threads to complete
    stdout_thread.join()
    stderr_thread.join()

    if check_return and return_code != 0:
        raise Exception(f"Command '{command}' failed with return code {return_code}")

    return return_code

def get_script_extension():
    return ("windows", ".bat") if sys.platform == "win32" else ("linux", ".sh")

def run_dual_script(script_name: str, check_return: bool = True) -> int:
    script_ext = get_script_extension()
    script_path = f"./{script_ext[0]}/{script_name}{script_ext[1]}"

    # Make script executable on Linux
    if sys.platform != "win32":
        os.chmod(script_path, 0o755)

    return execute_shell_command(script_path, check_return)

def build_webhooks_app():
    return run_dual_script("build_webhooks")

def build_webhooks_docker_image():
    return run_dual_script("build_webhooks_docker_image", check_return=False)

def build_clients_back_app():
    return run_dual_script("build_clients_back")

def build_clients_back_docker_image():
    return run_dual_script("build_clients_back_docker_image", check_return=False)

