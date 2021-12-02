package com.springjo.aula_spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.springjo.aula_spring.model.Filme;
import com.springjo.aula_spring.repository.FilmeRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// recebe as requisições e controla o funcionamento 
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilmeController {
    private FilmeRepository repository;

public FilmeController(FilmeRepository repository){
    this.repository = repository;
}

//mapear/encontrar o caminho
@GetMapping("/filme")
public String filmes(Model req){
    List<Filme> listaFilmes = (List<Filme>)repository.findAll();
    req.addAttribute("filmes", listaFilmes);
    return "filmes";
}
@GetMapping("/filme/form")
    public String formulario(Model req){
        Filme model = new Filme();
        req.addAttribute("filme", model);  return "filmes-form";
    }
    @PostMapping("/filme/salvar")
        public String salvar(Filme model){
            repository.save(model);
            return "redirect:/filme";
        }  
     

    @GetMapping("/filme/deletar/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "redirect:/filme";
    }

    @GetMapping("/filme/editar/{id}")
    public String editar(@PathVariable int id, Model req){
        Filme model = repository.findById(id).get();
        req.addAttribute("filme", model);
        return "filmes-form";
    }
}

