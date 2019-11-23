-- liquibase formatted sql
-- changeset gabriel.oliveira:3.0 dbms:mysql
CREATE TABLE aplicacao.role
(
    id   BIGINT auto_increment,
    name VARCHAR(255) NOT NULL,
    CONSTRAINT role_pk PRIMARY KEY (id)
);

-- changeset gabriel.oliveira:3.1 dbms:mysql
INSERT INTO aplicacao.role
(name)
VALUES      ('ADMIN'),
            ('CLIENT');

-- changeset gabriel.oliveira:3.2 dbms:mysql
CREATE TABLE aplicacao.user_role
(
    id      BIGINT NOT NULL auto_increment,
    user_id BIGINT,
    role_id BIGINT,
    CONSTRAINT user_role_pk PRIMARY KEY (id),
    CONSTRAINT user_role_user_fk FOREIGN KEY (user_id) REFERENCES
        aplicacao.user(id),
    CONSTRAINT user_role_role_fk FOREIGN KEY (role_id) REFERENCES
        aplicacao.role(id)
);

-- changeset gabriel.oliveira:3.3 dbms:mysql
ALTER TABLE aplicacao.user
    CHANGE login username VARCHAR(255) NOT NULL;