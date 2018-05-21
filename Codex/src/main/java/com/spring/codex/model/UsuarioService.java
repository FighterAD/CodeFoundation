package com.spring.codex.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


	
	public Usuario findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}
	
	public void saveUsuario (Usuario usuario) {
		/*
		Usuario usuario = new Usuario();
		usuario.setDNI(user.getDNI());
		usuario.setApellido1(user.getApellido1());
		usuario.setApellido2(user.getApellido2());
		usuario.setEmail(user.getEmail());
		*/
		usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
		/*
		usuario.setFecha_nacimiento(user.getFecha_nacimiento());
		usuario.setDireccion(user.getDireccion());
		usuario.setCodigoPostal(user.getCodigoPostal());
		*/
		usuarioRepository.save(usuario);
	}

}
