package com.spring.codex.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeRepository extends JpaRepository<Mensaje, Long>{
	Mensaje findById(long id);
}
