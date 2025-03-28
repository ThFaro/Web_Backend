package com.webbackend.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
	}

}


/*

                                Exemplos de testes 
								
Acesso: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:academiadb
User: sa
Password: password

SHOW COLUMNS FROM pessoas;

INSERT INTO pessoas (nome, salario) VALUES
('Ana', 3500.00),
('Bruno', 2500.00),
('Carlos', 1800.00),
('Daniela', 5000.00),
('Eduardo', 1000.00),
('Fernanda', 3000.00);

SELECT * FROM pessoas WHERE salario > 3000;

SELECT * FROM pessoas WHERE salario <= 2500;

SELECT * FROM pessoas WHERE nome LIKE 'An%';


                                    USANDO O THUNDER CLIENT:

ADICONAR NOVA PESSOA:
POST http://localhost:8080/pessoas
{
	"nome": "Maria",
	"salario": 4000.00
}


Buscar todas as pessoas:
GET http://localhost:8080/pessoas

Buscar Pessoas com salário maior que um valor:
GET http://localhost:8080/pessoas/salario/maior/3000

Buscar Pessoas com salário menor ou igual a um valor:
GET http://localhost:8080/pessoas/salario/menor-ou-igual/3000

*/