package com.spring.codex.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestamoService {
	@Autowired
	PrestamoRepository prestamoRepository;
	
	public List<Prestamo> getAll(){
		return prestamoRepository.findAll();
	}
	
	public Prestamo getById(long id) {
		return prestamoRepository.findById(id);
	}
	
	public void add(Prestamo p) {
		if(prestamoRepository.findById(p.getId()) == null) {
			prestamoRepository.save(p);
		}
	}
	
	public void delete(long id) {
		prestamoRepository.deleteById(id);
	}
}
