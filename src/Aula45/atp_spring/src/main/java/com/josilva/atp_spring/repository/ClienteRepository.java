package com.josilva.atp_spring.repository;

import com.josilva.atp_spring.model.Cliente;

import org.springframework.data.repository.CrudRepository;
//no crud recebo o model + o tipo do id //OBS: não pode ser primitivo
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

    
}
