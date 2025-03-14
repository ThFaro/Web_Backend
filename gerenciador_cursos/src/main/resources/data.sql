CREATE TABLE IF NOT EXISTS curso (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    carga_horaria INT NOT NULL,
    data_criacao DATE NOT NULL
);

INSERT INTO curso (nome, carga_horaria, data_criacao) VALUES 
('Introdução ao Spring Boot', 40, '2024-01-10'),
('Banco de Dados com JPA', 60, '2023-12-05'),
('Desenvolvimento Web com Angular', 80, '2023-11-15'),
('Machine Learning para Iniciantes', 100, '2023-10-20'),
('API RESTful com Java', 50, '2024-02-01');
