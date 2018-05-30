package com.spring.codex.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.spring.codex.model.Libro;
import com.spring.codex.model.LibroService;

@Controller
public class BuscarController {
	@Autowired
	LibroService libroService;
	
	Libro aux;

	@GetMapping("/buscar")
	public String buscar(Libro l, Model model) {
		aux = libroService.getByName("Yerma");
		model.addAttribute("libros", libroService.getAll());
		model.addAttribute("libro", libroService.getByName(aux.getNombre()));
		return "buscar";
	}

	@PostMapping("/buscar")
	public String save(@Valid Libro l, BindingResult result, Model model) {
		if(libroService.getByName(l.getNombre()) != null) {
			aux.setAnyo(l.getAnyo());
			aux.setAutor(l.getAutor());
			aux.setEditor(l.getEditor());
			aux.setIsbn13(l.getIsbn13());
			aux.setNombre(l.getNombre());
			
			model.addAttribute("libros", libroService.getAll());
			model.addAttribute("libro", libroService.getByName(l.getNombre()));
		}else {
			model.addAttribute("libros", libroService.getAll());
			model.addAttribute("libro", libroService.getByName(aux.getNombre()));
		}
		
		return "buscar";
	}
}
