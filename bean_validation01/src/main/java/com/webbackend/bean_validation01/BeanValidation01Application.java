package com.webbackend.bean_validation01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanValidation01Application {

	public static void main(String[] args) {
		SpringApplication.run(BeanValidation01Application.class, args);
	}

}

/*
                          TESTES 

1. CRIAR PRODUTO 
POST http://localhost:8080/produtos
Body (JSON):
{
  "nome": "Fone Bluetooth JBL",
  "preco": 299.90,
  "quantidadeEmEstoque": 25,
  "categoria": "Áudio"
}

==> Se algum campo obrigatório faltar ou for inválido (ex: nome curto ou preco zero),
retorna:
Status: 400 Bad Request
Body: "Produto não encontrado" ou erro de validação (se incluído depois via @Valid)

2. LISTAR TODOS OS PRODUTOS
GET http://localhost:8080/produtos

==> Retorna lista com todos os produtos do banco (inclusive os inseridos via data.sql)


3. OBTER PRODUTO POR ID
GET http://localhost:8080/produtos/1

==> Se não existir:
Status: 400 Bad Request
Body: "Produto não encontrado"

4. EDITAR PRODUTO POR ID
PUT http://localhost:8080/produtos/1
Body (JSON):
{
  "nome": "Fone Bluetooth JBL Tune 510BT",
  "preco": 319.90,
  "quantidadeEmEstoque": 30,
  "categoria": "Áudio"
}

==> Se não existir:
Status: 400 Bad Request
Body: "Produto não encontrado"


5. EXCLUIR PRODUTO POR ID
DELETE http://localhost:8080/produtos/1

==> Se não existir:
Status: 400 Bad Request
Body: "Produto não encontrado"

*/
