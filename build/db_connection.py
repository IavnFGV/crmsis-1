from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from sqlalchemy.ext.declarative import declarative_base
import os
from dotenv import load_dotenv
# Загрузка переменных окружения
# load_dotenv()
# Конфигурация подключения к БД
db_config = {

}
# Создание URL для подключения
DATABASE_URL = f"mysql+mysqlconnector://{db_config['user']}:{db_config['password']}@{db_config['host']}:{db_config['port']}/{db_config['database']}"
# Создание движка SQLAlchemy
engine = create_engine(DATABASE_URL)
engine.execution_options(stream_results=True)
Session = sessionmaker(bind=engine)
Base = declarative_base()
