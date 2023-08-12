package com.proyectotesis.tesis.model.servicio;

import java.util.List;

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

    @Override
    public List<HistorialClinico> listarHistorialClinicos() {
        return (List<HistorialClinico>) historialclinicoDAO.findAll();
    }
}
