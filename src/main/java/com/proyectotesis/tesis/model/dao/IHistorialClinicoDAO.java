package com.proyectotesis.tesis.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyectotesis.tesis.model.entidad.HistorialClinico;

public interface IHistorialClinicoDAO extends CrudRepository<HistorialClinico, Long>{
    
}
