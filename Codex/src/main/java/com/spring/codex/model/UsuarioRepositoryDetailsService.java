package com.spring.codex.model;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


//Sirve para que el Sistema de Autenticación de Spring acceda a los datos de usuario desde la base de datos
@Service
public class UsuarioRepositoryDetailsService implements UserDetailsService {
	private final UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioRepositoryDetailsService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = usuarioRepository.findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("No se pudo encontrar: " + username);
		}
		return new CustomUserDetails(user);
	}

	private final static class CustomUserDetails extends Usuario implements UserDetails {

		/**
		 * 
		 */
		private static final long serialVersionUID = -5708084648279451366L;

		private CustomUserDetails(Usuario user) {
			super(user);
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return AuthorityUtils.createAuthorityList("ROLE_USER");
		}

		@Override
		public String getUsername() {
			return getEmail();
		}

		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		@Override
		public boolean isEnabled() {
			return true;
		}
	}
}
