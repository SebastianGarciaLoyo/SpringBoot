package com.appdemoj3.app_j3.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.appdemoj3.app_j3.models.User;
import com.appdemoj3.app_j3.models.dto.UserDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/v2/api")
public class UserRestController {
        @GetMapping("/details")  //Ruta de acceso en localhost
        public UserDto details() {
            UserDto userDto = new UserDto();
            User user = new User("David", "Carreño");
            userDto.setTitle("Desarrollando con Spring Boot CreativeCode");
            userDto.setUser(user);
            return userDto;
        }
    
        @GetMapping("/list-array-details")
        public List<User> listarraydetails() {
            User user = new User("Juan", "Perez");
            User userA = new User("Camilo", "Hernandez");
            User userB = new User("Martha", "Estupiñan");
    
            List<User> lstUsers = new ArrayList<>();
            lstUsers.add(user);
            lstUsers.add(userA);
            lstUsers.add(userB);
            return lstUsers;
        }
}
   
