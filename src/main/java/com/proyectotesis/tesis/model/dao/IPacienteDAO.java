package com.proyectotesis.tesis.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyectotesis.tesis.model.entidad.Paciente;

public interface IPacienteDAO extends CrudRepository<Paciente, Long>{
    
}
