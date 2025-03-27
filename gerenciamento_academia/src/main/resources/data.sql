CREATE TABLE IF NOT EXISTS funcionarios (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cargo VARCHAR(100) NOT NULL,
    data_contratacao DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS alunos (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    data_matricula DATE NOT NULL,
    plano VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS aluno_funcionario (
    aluno_id BIGINT NOT NULL,
    funcionario_id BIGINT NOT NULL,
    PRIMARY KEY (aluno_id, funcionario_id),
    FOREIGN KEY (aluno_id) REFERENCES alunos(id),
    FOREIGN KEY (funcionario_id) REFERENCES funcionarios(id)
);

CREATE TABLE IF NOT EXISTS historico_treinos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(200) NOT NULL,
    data DATE NOT NULL,
    aluno_id BIGINT NOT NULL,
    FOREIGN KEY (aluno_id) REFERENCES alunos(id)
);

INSERT INTO funcionarios (id, nome, cargo, data_contratacao) VALUES 
(1, 'Carlos Silva', 'Instrutor', CURRENT_DATE),
(2, 'Fernanda Costa', 'Instrutor', CURRENT_DATE),
(3, 'João Oliveira', 'Instrutor', CURRENT_DATE);

INSERT INTO alunos (id, nome, idade, data_matricula, plano) VALUES 
(1, 'Ana Souza', 25, CURRENT_DATE, 'Mensal'),
(2, 'Bruno Lima', 30, CURRENT_DATE, 'Trimestral'),
(3, 'Clara Dias', 22, CURRENT_DATE, 'Anual'),
(4, 'Diego Nunes', 28, CURRENT_DATE, 'Mensal'),
(5, 'Eduarda Rocha', 35, CURRENT_DATE, 'Trimestral');

INSERT INTO aluno_funcionario (aluno_id, funcionario_id) VALUES 
(1, 1),
(2, 1),
(3, 2),
(4, 2),
(5, 3),
(1, 2); 

INSERT INTO historico_treinos (descricao, data, aluno_id) VALUES 
('Treino A - Peito e tríceps', CURRENT_DATE, 1),
('Treino B - Costas e bíceps', CURRENT_DATE, 2),
('Treino C - Pernas', CURRENT_DATE, 3),
('Treino D - Cardio', CURRENT_DATE, 4),
('Treino E - Full Body', CURRENT_DATE, 5);
