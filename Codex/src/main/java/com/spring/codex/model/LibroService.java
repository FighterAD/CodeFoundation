package com.spring.codex.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
	/*---Interfaz para la gestion de datos de Libros---*/
	@Autowired
	LibroRepository repository;

	/*---Devuelve la lista de libros---*/
	public List<Libro> getAll() {
		return repository.findAll();
	}

	/*---Actualiza un libro---*/
	public void update(Libro libro) {
		Libro l = repository.findByIsbn13(libro.getIsbn13());
		l.setAutor(libro.getAutor());
		l.setNombre(libro.getNombre());
		//System.out.println(libro.getAutor());
		repository.saveAndFlush(l);
	}

	public Libro getByIsbn13(long isbn13) {
		//return repository.getOne(isbn13);
		return repository.findByIsbn13(isbn13);
	}
	
	public Libro getByName(String name) {
		return repository.findByNombre(name);
	}

	public void add(Libro libro) {
		Libro busqueda = repository.findByIsbn13(libro.getIsbn13());
		if (busqueda == null) {
			repository.save(libro);
		}	
	}
	
	public List<Libro> busqueda(String busq){
		return repository.searchWithJPQLQuery(busq);
	}

	public void delete(long isbn13) {
		repository.deleteById(isbn13);
	}


}
