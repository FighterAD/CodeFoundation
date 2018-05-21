package com.spring.codex.controller;

import com.spring.codex.model.Usuario;
import com.spring.codex.model.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    private UsuarioService userService;

    @ModelAttribute("user")
    public Usuario Usuario() {
        return new Usuario();
    }

    @GetMapping
    public String muestrRegistro(Model model) {
        return "registro";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") @Valid Usuario user, 
                                      BindingResult result){

        Usuario existe = userService.findByEmail(user.getEmail());
        if (existe != null){
            result.rejectValue("email", null, "¡Oops! Ya hay un usuario con ese correo. ");
        }

        if (result.hasErrors()){
            return "registro";
        }

        userService.saveUsuario(user);
        return "redirect:/";
    }

}
