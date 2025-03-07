package com.webbackend.api_exemplo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.webbackend.api_exemplo.model.Usuario;
import com.webbackend.api_exemplo.repository.UsuarioRepository;

@SpringBootApplication
public class H2Application {
    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }

    @Bean
    public CommandLineRunner init(@Autowired UsuarioRepository usuarioRepository) {
        return args -> {
            usuarioRepository.inserir(new Usuario(0, "Teste", "teste@teste", "123"));
            List<Usuario> listaUsuarios = usuarioRepository.obterTodos();
            listaUsuarios.forEach(System.out::println);
        };
    }
}



//Lembrar de adicionar o h2 no pom.xml
//Lembrar de adicionar o h2 no application.properties
//Criar um arquivo .sql na pasta src/main/resources
//Criar o modelo Usuario dentro da pasta model
//Criar o UsuarioRepository dentro da pasta repository

//---------------- Adicionar no H2Application --------------------------------

/*@Bean
public CommandLineRunner init(@Autowired UsuarioRepository usuarioRepository){
return args ->{
usuarioRepository.inserir(new Usuario(0,"Teste","teste@teste","123"));
List<Usuario> listaUsuarios = usuarioRepository.obterTodos();
listaUsuarios.forEach(System.out::println);
};
} */

