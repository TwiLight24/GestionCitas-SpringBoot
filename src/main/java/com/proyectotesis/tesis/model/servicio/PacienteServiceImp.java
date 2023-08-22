package com.proyectotesis.tesis.model.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectotesis.tesis.model.dao.IPacienteDAO;
import com.proyectotesis.tesis.model.entidad.Paciente;

@Service
public class PacienteServiceImp implements IPacienteService{

    @Autowired
    private IPacienteDAO pacienteDAO;

    @Override
    public List<Paciente> listarPaciente() {
       return (List<Paciente>) pacienteDAO.findAll();
    }
    
}
