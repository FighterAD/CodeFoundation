package com.spring.codex.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import com.spring.codex.model.Mensaje;
import com.spring.codex.model.MensajeService;
import com.spring.codex.model.UsuarioService;

@Controller
public class MensajeController {
	@Autowired
	MensajeService mensajeService;
	
	@Autowired
	UsuarioService usuarioService;
	
	/*
	@GetMapping("/enviar")
	public String mostrarEnviarMensaje(Mensaje mensaje, Model model) {
		model.addAttribute("mensajes", mensajeService.getAll());
		model.addAttribute("mensaje", mensaje);
		return "enviarMensaje";
	}*/
	
	@GetMapping("/enviar/{correo}")
	public String mostrar(@PathVariable("correo") String correo, Mensaje mensaje, Model model) {
		model.addAttribute("destinatario", usuarioService.findByEmail(correo));
		model.addAttribute("mensajes", mensajeService.getAll());
		model.addAttribute("mensaje", mensaje);
		return "enviarMensaje";
	}
	
	@PostMapping("/enviar/{correo}")
	public String save(@PathVariable("correo") String correo, @Valid Mensaje m, BindingResult result, Model model){
		System.out.println("hola");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    m.setEmisor(auth.getName());
	    m.setReceptor(correo);
	    m.setUsuarioEmisor(usuarioService.findByEmail(m.getEmisor()));
	    m.setUsuarioReceptor(usuarioService.findByEmail(m.getReceptor()));
	    	    
		try {
			if(usuarioService.findByEmail(m.getReceptor()) != null) {
				mensajeService.addMensaje(m);
				model.addAttribute("create", true);				
			}
		} catch (Exception er) {
			System.out.println(er.getMessage());
			model.addAttribute("create", false);
		}

		return "index";
	}
}
