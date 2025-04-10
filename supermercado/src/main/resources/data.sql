INSERT INTO clientes (id, cpf, celular, nome) VALUES
(1, '12345678901', '11999990001', 'José Antônio Souza e Cruz'),
(2, '12345678902', '11999990002', 'Maria Fernanda Lopes'),
(3, '12345678903', '11999990003', 'Carlos Silva'),
(4, '12345678904', '11999990004', 'Ana Paula Lima'),
(5, '12345678905', '11999990005', 'João Pedro Martins'),
(6, '12345678906', '11999990006', 'Cláudia Rodrigues'),
(7, '12345678907', '11999990007', 'Rafael Oliveira'),
(8, '12345678908', '11999990008', 'Beatriz Ferreira'),
(9, '12345678909', '11999990009', 'Marcos Aurélio'),
(10, '12345678910', '11999990010', 'Sofia Mendes');

INSERT INTO produtos (id, descricao, preco, setor, validade) VALUES
(1001, 'Leite Integral', 5.50, 'Laticínios', '2025-06-10'),
(1002, 'Queijo Mussarela', 32.50, 'Laticínios', '2025-06-20'),
(1003, 'Refrigerante Cola', 7.00, 'Bebidas', '2025-09-15'),
(1004, 'Água Mineral', 2.50, 'Bebidas', '2026-01-01'),
(1005, 'Sabonete Neutro', 1.80, 'Higiene', '2026-12-31'),
(1006, 'Iogurte Natural', 3.20, 'Laticínios', '2025-05-10'),
(1007, 'Cerveja Pilsen', 4.90, 'Bebidas', '2025-12-01'),
(1008, 'Creme Dental', 4.50, 'Higiene', '2027-01-01'),
(1009, 'Desodorante Roll-on', 6.75, 'Higiene', '2027-06-30'),
(1010, 'Manteiga', 9.80, 'Laticínios', '2025-04-19'),
(1011, 'Requeijão', 7.90, 'Laticínios', '2025-08-10'),
(1012, 'Vinho Tinto', 42.00, 'Bebidas', '2030-12-31'),
(1013, 'Água com Gás', 3.00, 'Bebidas', '2026-03-01'),
(1014, 'Shampoo', 10.00, 'Higiene', '2027-02-28'),
(1015, 'Achocolatado', 6.50, 'Laticínios', '2025-06-01');

INSERT INTO vendas (id, cliente_id, produto_id, descricao_produto, quantidade, preco_produto, valor_total, data_venda) VALUES
(1, 1, 1012, 'Vinho Tinto', 40, 42.00, 1680.00, '2025-01-15T10:30:00'),
(2, 2, 1002, 'Queijo Mussarela', 1, 32.50, 32.50, '2025-02-01T14:00:00'),
(3, 1, 1001, 'Leite Integral', 10, 5.50, 55.00, '2025-01-20T11:00:00'),
(4, 3, 1010, 'Manteiga', 2, 9.80, 19.60, '2025-01-30T16:15:00'),
(5, 4, 1004, 'Água Mineral', 20, 2.50, 50.00, '2025-03-25T12:00:00'),
(6, 5, 1012, 'Vinho Tinto', 10, 42.00, 420.00, '2025-04-05T09:45:00'),
(7, 6, 1008, 'Creme Dental', 4, 4.50, 18.00, '2025-03-01T13:20:00'),
(8, 7, 1003, 'Refrigerante Cola', 6, 7.00, 42.00, '2025-01-10T17:00:00');
