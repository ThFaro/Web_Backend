package com.webbackend.cadastro_pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastroPetApplication {

    public static void main(String[] args) {
        SpringApplication.run(CadastroPetApplication.class, args);
    }
}


/*

                                Exemplos de testes:

- Post:
http://localhost:8080/pets
{"nome":"Pucca","raca":"Spitz","cor":"Marrom","peso":7.0,"tamanho":"Pequeno"}
{"nome": "Max","raca": "Golden Retriever","cor": "Dourado","peso": 30.0,"tamanho": "Grande"}
{"nome":"Maia","raca":"Pastora Suíça","cor":"Branca","peso":35.0,"tamanho":"Grande"}

- Get:
 ->Listar todos: http://localhost:8080/pets
 ->Buscar por nome: http://localhost:8080/pets/buscar/nome/Pucca
 ->Buscar por raca: http://localhost:8080/pets/buscar/raca/Golden Retriever
 ->Buscar por tamanho: http://localhost:8080/pets/buscar/tamanho/Grande

- Delete:
 ->No thunder cliente: http://localhost:8080/pets/1

*/