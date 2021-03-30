package br.com.andremeiras.bibliotecaspring;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "br.com.andremeiras.bibliotecaspring.model" })
@EnableJpaRepositories(basePackages = { "br.com.andremeiras.bibliotecaspring.repository" })
@ComponentScan(basePackages =  { "br.com.andremeiras.bibliotecaspring.controller" })
public class BibliotecaspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaspringApplication.class, args);
	}

}
