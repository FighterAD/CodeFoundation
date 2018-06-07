package com.spring.codex.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.codex.model.Autor;
import com.spring.codex.model.AutorService;
import com.spring.codex.model.Prestamo;
import com.spring.codex.model.PrestamoService;

//Controlador de los objetos Autor
@Controller
public class PrestamoController {

	@Autowired
	PrestamoService prestamoService;

	@GetMapping("/prestamos")
	public String listPrestamosView(Model model) {
		model.addAttribute("prestamos", prestamoService.getAll());
		return "prestamos";
	}

	@GetMapping("/prestamos/add")
	public String addPrestamoView(Prestamo prestamo, Model model) {
		model.addAttribute("prestamos", prestamoService.getAll());
		model.addAttribute("prestamo", prestamo);
		return "addPrestamo";
	}

	@PostMapping("/prestamos/add")
	public String save(@Valid Prestamo prestamo, BindingResult result, Model model) {
		try {
			prestamoService.add(prestamo);
			model.addAttribute("create", true);
		} catch (Exception er) {
			model.addAttribute("create", false);
		}
		
		return listPrestamosView(model);
	}
	

	@DeleteMapping("/prestamos/{id}")
	public String delete(@PathVariable("id") long id, Model model) {
		System.out.println("Intentando borrar");
		try {
			prestamoService.delete(id);
			model.addAttribute("delete", true);
		} catch (Exception er) {
			model.addAttribute("delete", false);
		}
		//return listPrestamosView(model);
		return "prestamos";
	}
}
