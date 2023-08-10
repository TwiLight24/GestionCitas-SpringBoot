package com.proyectotesis.tesis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/principal")
public class InicioControler {
    
    @RequestMapping("/")
    public String inicio(Model model){
        return "index.html";
    }    

    @RequestMapping("/buttons")
    public String buttons(Model model){
        return "buttons";
    }
    
}
