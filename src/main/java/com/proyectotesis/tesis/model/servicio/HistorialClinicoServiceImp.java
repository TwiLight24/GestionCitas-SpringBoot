package com.proyectotesis.tesis.model.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectotesis.tesis.model.dao.IHistorialClinicoDAO;
import com.proyectotesis.tesis.model.entidad.HistorialClinico;

@Service
public class HistorialClinicoServiceImp implements IHistorialClinicoService{
    
    @Autowired
    private IHistorialClinicoDAO historialclinicoDAO;

    @Override
    public void guardarHistorialClinico(HistorialClinico hisClinico) {
        historialclinicoDAO.save(hisClinico);
        //throw new UnsupportedOperationException("Unimplemented method 'guardarHistorialClinico'");
    }
}
