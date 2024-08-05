package com.appdemoj3.app_j3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appdemoj3.app_j3.models.User;


@Controller
@RequestMapping("v2/api")
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Sebas", "Garcia");
        model.addAttribute("title", ":>");
        model.addAttribute("user", user);
        return "details";
    }
}
    

