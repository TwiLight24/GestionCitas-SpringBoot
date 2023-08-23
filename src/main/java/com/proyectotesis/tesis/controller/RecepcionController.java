package com.proyectotesis.tesis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recepcion")
public class RecepcionController {
    
    @RequestMapping("/")
    public String inicio(Model model){
        return "Recepcion_index";
    }

    @RequestMapping("/agendar")
    public String agendar(Model model){
        return "Recepcion_registrarPct.html";
    }
}
