package com.atp64_atp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.atp64_atp.model.Cliente;
import com.atp64_atp.repository.ClienteRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// recebe as requisições e controla o funcionamento 
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {
    private ClienteRepository repository;

public ClienteController(ClienteRepository repository){
    this.repository = repository;
}

//mapear/encontrar o caminho
@GetMapping("/cliente")
public String filmes(Model req){
    List<Cliente> listaFilmes = (List<Cliente>)repository.findAll();
    req.addAttribute("filmes", listaFilmes);
    return "filmes";
}
@GetMapping("/cliente/form")
    public String formulario(Model req){
        Cliente model = new Cliente();
        req.addAttribute("filme", model);  return "filmes-form";
    }
    @PostMapping("/cliente/salvar")
        public String salvar(Cliente model){
            repository.save(model);
            return "redirect:/filme";
        }  
     

    @GetMapping("/cliente/deletar/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "redirect:/cliente";
    }

    @GetMapping("/cliente/editar/{id}")
    public String editar(@PathVariable int id, Model req){
        Cliente model = repository.findById(id).get();
        req.addAttribute("cliente", model);
        return "cadastro-form";
    }
}

