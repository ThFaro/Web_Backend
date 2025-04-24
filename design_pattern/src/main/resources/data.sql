INSERT INTO sabores (nome, descricao) VALUES 
('Chocolate', 'Bolo com cobertura de chocolate belga.'),
('Baunilha', 'Bolo leve com essência de baunilha.'),
('Morango', 'Bolo recheado com creme e morangos frescos.');

INSERT INTO clientes (nome, cpf, telefone) VALUES 
('Ana Clara', '12345678900', '11999990001'),
('Bruno Silva', '98765432100', '11999990002'),
('Carlos Lima', '45678912300', '11999990003');

INSERT INTO pedidos (cliente_id, sabor_bolo_id, status) VALUES 
(1, 1, 'Pendente'),
(2, 2, 'Em Produção'),
(3, 3, 'Entregue'),
(1, 3, 'Pronto');
