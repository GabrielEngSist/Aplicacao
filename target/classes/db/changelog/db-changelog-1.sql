-- liquibase formatted sql
-- changeset gabriel.oliveira:1.0 dbms:mysql

CREATE DATABASE IF NOT EXISTS aplicacao;
CREATE TABLE IF NOT EXISTS aplicacao.address(
    id          BIGINT NOT NULL AUTO_INCREMENT,
    zip_code         VARCHAR(8) NOT NULL,
    street  VARCHAR(100) NOT NULL,
    number      VARCHAR(10) NOT NULL,
    state      VARCHAR(2) NOT NULL,
    city      VARCHAR(100) NOT NULL,
    country        VARCHAR(45) NOT NULL,
    PRIMARY KEY (id));

-- changeset gabriel.oliveira:1.1 dbms:mysql

CREATE TABLE IF NOT EXISTS aplicacao.company (
    id          BIGINT NOT NULL AUTO_INCREMENT,
    name        VARCHAR(45) NOT NULL,
    document   VARCHAR(45) NOT NULL,
    age       INT(2) NOT NULL,
    vacancies       INT(10) NULL DEFAULT 0,
    site        VARCHAR(100) NULL,
    address_id BIGINT DEFAULT NULL,
    PRIMARY KEY (id),
    INDEX fk_company_address1_idx (address_id ASC),
    CONSTRAINT fk_company_address1
        FOREIGN KEY (address_id)
            REFERENCES aplicacao.address (id)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION);

-- changeset gabriel.oliveira:1.2 dbms:mysql

CREATE TABLE IF NOT EXISTS aplicacao.user (
    id          BIGINT NOT NULL AUTO_INCREMENT,
    name        VARCHAR(45) NOT NULL,
    document   VARCHAR(45) NOT NULL,
    age       INT(2) NOT NULL,
    login       VARCHAR(45) NOT NULL,
    password       VARCHAR(45) NOT NULL,
    salary     DECIMAL(12,2) NULL DEFAULT 0,
    company_id  BIGINT NOT NULL,
    address_id BIGINT DEFAULT NULL,
    PRIMARY KEY (id),
    INDEX fk_usuario_empresa_idx (company_id ASC),
    INDEX fk_usuario_endereco1_idx (address_id ASC),
    CONSTRAINT fk_usuario_empresa
        FOREIGN KEY (company_id)
            REFERENCES aplicacao.company(id)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT fk_usuario_endereco1
        FOREIGN KEY (address_id)
            REFERENCES aplicacao.address (id)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION);