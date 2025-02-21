package com.guilherme.spring_security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Bem-vindo a minha API Spring boot web";
    }

    @GetMapping("/users")
    public String users(){
        return "Usuário autorizado";
    }

    @GetMapping("/managers")
    public String managers(){
        return "manager autorizado";
    }
}
