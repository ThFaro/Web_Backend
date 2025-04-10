package com.webbackend.petshop.services;

import com.webbackend.petshop.models.Animal;
import com.webbackend.petshop.repositories.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> listarTodos() {
        return animalRepository.findAll();
    }

    public Animal salvar(Animal animal) {
        return animalRepository.save(animal);
    }

    public List<Animal> listarPorCliente(Long clienteId) {
        return animalRepository.findByClienteId(clienteId);
    }
}
