INSERT INTO clientes (nome_empresa, cnpj, contato) VALUES 
('TechSolvers', '12345678000100', 'contato@techsolvers.com'),
('InovaTI', '98765432000199', 'projetos@inovati.com');

INSERT INTO colaboradores (nome, cargo, email) VALUES 
('Ana Martins', 'Analista de Sistemas', 'ana.martins@empresa.com'),
('Bruno Souza', 'Desenvolvedor Backend', 'bruno.souza@empresa.com'),
('Carla Dias', 'Desenvolvedora Frontend', 'carla.dias@empresa.com'),
('Diego Lima', 'Gerente de Projetos', 'diego.lima@empresa.com'),
('Eduardo Ramos', 'QA Tester', 'eduardo.ramos@empresa.com');

INSERT INTO projetos (nome, descricao, status, cliente_id) VALUES
('Sistema de Gestão Escolar', 'Desenvolvimento de uma plataforma para escolas.', 'Em Desenvolvimento', 1),
('Plataforma de E-commerce', 'Loja virtual com integração de pagamentos.', 'Planejamento', 2),
('Dashboard Corporativo', 'Painel de indicadores de desempenho.', 'Concluído', 1);

INSERT INTO projetos_colaboradores (projeto_id, colaborador_id) VALUES
(1, 1), (1, 2), (1, 4), 
(2, 3), (2, 4), 
(3, 1), (3, 5);
