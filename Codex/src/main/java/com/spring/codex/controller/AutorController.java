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

//Controlador de los objetos Autor
@Controller
public class AutorController {

	@Autowired
	AutorService autorService;

	/*---Devuelve el template de autors---*/
	@GetMapping("/autores")
	public String listPersonView(Model model) {
		model.addAttribute("autors", autorService.getAll());
		// devuelvo el template autors
		return "autores";
	}

	/*---Devuelve el formulario para crear una autor---*/
	@GetMapping("/autores/add")
	public String addPersonView(Autor autor, Model model) {
		model.addAttribute("autors", autorService.getAll());
		model.addAttribute("autor", autor);
		return "addAutor";
	}

	/*---Devuelve el formulario para editar una autor---*/
	@GetMapping("/autores/edit/{id}")
	public String editPersonView(@PathVariable("id") long id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("autor", autorService.getByID(id));
		return "updateAutor";
	}

	/*---Anade una nueva autor al sistema---*/
	@PostMapping("/autores")
	public String save(@Valid Autor autor, BindingResult result, Model model) {
		try {
			autorService.add(autor);
			model.addAttribute("create", true);
		} catch (Exception er) {
			model.addAttribute("create", false);
		}
		return listPersonView(model);
	}

	/*---Actualiza una nueva autor del sistema---*/
	@PostMapping("/autores/update")
	public String update(@Valid Autor autor, Model model) {
		try {
			autorService.update(autor);
			model.addAttribute("udpate", true);
		} catch (Exception er) {
			model.addAttribute("update", false);
		}
		return listPersonView(model);
	}

	/*---Elimina una autor a partir de su DNI---*/
	@DeleteMapping("/autores/{id}")
	public String delete(@PathVariable("id") long id, Model model) {
		try {
			autorService.delete(id);
			model.addAttribute("delete", true);
		} catch (Exception er) {
			model.addAttribute("delete", false);
		}
		return listPersonView(model);
	}

}
