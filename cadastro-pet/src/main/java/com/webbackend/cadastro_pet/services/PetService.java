package com.webbackend.cadastro_pet.services;

import com.webbackend.cadastro_pet.models.Pet;
import com.webbackend.cadastro_pet.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public Pet cadastrarPet(Pet pet) {
        return petRepository.save(pet);
    }

    public List<Pet> listarPets() {
        return petRepository.findAll();
    }

    public List<Pet> buscarPorNome(String nome) {
        return petRepository.findByNomeContaining(nome);
    }

    public List<Pet> buscarPorRaca(String raca) {
        return petRepository.findByRaca(raca);
    }

    public List<Pet> buscarPorTamanho(String tamanho) {
        return petRepository.findByTamanho(tamanho);
    }

    public boolean removerPet(Long id) {
        if (petRepository.existsById(id)) {
            petRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
