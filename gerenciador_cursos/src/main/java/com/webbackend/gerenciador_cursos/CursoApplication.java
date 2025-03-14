package com.webbackend.gerenciador_cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CursoApplication.class, args);
    }
}


/*
                                Exemplos de testes

- Verificar Estrutura da Tabela: 
  SHOW COLUMNS FROM CURSO;

- Inserir Cursos na Tabela:**  
  INSERT INTO CURSO (NOME, CARGA_HORARIA, DATA_CRIACAO) 
  VALUES ('Curso de Spring Boot', 40, CURRENT_DATE);

  INSERT INTO CURSO (NOME, CARGA_HORARIA, DATA_CRIACAO) 
  VALUES ('Curso de Java', 30, '2024-12-15');

  INSERT INTO CURSO (NOME, CARGA_HORARIA, DATA_CRIACAO) 
  VALUES ('Curso de Banco de Dados', 50, '2024-10-10');

- Listar Todos os Cursos: 
  SELECT * FROM CURSO;

- Buscar Curso por ID (Exemplo ID = 1):
  SELECT * FROM CURSO WHERE ID = 1;

- Buscar Cursos por Nome (Exemplo: Contém "Spring")*
  SELECT * FROM CURSO WHERE NOME LIKE '%Spring%';

- Buscar Cursos por Carga Horária Maior que 30: 
  SELECT * FROM CURSO WHERE CARGA_HORARIA > 30;

- Buscar Cursos Criados Antes de 01/01/2025:**  
  SELECT * FROM CURSO WHERE DATA_CRIACAO < '2025-01-01';

- Atualizar um Curso (Exemplo: ID = 1)
  UPDATE CURSO 
  SET NOME = 'Curso de Spring Boot Avançado', CARGA_HORARIA = 50 
  WHERE ID = 1;

- Deletar um Curso (Exemplo: ID = 1)
  DELETE FROM CURSO WHERE ID = 1;

*/
