package com.proyectotesis.tesis.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyectotesis.tesis.model.entidad.RegistroCita;

public interface IRegistroCitaDAO extends CrudRepository<RegistroCita, Long>{
    
}
