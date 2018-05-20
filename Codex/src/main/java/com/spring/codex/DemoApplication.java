package com.spring.codex;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.spring.codex.model.Autor;
import com.spring.codex.model.Libro;
import com.spring.codex.model.AutorService;
import com.spring.codex.model.LibroService;

@SpringBootApplication
@EnableJpaAuditing

public class DemoApplication {

	// JPA
	// https://www.objectdb.com/java/jpa/entity/id


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(LibroService libroService, AutorService personaService) {
		return (args) -> {
			// crear datos al arrancar la aplicación
			// se usa para meter datos de prueba
			Autor fede = new Autor("Federico", "Garcia", "Lorca");
			Autor una = new Autor("Miguel", "de Unamuno", "y Jugo");
			personaService.add(fede);
			personaService.add(una);

			Libro libro1 = new Libro(12312l, "Yerma", 1934, fede, "Austral");
			Libro libro2 = new Libro(1122l, "Niebla	", 1907, una, "Alianza");
			libroService.add(libro1);
			libroService.add(libro2);

			// ejemplo de como buscar por nombre
			Libro l1 = libroService.getByName("Yerma");
			Libro libroInexistente = libroService.getByName("NONAME");
		};
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
	}

}
