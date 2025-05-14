package com.webbackend.tratamento_erros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TratamentoErrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TratamentoErrosApplication.class, args);
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
  "telefone": "11988776655"
}

2. LISTAR TODOS OS CLIENTES
GET http://localhost:8080/clientes

3. OBTER CLIENTE POR ID
GET http://localhost:8080/clientes/1

==> Se não existir:
Status: 400 Bad Request
Body: "Cliente não encontrado"

4. EDITAR CLIENTE POR ID
PUT http://localhost:8080/clientes/1
Body (JSON):
{
  "nome": "Camila Oliveira",
  "email": "camila.oliveira@email.com",
  "telefone": "11987654321"
}

==> Se não existir:
Status: 400 Bad Request
Body: "Cliente não encontrado"

5. EXCLUIR CLIENTE POR ID
DELETE http://localhost:8080/clientes/1

==> Se não existir:
Status: 400 Bad Request
Body: "Cliente não encontrado"

*/
