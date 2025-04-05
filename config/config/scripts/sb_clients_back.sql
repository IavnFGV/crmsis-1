USE CLIENTS_BACK;
create table DEALS
(
    id                  bigint auto_increment
        primary key,
    ID_PIPEDRIVE        bigint       not null,
    ACV                 int          null,
    ADD_TIME            datetime(6)  null,
    ARR                 int          null,
    CHANNEL_ID          varchar(255) null,
    CLOSE_TIME          datetime(6)  null,
    CREATOR_USER_ID     bigint       null,
    CURRENCY            varchar(255) null,
    custom_fields       varchar(255) null,
    EXPECTED_CLOSE_DATE date         null,
    IS_DELETED          bit          null,
    LABEL_IDS_STR       varchar(255) null,
    LOCAL_CLOSE_DATE    date         null,
    LOCAL_LOST_DATE     date         null,
    LOCAL_WON_DATE      date         null,
    LOST_REASON         varchar(255) null,
    LOST_TIME           datetime(6)  null,
    MRR                 int          null,
    ORG_ID              bigint       null,
    ORIGIN              varchar(255) null,
    ORIGIN_ID           varchar(255) null,
    OWNER_ID            bigint       null,
    PERSON_ID           bigint       null,
    PIPELINE_ID         bigint       null,
    PROBABILITY         int          null,
    STAGE_CHANGE_TIME   datetime(6)  null,
    STAGE_ID            bigint       null,
    STATUS              varchar(255) null,
    TITLE               varchar(255) not null,
    UPDATE_TIME         datetime(6)  null,
    VALUE               double       null,
    VISIBLE_TO          int          null,
    WON_TIME            datetime(6)  null,
    constraint U_ID_P_DEALS
        unique (ID_PIPEDRIVE)
);



create table DEAL_FIELDS
(
    id                           bigint auto_increment
        primary key,
    ACTIVE_FLAG                  bit           null,
    ADD_TIME                     datetime(6)   null,
    ADD_VISIBLE_FLAG             bit           null,
    BULK_EDIT_ALLOWED            bit           null,
    CREATED_BY_USER_ID           int           null,
    DESCRIPTION                  varchar(255)  null,
    DETAILS_VISIBLE_FLAG         bit           null,
    EDIT_FLAG                    bit           null,
    FIELD_TYPE                   varchar(255)  not null,
    FILTERING_ALLOWED            bit           null,
    GROUP_ID                     int           null,
    ID_PIPEDRIVE                 bigint        null,
    ID_PARENT_PIPEDRIVE          bigint        null,
    IMPORTANT_FLAG               bit           null,
    JSON_COLUMN_FLAG             bit           null,
    KEY_FIELD                    varchar(255)  not null,
    LAST_UPDATED_BY_USER_ID      int           null,
    MANDATORY_FLAG               varchar(255)  null,
    NAME                         varchar(255)  not null,
    options                      varchar(1000) null,
    ORDER_NR                     int           null,
    PIPELINE_IDS                 varchar(500)  null,
    PROJECTS_DETAIL_VISIBLE_FLAG bit           null,
    SEARCHABLE_FLAG              bit           null,
    SHOW_IN_ALL                  bit           null,
    SORTABLE_FLAG                bit           null,
    UPDATE_TIME                  datetime(6)   null,
    INDEX I_ID_P_DEAL_FIELDS(ID_PIPEDRIVE),
    INDEX I_ID_P_P_DEAL_FIELDS(ID_PARENT_PIPEDRIVE)
);


create table PIPELINES
(
    id                          bigint auto_increment
        primary key,
    ID_PIPEDRIVE                bigint       not null,
    ADD_TIME                    datetime(6)  null,
    IS_DEAL_PROBABILITY_ENABLED bit          null,
    IS_DELETED                  bit          null,
    IS_SELECTED                 bit          null,
    name                        varchar(255) not null,
    ORDER_NR                    int          null,
    UPDATE_TIME                 datetime(6)  null,
    constraint U_ID_P_PIPELINES
        unique (ID_PIPEDRIVE)
);


create table PROCESSED_REQUESTS
(
    id             bigint auto_increment
        primary key,
    COMMENTS       mediumtext  not null,
    CUSTOMER_NAME  varchar(50) null,
    PROCESSED_AT   datetime(6) not null,
    PROCESSED_DATA mediumtext  not null,
    REQUEST_ID     bigint      null
);

create table STAGES
(
    id                  bigint auto_increment
        primary key,
    ID_PIPEDRIVE        bigint       not null,
    ADD_TIME            datetime(6)  null,
    DAYS_TO_ROTTEN      int          null,
    DEAL_PROBABILITY    int          null,
    IS_DEAL_ROT_ENABLED bit          null,
    IS_DELETED          bit          null,
    NAME                varchar(255) not null,
    ORDER_NR            int          not null,
    PIPELINE_ID         bigint       null,
    UPDATE_TIME         datetime(6)  null,
    constraint U_ID_P_STAGES
        unique (ID_PIPEDRIVE)
);



