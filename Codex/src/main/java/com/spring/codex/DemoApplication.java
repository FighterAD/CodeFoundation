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
//@EnableJpaAuditing

public class DemoApplication {

	// JPA
	// https://www.objectdb.com/java/jpa/entity/id


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(LibroService libroService, AutorService autorService) {
		return (args) -> {
			// crear datos al arrancar la aplicación
			// se usa para meter datos de prueba
			
			
			Autor fede = new Autor("Federico", "Garcia", "Lorca");
			//fede.setID(1);
			Autor una = new Autor("Miguel", "de Unamuno", "y Jugo");
			//una.setID(2);
			autorService.add(fede);
			autorService.add(una);

			Libro libro1 = new Libro(12312l, "Yerma", 1934, fede, "Austral");
			libro1.setImagen("https://cloud10.todocoleccion.online/libros-antiguos/fot/2008/08/22/9674851.jpg");
			libro1.setDescripcion("Como repetidamente declaró Federico García Lorca, \"Yerma\" es una tragedia con un solo tema (la mujer estéril) y un carácter en progresivo desarrollo. A través del largo tiempo dramático, Yerma lucha desesperadamente con su verdad");
			Libro libro2 = new Libro(1122l, "Niebla	", 1907, una, "Alianza");
			libro2.setDescripcion("Esta obra de Miguel de Unamuno es uno de los ejemplos clásicos más eminentes de la novela moderna. La ficción deja aquí de ser un puro vehículo narrativo, transmisor de historias, para convertirse en un universo textual de fecundas sugerencias.\n" + 
					"");
			libro2.setImagen("http://www.elcotidiano.es/wp-content/uploads/2014/08/NIEBLA.png");
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
