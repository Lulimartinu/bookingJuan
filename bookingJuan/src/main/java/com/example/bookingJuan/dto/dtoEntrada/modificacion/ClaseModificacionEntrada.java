package com.example.bookingJuan.dto.dtoEntrada.modificacion;

import com.example.bookingJuan.entity.Profesor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class ClaseModificacionEntrada {
    @NotNull
    private Long id;
    @NotNull
    private String nombre;
    @NotNull
    private String lugar;
    @NotNull
    private LocalDateTime fechaYhora;
    @NotNull
    private Profesor profesor;

    public ClaseModificacionEntrada() {
    }

    public ClaseModificacionEntrada(Long id, String nombre, String lugar, LocalDateTime fechaYhora, Profesor profesor) {
        this.id = id;
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaYhora = fechaYhora;
        this.profesor = profesor;
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

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDateTime getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(LocalDateTime fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
