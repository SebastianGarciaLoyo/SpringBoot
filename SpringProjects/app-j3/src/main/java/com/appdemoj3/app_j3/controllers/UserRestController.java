package com.appdemoj3.app_j3.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.appdemoj3.app_j3.models.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("v2/api")
public class UserRestController {
   @GetMapping("/details")
public Map<String,Object> details(){
        User user = new User("Sebas", "Garcia");
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Desarrollando con Spring");
        body.put("user", user);
        return body;
}
   
}
