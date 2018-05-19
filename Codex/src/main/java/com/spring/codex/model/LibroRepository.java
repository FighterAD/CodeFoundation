package com.spring.codex.model;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LibroRepository extends JpaRepository<Libro, Long> {
	
	Libro findByNombre(String bookName);
}
