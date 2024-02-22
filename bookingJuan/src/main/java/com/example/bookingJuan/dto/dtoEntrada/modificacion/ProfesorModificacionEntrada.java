package com.example.bookingJuan.dto.dtoEntrada.modificacion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfesorModificacionEntrada {
    @NotNull()
    private Long id;
    @NotNull()
    private String nombre;
    @NotNull()
    private int dni;
    @NotNull()
    private int telefono;
    @NotNull()
    private String mail;
    @NotNull()
    private String contrasena;
    @NotNull()
    private String especialidad;

    public ProfesorModificacionEntrada() {
    }

    public ProfesorModificacionEntrada(Long id, String nombre, int dni, int telefono, String mail, String contrasena, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.contrasena = contrasena;
        this.especialidad = especialidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
