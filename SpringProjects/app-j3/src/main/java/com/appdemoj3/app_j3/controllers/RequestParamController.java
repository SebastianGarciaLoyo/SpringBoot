package com.appdemoj3.app_j3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appdemoj3.app_j3.models.dto.ParamsDto;

@RestController
@RequestMapping("api/params")
public class RequestParamController {
    @GetMapping("/foo")
    public ParamsDto foo(@RequestParam(required = false, defaultValue = "Hola mundo") String message) {
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }

   /*  @GetMapping("/bar")
    public ParamsDto bar(@RequestParam String text,) {
        return new String();
    }*/
    
}
