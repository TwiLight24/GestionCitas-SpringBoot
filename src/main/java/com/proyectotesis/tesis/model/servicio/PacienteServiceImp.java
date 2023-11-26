package com.proyectotesis.tesis.model.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyectotesis.tesis.model.dao.IPacienteDAO;
import com.proyectotesis.tesis.model.dao.IRegistroCitaDAO;
import com.proyectotesis.tesis.model.dto.RegistroCitaDTO;
import com.proyectotesis.tesis.model.entidad.Paciente;
import com.proyectotesis.tesis.model.entidad.RegistroCita;

@Service
public class PacienteServiceImp implements IPacienteService {

    @Autowired
    private IPacienteDAO pacienteDAO;

    @Autowired
    private IRegistroCitaDAO registroCitaDAO;

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
    

    public void procesarRegistroCitaDTO(RegistroCitaDTO dto) {
        // Convertir DTO a entidades y guardar
        Paciente paciente = convertirDtoAPaciente(dto);
        pacienteDAO.save(paciente);
        
        RegistroCita registroCita = convertirDtoARegistroCita(dto, paciente);
        registroCitaDAO.save(registroCita);
    }

    private Paciente convertirDtoAPaciente(RegistroCitaDTO dto) {
        Paciente paciente = new Paciente();
        paciente.setDniPaciente(dto.getDniPaciente()); // Asumiendo que es un String. Si es numérico, puedes necesitar convertirlo.
        paciente.setNomPaciente(dto.getNomPaciente());
        paciente.setApePaciente(dto.getApePaciente());
        paciente.setCorreoPaciente(dto.getCorreoPaciente());
        paciente.setCelularPaciente(dto.getCelularPaciente());
        paciente.setEdadPaciente(dto.getEdadPaciente());
        paciente.setFechaNacimiento(dto.getFechaNacimiento());
        paciente.setPrefijoTelefono(dto.getPrefijoTelefono());
        return paciente;
    }
    
    private RegistroCita convertirDtoARegistroCita(RegistroCitaDTO dto, Paciente paciente) {
        RegistroCita registroCita = new RegistroCita();
        registroCita.setPacDni(dto.getDniPaciente()); // Usa el ID del paciente si es necesario
        registroCita.setPacFechaCita(dto.getFechaCita());
        registroCita.setPacPrefijoTelefono(dto.getPrefijoTelefono());
        registroCita.setPacNombre(dto.getNomPaciente());
        registroCita.setPacApellido(dto.getApePaciente());
        registroCita.setPacCorreo(dto.getCorreoPaciente());
        registroCita.setPacTelefono(dto.getCelularPaciente());
        registroCita.setPacEdad(dto.getEdadPaciente());
        registroCita.setPacFechaNacimiento(dto.getFechaNacimiento());
        return registroCita;
    }
    
}
