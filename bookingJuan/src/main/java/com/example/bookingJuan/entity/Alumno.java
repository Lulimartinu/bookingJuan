package com.example.bookingJuan.entity;

public class Alumno {
    private Long id;
    private String nombre;
    private int dni;
    private int telefono;
    private String mail;
    private String contrasena;

    public Alumno() {
    }

    public Alumno(String nombre, int dni, int telefono, String mail, String contrasena) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.contrasena = contrasena;
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
}


