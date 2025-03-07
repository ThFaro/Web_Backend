package com.webbackend.projeto_escola;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.webbackend.projeto_escola.models.Curso;
import com.webbackend.projeto_escola.repositories.CursoRepository;

@SpringBootApplication
public class ProjetoEscolaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoEscolaApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(@Autowired CursoRepository cursoRepository) {
        return args -> {
            Curso curso1 = new Curso();
            curso1.setNome("teste");
            curso1.setCargaHoraria(2000);
            cursoRepository.inserir(curso1);

            Curso curso2 = new Curso();
            curso2.setNome("teste2");
            curso2.setCargaHoraria(2050);
            cursoRepository.inserir(curso2);

            List<Curso> listaCursos = cursoRepository.obterTodos();
            listaCursos.forEach(System.out::println);
        };
    }
}

