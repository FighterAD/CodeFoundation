package com.spring.codex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.codex.model.Usuario;
import com.spring.codex.model.UsuarioService;

@Controller
public class RegistroController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
    @RequestMapping(value = "/registro", method = RequestMethod.GET)
    public String registro(Model model) {
        model.addAttribute("registro", new Usuario());

        return "registro";
    }
    
    @RequestMapping(value = "/registro", method = RequestMethod.POST)
    public String registration(@ModelAttribute("registro") Usuario userForm, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "registro";
        }

        usuarioService.saveUsuario(userForm);

        return "redirect:/";
    }




}
