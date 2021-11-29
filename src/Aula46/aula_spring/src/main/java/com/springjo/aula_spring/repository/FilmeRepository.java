package com.springjo.aula_spring.repository;

import com.springjo.aula_spring.model.Filme;

import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository <Filme, Integer>{
    
}
