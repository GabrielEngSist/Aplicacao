-- liquibase formatted sql
-- changeset gabriel.oliveira:2.0 dbms:mysql

INSERT INTO aplicacao.company (name, document, age, vacancies, site) VALUES
('Empresa 1','123456789','1','1','www.empresa1.com.br'),
('Empresa 2','3215468789','1','4','www.empresa2.com.br'),
('Empresa 3','87454512135','1','1','www.empresa3.com.br'),
('Empresa 4','987512231','1','5','www.empresa4.com.br'),
('Empresa 5','231545689','1','10','www.empresa5.com.br');

-- changeset gabriel.oliveira:2.1 dbms:mysql

INSERT INTO aplicacao.user (name, document, age, login, password, company_id, salary) VALUES
('Usuário 1','6544848956','20','user1','user1','1','2000.00'),
('Usuário 2','54532454353','23','user2','user2','2','2430.10'),
('Usuário 3','12421342134','54','user3','user3','5','5000.00'),
('Usuário 4','2312342423','32','user4','user4','4','4030.80'),
('Usuário 5','656346431','33','user5','user5','5','5340.50'),
('Usuário 6','9876202838','43','user6','user6','5','6030.00'),
('Usuário 7','9876534567','52','user7','user7','2','1570.44'),
('Usuário 8','2356343234','18','user8','user8','3','5630.05'),
('Usuário 9','2343675434','23','user9','user9','5','4543.50'),
('Usuário 10','2145566576','32','user10','user10','2','6216.10'),
('Usuário 11','8799898789','53','user11','user11','5','4805.00'),
('Usuário 12','78974654632','25','user12','user12','5','7582.00'),
('Usuário 13','6568655453','45','user13','user13','2','5820.40'),
('Usuário 14','53456798726','29','user14','user14','5','2850.97');