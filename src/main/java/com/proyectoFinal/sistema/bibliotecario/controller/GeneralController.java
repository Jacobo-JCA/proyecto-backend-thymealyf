package com.proyectoFinal.sistema.bibliotecario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

}
