package com.atp64_atp.repository;

import com.atp64_atp.model.Cliente;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;


    public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Integer> {
//pagin está susbstituindo crud
//Sort.by(Sort.Direction.ASC, "id"

@Override
default Iterable<Cliente> findAll() {
    return findAll(Sort.by(Sort.Direction.ASC,"id"));
    
}
    
    }
    