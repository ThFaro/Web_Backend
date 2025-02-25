package com.webbackend.api_exemplo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final List<String> usuarios = new ArrayList<>();

    public UsuarioController() {
        usuarios.add("Joao.Leite");
    }

    @PostMapping("/cadastrar") // http://localhost:8080/usuarios/cadastrar?nome=Thiago
    public String cadastrarUsuario(@RequestParam String nome) {
        usuarios.add(nome);
        return "Usuário cadastrado: " + nome;
    }

    @GetMapping("/listar") // http://localhost:8080/usuarios/listar
    public List<String> listarUsuarios() {
        return usuarios;
    }

    @DeleteMapping("/remover") // http://localhost:8080/usuarios/remover?nome=Joao.Leite
    public String removerUsuario(@RequestParam String nome) {
        if (usuarios.remove(nome)) {
            return "Usuário removido: " + nome;
        }
        return "Usuário não encontrado.";
    }
}
