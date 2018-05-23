package com.spring.codex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.codex.model.Mensaje;

@Controller
public class MensajeController {
	@GetMapping("/enviar")
	public String mostrarEnviarMensaje(Mensaje mensaje, Model model) {
		model.addAttribute("mensaje", mensaje);
		return "enviarMensaje";
	}
}
