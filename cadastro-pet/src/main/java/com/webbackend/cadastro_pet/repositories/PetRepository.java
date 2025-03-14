package com.webbackend.cadastro_pet.repositories;

import com.webbackend.cadastro_pet.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findByNomeContaining(String nome);
    List<Pet> findByRaca(String raca);
    List<Pet> findByTamanho(String tamanho);

}
