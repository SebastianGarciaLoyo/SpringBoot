package com.actividad1.formulario.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.actividad1.formulario.models.dto.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping(value = "api/infouser", method = RequestMethod.POST)
public class UserRestController {
    List<User> usuarios = new ArrayList<>();
    @GetMapping("/forms")
    public List<User> forms(String name, String lastname, int age, String nationality) {
        
        usuarios.add(new User(name,lastname,age,nationality));
        return usuarios;

    }
    
}
