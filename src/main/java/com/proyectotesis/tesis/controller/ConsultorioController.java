package com.proyectotesis.tesis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/consultorio")
public class ConsultorioController {

    @RequestMapping("/")
    public String inicio(Model model){
        return "Consultorio_index";
    }


    @RequestMapping("/pacientes")
    public String Consultorio_ListaClientes(Model model){
        return "Consultorio_listaClientes.html";
    }

    @RequestMapping("/historial")
    public String Consultorio_HistorialClinico(Model model){
        return "Consultorio_listaHistorial.html";
    }  
}
