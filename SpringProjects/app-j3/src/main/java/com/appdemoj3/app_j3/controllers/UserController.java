package com.appdemoj3.app_j3.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.appdemoj3.app_j3.models.User;





@Controller

public class UserController {
    
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Sebas", "Garcia");
        user.setEmail("segalo@gmail.com");
        model.addAttribute("title", ":>");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
            new User("Carlos", "Rueda"),
            new User("Pedro", "Gomez"),
            new User("Martha", "Lucia")
        );

        model.addAttribute("title", "Listado de usuarios");
        model.addAttribute("users", users);
        return "list";
    }
    
}
    

