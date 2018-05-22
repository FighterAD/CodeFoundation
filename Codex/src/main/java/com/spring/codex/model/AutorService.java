package com.spring.codex.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
	
	/*---Interfaz para la gestion de datos de Autors---*/
	@Autowired
	AutorRepository autorRepository;

	
	public List<Autor> getAll() {
		return autorRepository.findAll();
	}
	
	public Autor getByID(long ID) {
		return autorRepository.findByID(ID);
	}
		
	public Autor getByNombre(String nombre) {
		return autorRepository.findByNombre(nombre);
	}
	
	public Autor getByNombreApellido1Apellido2(String nombre, String apellido1, String apellido2) {
		return autorRepository.findByNombreAndApellido1AndApellido2(nombre,apellido1,apellido2);
	}

	
	public void add(Autor autor) {
		Autor busqueda = autorRepository.findByNombreAndApellido1AndApellido2(autor.getNombre(), autor.getApellido1(), autor.getApellido2());
		if (busqueda == null) {
			autorRepository.save(autor);
		}
	}
	
	public void update(Autor autor) {
		Autor p = autorRepository.getOne(autor.getID());
		p.setApellido1(autor.getApellido1());
		p.setApellido2(autor.getApellido2());
		p.setNombre(autor.getNombre());
		autorRepository.saveAndFlush(p);
	}
	
	public void delete(long id) {
		autorRepository.deleteById(id);
	}
	
}
