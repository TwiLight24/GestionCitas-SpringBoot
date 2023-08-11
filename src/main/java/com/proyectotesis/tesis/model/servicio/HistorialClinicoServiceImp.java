package com.proyectotesis.tesis.model.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectotesis.tesis.model.dao.IHistorialClinicoDAO;

@Service
public class HistorialClinicoServiceImp implements IHistorialClinicoService{
    
    @Autowired
    private IHistorialClinicoDAO historialclinicoDAO;
}
