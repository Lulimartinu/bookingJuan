package com.example.bookingJuan.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name="CLASE")
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nombre;
    @Column(length = 50)
    private String lugar;

    private LocalDateTime fechaYhora;
    @ManyToOne
    @JoinColumn(name ="profesor_id")
    private Profesor profesor;

    public Clase() {
    }

    public Clase(Long id, String nombre, String lugar, LocalDateTime fechaYhora, Profesor profesor) {
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
