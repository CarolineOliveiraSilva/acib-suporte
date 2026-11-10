package com.acib.suporte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String exibirLogin() {
        // Retorna o template login.html localizado em src/main/resources/templates/
        return "login";
    }
}