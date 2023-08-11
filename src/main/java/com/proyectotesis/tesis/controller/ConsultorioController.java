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

    @RequestMapping("/verhistorial")
    public String Consultorio_VisualizarHistorialClinico(Model model){
        return "Consultorio_listaH.C.html";
    }

    @RequestMapping("/reghistorial")
    public String Consultorio_RegistrarHistorialClinico(Model model){
        return "Consultorio_registrarH.C.html";
    }

    //PARA VISUALIZAR LOS MODELOS PARA GRAFICOS
    @RequestMapping("/prueba")
    public String prueba(Model model){
        return "tables.html";
    }
}
