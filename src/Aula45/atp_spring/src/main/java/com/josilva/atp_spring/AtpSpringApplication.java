package com.josilva.atp_spring;



import com.josilva.atp_spring.model.Agencia;
import com.josilva.atp_spring.model.Cliente;
import com.josilva.atp_spring.repository.AgenciaRepository;
import com.josilva.atp_spring.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtpSpringApplication implements CommandLineRunner{
	private ClienteRepository fRepository;
	private AgenciaRepository agRepository;

public AtpSpringApplication(ClienteRepository repository, AgenciaRepository aRepository) {
this.fRepository = repository;
this.agRepository = aRepository;
	
}
	public static void main(String[] args) {
		SpringApplication.run(AtpSpringApplication.class, args);
	}


@Override
public void run(String... args) throws Exception {

	Cliente model = new Cliente();
	model.setNome("Lagoa Azul");
	model.setNomeDiretor("Diretor");
//C
	System.out.println("Create");
	fRepository.save(model);
//R
	System.out.println("Read");
	fRepository.findAll().forEach(f -> System.out.printf("%d | %s | %s \n", f.getId(), f.getNome(), f.getNomeDiretor()));

//U

	System.out.println("Update");
	model.setId(4);
	model.setNome("Kevin");
	fRepository.save(model);
	fRepository.findAll().forEach(f -> System.out.printf("%d | %s |\n", f.getId(), f.getNome()));

//D
	System.out.println("Delete");
	fRepository.delete(model);
	fRepository.findAll().forEach(f -> System.out.printf("%d | %s |\n", f.getId(), f.getNome()));

System.out.println("------------- AGÊNCIA ---------------------");

	Agencia amodel = new Agencia();
	
//C
		System.out.println("Create");
		amodel.setNome("Jordana");
		amodel.setNumeroCC("abc123");
		agRepository.save(amodel);

//R
		System.out.println("Read");
		agRepository.findAll().forEach(fe -> System.out.printf("%d | %s | %s \n", fe.getId(), fe.getNome(), fe.getNumeroCC()));


//U
		System.out.println("Update");
		amodel.setId(2);
		amodel.setNome("Joanne");
		agRepository.save(amodel);
		agRepository.findAll().forEach(f -> System.out.printf("%d | %s |\n", f.getId(), f.getNome()));
//D	
	System.out.println("Delete");
	agRepository.delete(amodel);
	agRepository.findAll().forEach(f -> System.out.printf("%d | %s |\n", f.getId(), f.getNome()));

}
}
