package com.proyectotesis.tesis.model.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "histo_clinicos") // Poner el nombre de la tabla en sql
public class HistorialClinico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hc_id")
    private Long Id;

    @Column(name = "hc_idpaciente")
    private String dniPaciente;

    @Column(name = "hc_nompaciente")
    private String nomPaciente;

    @Column(name = "hc_fecha")
    private String fecha;

    @Column(name = "hc_tmpenfermedad")
    private String tmpEnfermedad;

    @Column(name = "hc_motivoconsult")
    private String motivoConsulta;

    @Column(name = "hc_sintomas")
    private String sintomas;

    @Column(name = "hc_fomrinicio")
    private String formaInicio;

    @Column(name = "hc_antefamiliares")
    private String anteFamiliares;

    @Column(name = "hc_antepersonales")
    private String antePersonales;

    @Column(name = "hc_tratamiento")
    private String tratamiento;

    @Column(name = "hc_nomdoctor")
    private String nomDoctor;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTmpEnfermedad() {
        return tmpEnfermedad;
    }

    public void setTmpEnfermedad(String tmpEnfermedad) {
        this.tmpEnfermedad = tmpEnfermedad;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getFormaInicio() {
        return formaInicio;
    }

    public void setFormaInicio(String formaInicio) {
        this.formaInicio = formaInicio;
    }

    public String getAnteFamiliares() {
        return anteFamiliares;
    }

    public void setAnteFamiliares(String anteFamiliares) {
        this.anteFamiliares = anteFamiliares;
    }

    public String getAntePersonales() {
        return antePersonales;
    }

    public void setAntePersonales(String antePersonales) {
        this.antePersonales = antePersonales;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getNomDoctor() {
        return nomDoctor;
    }

    public void setNomDoctor(String nomDoctor) {
        this.nomDoctor = nomDoctor;
    }

    

}
