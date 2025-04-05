CREATE DATABASE SB_ADMIN;
GRANT ALL PRIVILEGES ON SB_ADMIN.* TO 'sb_usr'@'%';

USE SB_ADMIN;

create table CUSTOMERS
(
    ID            bigint auto_increment
        primary key,
    URL           text                               not null,
    FULL_NAME     text                               not null,
    CUSTOMER_NAME char(50)                           null,
    CREATED_AT    datetime default CURRENT_TIMESTAMP not null,
    API_TOKEN     text                               not null,
    DELETED       datetime                           null
);

ALTER TABLE CUSTOMERS
    AUTO_INCREMENT = 1;













