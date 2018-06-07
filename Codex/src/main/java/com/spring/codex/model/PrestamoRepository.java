package com.spring.codex.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
	Prestamo findById(long id);
}
