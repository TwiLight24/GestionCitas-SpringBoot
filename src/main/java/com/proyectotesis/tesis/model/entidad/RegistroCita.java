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
@Table(name = "registro_citas")
public class RegistroCita implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cita_id")
    private Long citaId;

    @Column(name = "pac_dni")
    private String pacDni;

    @Column(name = "pac_fecha_cita")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pacFechaCita;

    @Column(name = "pac_prefijo_telefono")
    private String pacPrefijoTelefono;

    @Column(name = "pac_nombre")
    private String pacNombre;

    @Column(name = "pac_apellido")
    private String pacApellido;

    @Column(name = "pac_correo")
    private String pacCorreo;

    @Column(name = "pac_telefono")
    private String pacTelefono;

    @Column(name = "pac_edad")
    private String pacEdad;

    @Column(name = "pac_fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pacFechaNacimiento;

    public Long getCitaId() {
        return citaId;
    }

    public void setCitaId(Long citaId) {
        this.citaId = citaId;
    }

    public String getPacDni() {
        return pacDni;
    }

    public void setPacDni(String pacDni) {
        this.pacDni = pacDni;
    }

    public Date getPacFechaCita() {
        return pacFechaCita;
    }

    public void setPacFechaCita(Date pacFechaCita) {
        this.pacFechaCita = pacFechaCita;
    }

    public String getPacPrefijoTelefono() {
        return pacPrefijoTelefono;
    }

    public void setPacPrefijoTelefono(String pacPrefijoTelefono) {
        this.pacPrefijoTelefono = pacPrefijoTelefono;
    }

    public String getPacNombre() {
        return pacNombre;
    }

    public void setPacNombre(String pacNombre) {
        this.pacNombre = pacNombre;
    }

    public String getPacApellido() {
        return pacApellido;
    }

    public void setPacApellido(String pacApellido) {
        this.pacApellido = pacApellido;
    }

    public String getPacCorreo() {
        return pacCorreo;
    }

    public void setPacCorreo(String pacCorreo) {
        this.pacCorreo = pacCorreo;
    }

    public String getPacTelefono() {
        return pacTelefono;
    }

    public void setPacTelefono(String pacTelefono) {
        this.pacTelefono = pacTelefono;
    }

    public String getPacEdad() {
        return pacEdad;
    }

    public void setPacEdad(String pacEdad) {
        this.pacEdad = pacEdad;
    }

    public Date getPacFechaNacimiento() {
        return pacFechaNacimiento;
    }

    public void setPacFechaNacimiento(Date pacFechaNacimiento) {
        this.pacFechaNacimiento = pacFechaNacimiento;
    }

}
