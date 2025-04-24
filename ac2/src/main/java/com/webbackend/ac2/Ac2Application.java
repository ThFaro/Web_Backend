package com.webbackend.ac2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ac2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ac2Application.class, args);
	}

}



/*
                                Exemplos de Testes

Acesso ao Console H2:
→ URL: http://localhost:8080/h2-console  
→ JDBC URL: jdbc:h2:mem:ac2db  
→ User: sa  
→ Password: password  

-- Ver estrutura das tabelas:
SHOW COLUMNS FROM clientes;
SHOW COLUMNS FROM colaboradores;
SHOW COLUMNS FROM projetos;
SHOW COLUMNS FROM projetos_colaboradores;

-- Consultar por nome parcial:
SELECT * FROM clientes WHERE nome_empresa LIKE '%Inova%';
SELECT * FROM projetos WHERE status = 'Concluído';
SELECT * FROM colaboradores WHERE cargo LIKE '%Desenvolvedor%';

-- Ver projetos de um cliente específico:
SELECT * FROM projetos WHERE cliente_id = 1;

-- Ver colaboradores atribuídos a projetos:
SELECT * FROM projetos_colaboradores WHERE projeto_id = 1;


-------------------------------------------------------------------------------

                    USANDO O THUNDER CLIENT

-- ADICIONAR CLIENTE:
POST http://localhost:8080/clientes
Body (JSON):
{
  "nomeEmpresa": "CodeWorks",
  "cnpj": "111222333000144",
  "contato": "contato@codeworks.com"
}

-- LISTAR TODOS OS CLIENTES:
GET http://localhost:8080/clientes

-- ADICIONAR COLABORADOR:

POST http://localhost:8080/colaboradores
Body (JSON):
{
  "nome": "Fernanda Costa",
  "cargo": "Scrum Master",
  "email": "fernanda.costa@empresa.com"
}

-- LISTAR TODOS OS COLABORADORES:
GET http://localhost:8080/colaboradores

--CRIAR PROJETO:
POST http://localhost:8080/projetos
Body (JSON):
{
  "nome": "Sistema de RH",
  "descricao": "Aplicação para gerenciamento de recursos humanos.",
  "status": "Planejamento",
  "cliente": {
    "id": 1
 }
}

-- LISTAR TODOS OS PROJETOS:
GET http://localhost:8080/projetos


--ATUALIZAR PROJETO:
PUT http://localhost:8080/projetos/1/status?status=Em Desenvolvimento

--ADICIONAR COLABORADOR AO PROJETO:
POST http://localhost:8080/projetos/1/colaboradores
Body (JSON):
[2, 3, 5]

*/


