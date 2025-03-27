package com.webbackend.gerenciamento_academia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciamentoAcademiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoAcademiaApplication.class, args);
	}

}

/*

                                Exemplos de testes 
								
Acesso: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:academiadb
User: sa
Password: password

SHOW TABLES;
SHOW COLUMNS FROM alunos;
SHOW COLUMNS FROM funcionarios;
SHOW COLUMNS FROM historico_treinos;
SHOW COLUMNS FROM aluno_funcionario;

SELECT * FROM alunos;
SELECT * FROM funcionarios;
SELECT * FROM historico_treinos;
SELECT * FROM aluno_funcionario;

--> Ver os funcionários que atendem um aluno específico (ex: aluno com id 1):
SELECT * FROM historico_treinos WHERE aluno_id = 1;

--> Ver os alunos que um funcionário atende (ex: funcionário com id 2):
SELECT a.* 
FROM alunos a
JOIN aluno_funcionario af ON a.id = af.aluno_id
WHERE af.funcionario_id = 2;


                                Exemplos de testes para pessoas:
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
*/