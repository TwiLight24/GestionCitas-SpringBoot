package com.proyectotesis.tesis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
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
