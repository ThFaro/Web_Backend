CREATE TABLE IF NOT EXISTS tarefa (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    concluida BOOLEAN NOT NULL
);

INSERT INTO tarefa (descricao, concluida) VALUES 
('Finalizar o relatório de vendas', false),
('Estudar para a prova de Spring Boot', false),
('Revisar o código da API', true),
('Enviar e-mail para equipe', true),
('Preparar apresentação do projeto', false);