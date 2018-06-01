package com.spring.codex.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
	Autor findByNombre(String nombre);
	Autor findByNombreIgnoreCaseAndApellido1IgnoreCaseAndApellido2IgnoreCase(String nombre, String apellido1, String apellido2);
	Autor findByID(long ID);
}
