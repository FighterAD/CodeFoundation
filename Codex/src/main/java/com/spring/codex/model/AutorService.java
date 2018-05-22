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
	
	public void add(Autor autor) {
		 autorRepository.save(autor);
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
