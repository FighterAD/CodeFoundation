package com.spring.codex.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.codex.model.LibroService;

@Controller
public class BusquedaController {
	
	@Autowired
	LibroService libroService;
	
	
	
   @RequestMapping(value = "/busqueda")
   public String Search(@ModelAttribute("busqueda") String busqueda, Model model) {
	   
      if(busqueda != null){
         model.addAttribute("libros", libroService.busqueda("LOR%"));
      }
      
       return "busqueda";
   }

}
