-- liquibase formatted sql
-- changeset gabriel.oliveira:1.0 dbms:mysql

CREATE DATABASE IF NOT EXISTS aplicacao;
CREATE TABLE IF NOT EXISTS aplicacao.endereco (
    id          BIGINT NOT NULL AUTO_INCREMENT,
    cep         VARCHAR(8) NOT NULL,
    logradouro  VARCHAR(100) NOT NULL,
    numero      VARCHAR(10) NOT NULL,
    estado      VARCHAR(2) NOT NULL,
    cidade      VARCHAR(100) NOT NULL,
    pais        VARCHAR(45) NOT NULL,
    PRIMARY KEY (id));

-- changeset gabriel.oliveira:1.1 dbms:mysql

CREATE TABLE IF NOT EXISTS aplicacao.empresa (
    id          BIGINT NOT NULL AUTO_INCREMENT,
    nome        VARCHAR(45) NOT NULL,
    documento   VARCHAR(45) NOT NULL,
    idade       INT(2) NOT NULL,
    vagas       INT(10) NULL DEFAULT 0,
    site        VARCHAR(100) NULL,
    endereco_id BIGINT DEFAULT NULL,
    PRIMARY KEY (id),
    INDEX fk_empresa_endereco1_idx (endereco_id ASC),
    CONSTRAINT fk_empresa_endereco1
        FOREIGN KEY (endereco_id)
            REFERENCES endereco (id)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION);

-- changeset gabriel.oliveira:1.2 dbms:mysql

CREATE TABLE IF NOT EXISTS aplicacao.usuario (
    id          BIGINT NOT NULL AUTO_INCREMENT,
    nome        VARCHAR(45) NOT NULL,
    documento   VARCHAR(45) NOT NULL,
    idade       INT(2) NOT NULL,
    login       VARCHAR(45) NOT NULL,
    senha       VARCHAR(45) NOT NULL,
    salario     DECIMAL(12,2) NULL DEFAULT 0,
    empresa_id  BIGINT NOT NULL,
    endereco_id BIGINT DEFAULT NULL,
    PRIMARY KEY (id),
    INDEX fk_usuario_empresa_idx (empresa_id ASC),
    INDEX fk_usuario_endereco1_idx (endereco_id ASC),
    CONSTRAINT fk_usuario_empresa
        FOREIGN KEY (empresa_id)
            REFERENCES empresa (id)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT fk_usuario_endereco1
        FOREIGN KEY (endereco_id)
            REFERENCES endereco (id)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION);