CREATE TABLE IF NOT EXISTS medicamento (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    laboratorio VARCHAR(200) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    data_validade DATE NOT NULL
);

INSERT INTO medicamento (nome, laboratorio, preco, data_validade) VALUES 
('Paracetamol', 'MedPharma', 15.50, '2025-12-31'),
('Dipirona', 'BioSaúde', 10.75, '2024-08-15'),
('Ibuprofeno', 'Genéricos SA', 20.00, '2026-05-20'),
('Amoxicilina', 'Farmalab', 35.90, '2025-07-10'),
('Losartana', 'MedPharma', 18.60, '2026-09-05');
