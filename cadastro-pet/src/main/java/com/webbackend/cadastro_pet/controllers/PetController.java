package com.webbackend.cadastro_pet.controllers;

import com.webbackend.cadastro_pet.models.Pet;
import com.webbackend.cadastro_pet.services.PetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping
    public Pet cadastrarPet(@RequestBody Pet pet) {
        return petService.cadastrarPet(pet);
    }

    @GetMapping
    public List<Pet> listarPets() {
        return petService.listarPets();
    }

    @GetMapping("/buscar/nome/{nome}")
    public List<Pet> buscarPorNome(@PathVariable String nome) {
        return petService.buscarPorNome(nome);
    }

    @GetMapping("/buscar/raca/{raca}")
    public List<Pet> buscarPorRaca(@PathVariable String raca) {
        return petService.buscarPorRaca(raca);
    }

    @GetMapping("/buscar/tamanho/{tamanho}")
    public List<Pet> buscarPorTamanho(@PathVariable String tamanho) {
        return petService.buscarPorTamanho(tamanho);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerPet(@PathVariable Long id) {
        boolean removido = petService.removerPet(id);
        return removido ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
