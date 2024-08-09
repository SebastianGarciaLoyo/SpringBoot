package com.actividad1.formulario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class UserController {
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("titulo", "Bienvenido");
        model.addAttribute("subtitulo", "Ingrese los datos que se piden por favor");
        return "form";
    }
    
}
