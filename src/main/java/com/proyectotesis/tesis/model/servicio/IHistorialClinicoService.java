package com.proyectotesis.tesis.model.servicio;

import java.util.List;

import com.proyectotesis.tesis.model.entidad.HistorialClinico;

public interface IHistorialClinicoService{
    public void guardarHistorialClinico(HistorialClinico hisClinico);
    public List<HistorialClinico> listarHistorialClinicos();
}
