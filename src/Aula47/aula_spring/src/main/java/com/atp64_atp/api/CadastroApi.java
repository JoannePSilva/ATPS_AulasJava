package com.atp64_atp.api;

import java.util.List;

import com.atp64_atp.model.Cliente;
import com.atp64_atp.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("api/cadastro") //permite que todos que precisem usem a mesma url *atenção para o put e delete
public class CadastroApi {

@Autowired    
private ClienteRepository repository;
    
@GetMapping
public List<Cliente> clientes(Model req){
    //sort para ordenar
    List<Cliente> listaClientes = (List<Cliente>)repository.findAll();
    return listaClientes;
}


@PostMapping
public String salvar(Cliente model){
    repository.save(model);
    return "Salvo com sucesso";
    }  
     

@DeleteMapping("/{id}")
public String delete(@PathVariable int id){
    repository.deleteById(id);
    return "Deletado com sucesso";
    }

@PutMapping("/{id}")
public String update(@PathVariable int id, Model req){
    Cliente model = repository.findById(id).get();
    req.addAttribute("cliente", model);
    return "cadastro-form";
    }
}


