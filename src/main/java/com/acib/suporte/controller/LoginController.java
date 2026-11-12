package com.acib.suporte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login() {
        return "login"; // Vai procurar por login.html na pasta templates
    }


    @PostMapping("/login") // ou a rota para onde o form aponta
public String processLogin() {
    // Lógica de autenticação ou redirecionamento para o dashboard
    return "redirect:/dashboard";
}
}