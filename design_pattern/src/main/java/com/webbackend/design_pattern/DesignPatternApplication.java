package com.webbackend.design_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

}


/*
                                Exemplos de Testes

Acesso ao Console H2:
→ URL: http://localhost:8080/h2-console  
→ JDBC URL: jdbc:h2:mem:designpatterndb  
→ User: sa  
→ Password: password  


-- Ver estrutura das tabelas:
SHOW COLUMNS FROM clientes;
SHOW COLUMNS FROM sabores;
SHOW COLUMNS FROM pedidos;

-- Inserção direta (caso necessário):
INSERT INTO clientes (id, nome, cpf, telefone) VALUES (10, 'Exemplo Cliente', '12312312312', '11999999999');
INSERT INTO sabores (id, nome, descricao) VALUES (10, 'Mousse de Limão', 'Refrescante e suave');

-- Consultas:
SELECT * FROM clientes WHERE nome LIKE '%Silva%';
SELECT * FROM clientes WHERE cpf = '11111111111';
SELECT * FROM pedidos WHERE status = 'Pronto';
SELECT * FROM pedidos WHERE cliente_id = 1;
SELECT * FROM pedidos WHERE sabor_id = 3;

-------------------------------------------------------------------------------

                    USANDO O THUNDER CLIENT

-- ADICIONAR CLIENTE:
POST http://localhost:8080/clientes
Body (JSON):
{
  "nome": "Camila Andrade",
  "cpf": "33322211100",
  "telefone": "11988776655"
}

-- LISTAR TODOS OS CLIENTES:
GET http://localhost:8080/clientes

-- BUSCAR POR CPF:
GET http://localhost:8080/clientes/cpf/33322211100 

-- BUSCAR POR NOME CONTENDO:
GET http://localhost:8080/clientes/nome/Camila

-------------------------------------------------------------------------------

-- ADICIONAR SABOR:
POST http://localhost:8080/sabores 
Body (JSON):
{
  "nome": "Morango com Leite Ninho",
  "descricao": "Camadas de recheio doce com frutas" 
}

-- LISTAR TODOS OS SABORES:
GET http://localhost:8080/sabores

-- BUSCAR SABOR POR NOME:
GET http://localhost:8080/sabores/nome/morango 

-------------------------------------------------------------------------------

-- CRIAR PEDIDO:
POST http://localhost:8080/pedidos
Body (JSON):
{
  "clienteId": 1,
  "saborId": 2,
  "status": "Pendente"
}

-- LISTAR PEDIDOS:
GET http://localhost:8080/pedidos

-- BUSCAR PEDIDOS POR STATUS:
GET http://localhost:8080/pedidos/status/Pendente

-- BUSCAR PEDIDOS POR NOME DO CLIENTE:
GET http://localhost:8080/pedidos/cliente/Silva

-- ATUALIZAR STATUS DO PEDIDO:
PUT http://localhost:8080/pedidos/1/status?status=Entregue

*/
