package com.webbackend.gerenciador_tarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorTarefasApplication {

    public static void main(String[] args) {
        SpringApplication.run(GerenciadorTarefasApplication.class, args);
    }
}


/*

                                Exemplos de testes 

- GET
  - Listar todas:
   No h2 console: SELECT * FROM TAREFA;
   No navegador: http://localhost:8080/tarefas
  - Buscar por ID:
   No navegador: http://localhost:8080/tarefas/1
   No h2 console: SELECT * FROM TAREFA WHERE id = 1;

- POST
  INSERT INTO TAREFA (descricao, concluida) VALUES ('Estudar Spring Boot', false);
  INSERT INTO TAREFA (descricao, concluida) VALUES ('Fazer exercícios de API REST', true);
  INSERT INTO TAREFA (descricao, concluida) VALUES ('Revisar material de JPA', false);

- PUT
  UPDATE TAREFA SET concluida = true WHERE id = 1;

- DELETE:
  DELETE FROM TAREFA WHERE id = 2;

*/
