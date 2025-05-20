import os
import requests
import logger

logger = logger.get_logger()

def load_file(url: str, path: str, force_load: bool = False) -> None:
    """
    Downloads a file from a URL if it does not exist locally, or overwrites it if force_load is True.

    :param url: URL of the file to download
    :param path: Local file path to save the downloaded file
    :param force_load: If True, delete existing file and re-download
    """
    # Check if the file already exists
    if os.path.exists(path):
        if force_load:
            try:
                os.remove(path)
                logger.info(f"Existing file '{path}' was removed (force_load=True).")
            except OSError as e:
                logger.error(f"Failed to remove existing file '{path}': {e}")
                return
        else:
            logger.warning(f"File '{path}' already exists — skipping download.")
            return

    try:
        logger.info(f"Downloading file from {url}...")
        response = requests.get(url, stream=True)
        response.raise_for_status()  # Raise error for bad status codes

        with open(path, "wb") as f:
            for chunk in response.iter_content(chunk_size=8192):
                if chunk:
                    f.write(chunk)

        logger.info(f"File successfully downloaded and saved as '{path}'.")
    except requests.RequestException as e:
        logger.error(f"Download failed from {url}: {e}")

