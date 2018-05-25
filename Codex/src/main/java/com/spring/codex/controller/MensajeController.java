package com.spring.codex.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import com.spring.codex.model.Mensaje;
import com.spring.codex.model.MensajeService;
import com.spring.codex.model.Usuario;
import com.spring.codex.model.UsuarioService;

@Controller
public class MensajeController {
	@Autowired
	MensajeService mensajeService;
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/enviar")
	public String mostrarEnviarMensaje(Mensaje mensaje, Model model) {
		model.addAttribute("mensajes", mensajeService.getAll());
		model.addAttribute("mensaje", mensaje);
		return "enviarMensaje";
	}
	
	@PostMapping("/enviar")
	public String save(@Valid Mensaje m, BindingResult result, Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    m.setEmisor(auth.getName());
	    
		try {
			if(usuarioService.findByEmail(m.getReceptor()) != null && !m.getReceptor().equals(auth.getName())) {
				mensajeService.addMensaje(m);
				model.addAttribute("create", true);				
			}
		} catch (Exception er) {
			System.out.println("Mensaje no creado\n");
			model.addAttribute("create", false);
		}

		return "index";
	}
}
