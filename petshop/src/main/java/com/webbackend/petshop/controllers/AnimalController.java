package com.webbackend.petshop.controllers;

import com.webbackend.petshop.models.Animal;
import com.webbackend.petshop.services.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> listarTodos() {
        return animalService.listarTodos();
    }

    @PostMapping
    public Animal salvar(@RequestBody Animal animal) {
        return animalService.salvar(animal);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Animal> listarPorCliente(@PathVariable Long clienteId) {
        return animalService.listarPorCliente(clienteId);
    }
}
