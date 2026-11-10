package com.acib.suporte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    // Rota para exibir a página de login (já usada no seu mapeamento raiz)
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Retorna o arquivo login.html da pasta templates
    }
}