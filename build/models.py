from sqlalchemy import Column, Integer, String, DateTime, JSON, Text, BigInteger
from db_connection import Base
class Event(Base):
    __tablename__ = 'EVENTS'

    id = Column(Integer, primary_key=True)
    customer_name = Column(String(50))
    request_id = Column(Integer)
    processed_data = Column(JSON, nullable=False)
    comments = Column(JSON, nullable=False)
    parent_id = Column(Integer)
    processed_at = Column(DateTime)
    created_at = Column(DateTime)


class RawRequest(Base):
    __tablename__ = 'RAW_REQUESTS'

    id = Column(BigInteger, primary_key=True, autoincrement=True)
    customer_name = Column(String(50), nullable=True, index=True)  # Indexed column
    request_data = Column(JSON, nullable=True)  # MediumText equivalent
    created_at = Column(DateTime,  nullable=False)
