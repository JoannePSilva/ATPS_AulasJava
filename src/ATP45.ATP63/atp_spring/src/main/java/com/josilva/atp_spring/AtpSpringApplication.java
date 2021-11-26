package com.josilva.atp_spring;

import java.util.List;

import com.josilva.atp_spring.model.Filme;
import com.josilva.atp_spring.repository.FilmeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtpSpringApplication implements CommandLineRunner{
	private FilmeRepository fRepository;

public AtpSpringApplication(FilmeRepository repository) {
this.fRepository = repository;
	
}
	public static void main(String[] args) {
		SpringApplication.run(AtpSpringApplication.class, args);
	}


@Override
public void run(String... args) throws Exception {

	Filme model = new Filme();
	model.setNome("Lagoa Azul");
	model.setNomeDiretor("Diretor");

	fRepository.save(model);

	fRepository.findAll().forEach(f -> System.out.printf("%d - %s \n", f.getId(), f.getNome()));
}
}
