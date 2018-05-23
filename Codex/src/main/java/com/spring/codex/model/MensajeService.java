package com.spring.codex.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensajeService {
	@Autowired
	MensajeRepository mensajeRepository;
	
	public List<Mensaje> getAll(){
		return mensajeRepository.findAll();
	}
	
	public Mensaje getById(long id) {
		return mensajeRepository.findById(id);
	}
	
	public void addMensaje(Mensaje m) {
		if(mensajeRepository.findById(m.getId()) == null) {
			mensajeRepository.save(m);
		}
	}
	
	public void deletMensaje(long id) {
		mensajeRepository.deleteById(id);
	}
}
