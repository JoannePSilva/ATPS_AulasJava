package com.atp64_atp.api;

import java.util.List;

import com.atp64_atp.model.Cliente;
import com.atp64_atp.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroApi {

@Autowired    
private ClienteRepository repository;
    
       
//semelhante a controller, mas é responsável pelo ponto de acesso   
@GetMapping("api/cadastro") //depois podemos acrescentar a versão no endereço
public List<Cliente> clientes(Model req){
    List<Cliente> listaClientes = (List<Cliente>)repository.findAll();
    return listaClientes;
}


@PostMapping("api/cadastro")
public String salvar(Cliente model){
    repository.save(model);
    return "Salvo com sucesso";
    }  
     

    @GetMapping("api/cadastro/{id}")
public String delete(@PathVariable int id){
    repository.deleteById(id);
    return "redirect:/cadastro";
    }

    @GetMapping("api/cadastro/{id}")
public String update(@PathVariable int id, Model req){
    Cliente model = repository.findById(id).get();
    req.addAttribute("cliente", model);
    return "cadastro-form";
    }
}

}
