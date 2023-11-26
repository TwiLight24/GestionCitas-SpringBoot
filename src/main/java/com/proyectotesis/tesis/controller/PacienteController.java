package com.proyectotesis.tesis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*import com.proyectotesis.tesis.model.dao.IPacienteDAO;*/
import com.proyectotesis.tesis.model.entidad.Paciente;
import com.proyectotesis.tesis.model.servicio.IPacienteService;


@Controller
@RequestMapping("/recepcion")
public class PacienteController {

    /*@Autowired
    private IPacienteDAO personaDao;*/

    @Autowired
    private IPacienteService pacienteService;


    
    @RequestMapping("/")
    public String inicio(Model model){
        return "Recepcion_index";
    }

    @RequestMapping("/agendar")
    public String Recepcion(Model model){
        return "Recepcion_registrarPct.html";
    }

    //METODOS PARA REALIZAR LISTADO DE CITAS AGENDAS------------------------------------
    @RequestMapping("/verpaciente")
    public String Recepcion_VisualizarCitaPaciente(Model model){
        model.addAttribute("listaAgPaciente", pacienteService.listarPaciente());
        return "Recepcion_listarPct.html";
    }

    //METODOS PARA REALIZAR REGISTRO DE LAS CITAS AGENDADAS---------------------------------------
    @RequestMapping("/regcita")
    public String Recepcion_RegistrarCitaPaciente(Model model){
        
        Paciente paciente = new Paciente();
        model.addAttribute("pacientes", paciente);
        
        model.addAttribute("listaPaciente", pacienteService.listarPaciente());

        return "Recepcion_registrarPct.html";
    }

    @RequestMapping(value = "/recepcionformulario", method = RequestMethod.POST)
    public String FormularioRecepcionCita( Paciente paciente){
        
        
        pacienteService.guardarPaciente(paciente);
        return "redirect:/recepcion/regcita";
    }

}
