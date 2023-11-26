package com.proyectotesis.tesis.model.dto;

import java.util.Date;

public class RegistroCitaDTO {
    private String tipoDocumento;
    private String dniPaciente;
    private String nomPaciente;
    private String apePaciente;
    private String correoPaciente;
    private String prefijoTelefono;
    private String celularPaciente;
    private String edadPaciente;
    private Date fechaCita;
    private Date fechaNacimiento;
    
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getDniPaciente() {
        return dniPaciente;
    }
    public void setDniPaciente(String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }
    public String getNomPaciente() {
        return nomPaciente;
    }
    public void setNomPaciente(String nomPaciente) {
        this.nomPaciente = nomPaciente;
    }
    public String getApePaciente() {
        return apePaciente;
    }
    public void setApePaciente(String apePaciente) {
        this.apePaciente = apePaciente;
    }
    public String getCorreoPaciente() {
        return correoPaciente;
    }
    public void setCorreoPaciente(String correoPaciente) {
        this.correoPaciente = correoPaciente;
    }
    public String getPrefijoTelefono() {
        return prefijoTelefono;
    }
    public void setPrefijoTelefono(String prefijoTelefono) {
        this.prefijoTelefono = prefijoTelefono;
    }
    public String getCelularPaciente() {
        return celularPaciente;
    }
    public void setCelularPaciente(String celularPaciente) {
        this.celularPaciente = celularPaciente;
    }
    public String getEdadPaciente() {
        return edadPaciente;
    }
    public void setEdadPaciente(String edadPaciente) {
        this.edadPaciente = edadPaciente;
    }
    public Date getFechaCita() {
        return fechaCita;
    }
    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
