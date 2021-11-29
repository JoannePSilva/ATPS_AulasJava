package com.springjo.aula_spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.springjo.aula_spring.model.Filme;
import com.springjo.aula_spring.repository.FilmeRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// recebe as requisições e controla o funcionamento 

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
    req.addAttribute("filmes", "listaFilmes");
    return "filmes";
}

    
}
