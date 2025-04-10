INSERT INTO cliente (id, nome, cpf, celular) VALUES (1, 'Ana Paula Silva', '12345678901', '11988887777');
INSERT INTO cliente (id, nome, cpf, celular) VALUES (2, 'Carlos Henrique', '23456789012', '11999998888');
INSERT INTO cliente (id, nome, cpf, celular) VALUES (3, 'Beatriz Mendes', '34567890123', '11977776666');
INSERT INTO cliente (id, nome, cpf, celular) VALUES (4, 'Fernando Oliveira', '45678901234', '11966665555');
INSERT INTO cliente (id, nome, cpf, celular) VALUES (5, 'Juliana Rocha', '56789012345', '11955554444');

INSERT INTO animal (id, cliente_id, especie, nome, idade, cor, observacao) VALUES (1, 1, 'Cão', 'Rex', 3, 'Marrom', 'Sociável e dócil');
INSERT INTO animal (id, cliente_id, especie, nome, idade, cor, observacao) VALUES (2, 1, 'Gato', 'Mimi', 2, 'Preto', 'Assustado com barulhos');
INSERT INTO animal (id, cliente_id, especie, nome, idade, cor, observacao) VALUES (3, 2, 'Cão', 'Thor', 5, 'Preto', 'Agressivo com estranhos');
INSERT INTO animal (id, cliente_id, especie, nome, idade, cor, observacao) VALUES (4, 2, 'Cão', 'Luna', 1, 'Branca', 'Filhote');
INSERT INTO animal (id, cliente_id, especie, nome, idade, cor, observacao) VALUES (5, 3, 'Gato', 'Tigrinho', 4, 'Cinza', 'Fugiu uma vez');
INSERT INTO animal (id, cliente_id, especie, nome, idade, cor, observacao) VALUES (6, 3, 'Gato', 'Nina', 6, 'Branco', 'Calma');
INSERT INTO animal (id, cliente_id, especie, nome, idade, cor, observacao) VALUES (7, 4, 'Cão', 'Bob', 7, 'Caramelo', 'Castrado');
INSERT INTO animal (id, cliente_id, especie, nome, idade, cor, observacao) VALUES (8, 4, 'Cão', 'Sasha', 2, 'Preto e Branco', 'Ativa');
INSERT INTO animal (id, cliente_id, especie, nome, idade, cor, observacao) VALUES (9, 5, 'Gato', 'Bolota', 8, 'Cinza', 'Come muito');
INSERT INTO animal (id, cliente_id, especie, nome, idade, cor, observacao) VALUES (10, 5, 'Cão', 'Princesa', 3, 'Dourado', 'Muito carinhosa');

INSERT INTO produto (id, descricao, categoria, validade, preco) VALUES (1, 'Ração Cães Adultos 10kg', 'Ração', '2025-12-31', 99.90);
INSERT INTO produto (id, descricao, categoria, validade, preco) VALUES (2, 'Ração Gatos 5kg', 'Ração', '2025-10-15', 59.90);
INSERT INTO produto (id, descricao, categoria, validade, preco) VALUES (3, 'Coleira Antipulgas', 'Acessórios', NULL, 29.90);
INSERT INTO produto (id, descricao, categoria, validade, preco) VALUES (4, 'Shampoo para Pelos Claros', 'Acessórios', NULL, 22.50);
INSERT INTO produto (id, descricao, categoria, validade, preco) VALUES (5, 'Vacina V8', 'Medicamento', '2026-03-20', 120.00);
INSERT INTO produto (id, descricao, categoria, validade, preco) VALUES (6, 'Antibiótico Pet', 'Medicamento', '2025-06-01', 45.00);
INSERT INTO produto (id, descricao, categoria, validade, preco) VALUES (7, 'Coleira LED Noturna', 'Acessórios', NULL, 35.00);
INSERT INTO produto (id, descricao, categoria, validade, preco) VALUES (8, 'Petisco Natural', 'Ração', '2025-09-01', 19.90);

INSERT INTO servico (id, descricao, tipo, preco, tempo_duracao) VALUES (1, 'Banho tradicional em cão', 'Banho', 40.00, 45);
INSERT INTO servico (id, descricao, tipo, preco, tempo_duracao) VALUES (2, 'Tosa completa em cão', 'Tosa', 70.00, 60);
INSERT INTO servico (id, descricao, tipo, preco, tempo_duracao) VALUES (3, 'Consulta clínica veterinária', 'Consulta Veterinária', 120.00, 30);
INSERT INTO servico (id, descricao, tipo, preco, tempo_duracao) VALUES (4, 'Banho e tosa em gato', 'Banho', 60.00, 50);
INSERT INTO servico (id, descricao, tipo, preco, tempo_duracao) VALUES (5, 'Aplicação de vacina', 'Consulta Veterinária', 80.00, 20);
INSERT INTO servico (id, descricao, tipo, preco, tempo_duracao) VALUES (6, 'Hidratação de pelos', 'Tosa', 50.00, 40);
