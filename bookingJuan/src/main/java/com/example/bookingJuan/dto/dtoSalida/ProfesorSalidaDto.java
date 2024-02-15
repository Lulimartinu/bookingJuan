package com.example.bookingJuan.dto.dtoSalida;

public class ProfesorSalidaDto {
    private Long id;
    private String nombre;
    private int dni;
    private int telefono;
    private String mail;
    private String contrasena;
    private String especialidad;

    public ProfesorSalidaDto() {
    }

    public ProfesorSalidaDto(String nombre, int dni, int telefono, String mail, String contrasena, String especialidad) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.contrasena = contrasena;
        this.especialidad = especialidad;
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
