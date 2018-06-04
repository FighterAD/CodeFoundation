package com.spring.codex.controller;

import com.spring.codex.model.Libro;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.codex.model.LibroService;

@Controller
public class BusquedaController {
	
	@Autowired
	LibroService libroService;
	
    @ModelAttribute("libros")
    public List<Libro> Libros() {
        return new ArrayList<Libro>();
    }
    
    @ModelAttribute("busqueda")
    public String Busqueda() {
    	return new String();
    }
    
	@GetMapping("/busqueda/{string}")
	public String muestraLibro(@PathVariable("string") String string, Model model) {
		model.addAttribute("libros", libroService.busqueda(string));
		return "busqueda";
	}

}
