package com.spring.codex.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Usuario findByEmail(String email);
}
