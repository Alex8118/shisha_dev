CREATE TABLE IF NOT EXISTS tobacco
(
    id                       int          NOT NULL AUTO_INCREMENT,
    trade_mark               varchar(255),
    name                     varchar(255),
    taste                    varchar(255),
    weight                   int,
    type_of_leaf             varchar(255),
    heart_resistance         varchar(255),
    country                  varchar(255),
    taste_estimate           DOUBLE,
    dur_of_smok_estimate     DOUBLE,
    smokiness_estimate       DOUBLE,
    package_estimate         DOUBLE,
    comfort_in_work_estimate DOUBLE,
    total_estimate           DOUBLE,
    tobacco_url              varchar(255),
    created_date             datetime     DEFAULT NULL,
    last_modified_date       datetime     DEFAULT NULL,
    PRIMARY KEY (id)

) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS my_list_table
(
    id                  int          NOT NULL AUTO_INCREMENT,
    user_id             varchar(255),
    tobacco_entity_id   int,
    status              int NOT NULL,
    order_position      int,
    picture_url         varchar(255),
    created_date        datetime DEFAULT NULL,
    last_modified_date  datetime DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS tobacco_rating
(
    id                       int          NOT NULL AUTO_INCREMENT,
    user_id                  varchar(255),
    tobacco_id               int,
    taste_estimate           DOUBLE,
    dur_of_smok_estimate     DOUBLE,
    smokiness_estimate       DOUBLE,
    package_estimate         DOUBLE,
    comfort_in_work_estimate DOUBLE,
    created_date             datetime DEFAULT NULL,
    last_modified_date       datetime DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;



