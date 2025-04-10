package com.webbackend.petshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetshopApplication.class, args);
	}

}

/*
SELECT * FROM cliente WHERE cpf = '12345678901';
SELECT * FROM cliente WHERE celular = '11988887777';
SELECT * FROM animal WHERE cliente_id = 1;
SELECT * FROM produto WHERE categoria = 'Ração';
SELECT * FROM produto WHERE preco <= 100.00;
SELECT * FROM produto WHERE validade > '2025-01-01';
SELECT * FROM servico WHERE tipo = 'Banho';
SELECT * FROM servico WHERE preco <= 80.00;



 */