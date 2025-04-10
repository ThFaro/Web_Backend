package com.webbackend.supermercado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SupermercadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupermercadoApplication.class, args);
	}

}


/*

                                Exemplos de testes 
								


                                    USANDO O THUNDER CLIENT:

PREÇO MAIOR QUE:
GET http://localhost:8080/produtos/preco/maior/32

PRODUTOS DO SETOR:
GET http://localhost:8080/produtos/setor/Laticínios

Buscar todos os produtos que vencem depois de 18/04/2023:
GET http://localhost:8080/produtos/validade/depois/2025-04-18

Buscar cliente por cpf:
GET http://localhost:8080/clientes/cpf/12345678901

Buscar um cliente pelo número de celular.
GET http://localhost:8080/clientes/celular/11999990002

Buscar todas as vendas do cliente
GET http://localhost:8080/vendas/cliente/1

Buscar todas as vendas cujo valor total seja maior que R$ 1528,32.
GET http://localhost:8080/vendas/valor-maior/1528

Buscar todas as vendas realizadas entre 01/01/2025 a 31/03/2025.
GET http://localhost:8080/vendas/entre-datas?inicio=2025-01-01T00:00&fim=2025-03-31T23:59

Buscar todas as vendas do produtoId igual a 2385.
GET http://localhost:8080/vendas/produto/2385


*/