package com.proyectotesis.tesis.model.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pacientes")
public class Paciente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Long idPaciente;

    @Column(name = "pac_dni")
    private String dniPaciente;

    @Column(name = "pac_nombre")
    private String nomPaciente;

    @Column(name = "pac_apellido")
    private String apePaciente;

    @Column(name = "pac_correo")
    private String correoPaciente;

    @Column(name = "pac_telefono")
    private String celularPaciente;

    @Column(name = "pac_edad")
    private String edadPaciente;

    @Column(name = "pac_fecha_nacimiento")
    @Temporal(TemporalType.DATE) // De nuevo, solo la fecha sin tiempo
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;

    @Column(name = "pac_prefijo_telefono")
    private String prefijoTelefono;

    public Long getDniPaciente() {
        return idPaciente;
    }

    public void setDniPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPrefijoTelefono() {
        return prefijoTelefono;
    }

    public void setPrefijoTelefono(String prefijoTelefono) {
        this.prefijoTelefono = prefijoTelefono;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setDniPaciente(String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }


}
