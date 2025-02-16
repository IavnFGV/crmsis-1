USE CRMSIS;

CREATE TABLE RAW_REQUESTS
(
    ID            BIGINT AUTO_INCREMENT PRIMARY KEY,
    CUSTOMER_NAME CHAR(50),
    REQUEST_DATA  MEDIUMTEXT NOT NULL,
    CREATED_AT    DATETIME   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    INDEX IDX_CUSTOMER_NAME (CUSTOMER_NAME)
);

ALTER TABLE RAW_REQUESTS
    AUTO_INCREMENT = 1;


CREATE TABLE IF NOT EXISTS CUSTOMERS
(
    ID            BIGINT AUTO_INCREMENT PRIMARY KEY,
    URL           TEXT     NOT NULL,
    FULL_NAME     TEXT     NOT NULL,
    CUSTOMER_NAME CHAR(50),
    CREATED_AT    DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    API_TOKEN     TEXT     NOT NULL,
    DELETED       DATETIME
);

ALTER TABLE CUSTOMERS
    AUTO_INCREMENT = 1;

