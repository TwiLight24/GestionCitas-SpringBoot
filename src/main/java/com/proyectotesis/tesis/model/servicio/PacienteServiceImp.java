package com.proyectotesis.tesis.model.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectotesis.tesis.model.dao.IPacienteDAO;

import com.proyectotesis.tesis.model.entidad.Paciente;


@Service
public class PacienteServiceImp implements IPacienteService {

    @Autowired
    private IPacienteDAO pacienteDAO;



    @Override
    @Transactional(readOnly = true)
    public List<Paciente> listarPaciente() {
       return (List<Paciente>) pacienteDAO.findAll();
    }

    @Override
    @Transactional
    public void guardarPaciente(Paciente paciente) {
        pacienteDAO.save(paciente);
    }

    @Override
    @Transactional(readOnly = true)
    public Paciente buscarPersona(Long id) {
        Optional<Paciente> paciente = pacienteDAO.findById(id);
        return paciente.orElse(null);
    }
    
}
