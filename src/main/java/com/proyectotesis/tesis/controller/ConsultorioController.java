package com.proyectotesis.tesis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyectotesis.tesis.correo.enviarCorreo;
import com.proyectotesis.tesis.model.entidad.HistorialClinico;
import com.proyectotesis.tesis.model.servicio.IHistorialClinicoService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/consultorio")
public class ConsultorioController {

    @Autowired
    private IHistorialClinicoService histCliniService;

    @Autowired
    private enviarCorreo emailService;

    @GetMapping("/send-email")
    public String sendEmail() {
        emailService.sendHtmlEmail("se_edu@hotmail.com", "PRUEBA ENVIO DE CORREO", "<html><body>" +
        "<h1>Estimado cliente, buenos días.</h1>" +
        "<p>Se presenta su muestra de datos informáticos.</p>" +
        "<p>En caso de presentar inconvenientes, por favor informar.</p>" +
        "</body></html>");

        return "Consultorio_listaH.C";
    }


    @RequestMapping("/")
    public String inicio(Model model){
        return "Consultorio_index";
    }


    @RequestMapping("/pacientes")
    public String Consultorio_ListaClientes(Model model){
        return "Consultorio_listaClientes.html";
    }

     //METODOS PARA REALIZAR LISTADO DE LOS HISTORIALES MEDICOS------------------------------------
    @RequestMapping("/verhistorial")
    public String Consultorio_VisualizarHistorialClinico(Model model){
        model.addAttribute("listahistClinico", histCliniService.listarHistorialClinicos());
        return "Consultorio_listaH.C";
    }

    //METODOS PARA REALIZAR REGISTRO DE UN HISTORIAL MEDICO---------------------------------------
    @RequestMapping("/reghistorial")
    public String Consultorio_RegistrarHistorialClinico(Model model){
        
        HistorialClinico histClinico = new HistorialClinico();
        model.addAttribute("histClinico", histClinico);
        
        return "Consultorio_registrarH.C";
    }

    @RequestMapping(value = "/historialformulario", method = RequestMethod.POST)
    public String FormularioHistorialClinico(HistorialClinico histClinico){
        histCliniService.guardarHistorialClinico(histClinico);
        return "redirect:/consultorio/reghistorial";
    }

    //PARA VISUALIZAR LOS MODELOS PARA GRAFICOS---------------------------------------------------
    @RequestMapping("/prueba")
    public String prueba(Model model){
        return "tables.html";
    }
}
