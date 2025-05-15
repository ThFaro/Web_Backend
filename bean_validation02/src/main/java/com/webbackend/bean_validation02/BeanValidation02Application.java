package com.webbackend.bean_validation02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanValidation02Application {

	public static void main(String[] args) {
		SpringApplication.run(BeanValidation02Application.class, args);
	}

}

/*

                        TESTES 

1. CRIAR CLIENTE
POST http://localhost:8080/clientes
Body (JSON):
{
  "nome": "Camila Andrade",
  "email": "camila.andrade@email.com",
  "cpf": "12345678900",
  "dataNascimento": "1995-04-22",
  "telefone": "11987654321"
}

==>Se algum campo obrigatório faltar ou for inválido (ex: nome curto, CPF errado):
Status: 500 Internal Server Error
Motivo: A validação está apenas na entidade. Use o ValidadorCliente para testar manualmente.

2. LISTAR TODOS OS CLIENTES
GET http://localhost:8080/clientes

==> Retorna a lista de todos os clientes, inclusive os inseridos via data.sql


3. OBTER CLIENTE POR ID
GET http://localhost:8080/clientes/1

==> Se não existir:
Status: 400 Bad Request
Body: "Cliente não encontrado"

4. EDITAR CLIENTE POR ID
PUT http://localhost:8080/clientes/1
Body (JSON):
{
  "nome": "Camila Reis",
  "email": "camila.reis@email.com",
  "cpf": "12345678900",
  "dataNascimento": "1994-07-15",
  "telefone": "11999887766"
}

==> Se o ID não existir:
Status: 400 Bad Request
Body: "Cliente não encontrado"

5. EXCLUIR CLIENTE POR ID
DELETE http://localhost:8080/clientes/1

==> Se o ID não existir:
Status: 400 Bad Request
Body: "Cliente não encontrado"
*/
