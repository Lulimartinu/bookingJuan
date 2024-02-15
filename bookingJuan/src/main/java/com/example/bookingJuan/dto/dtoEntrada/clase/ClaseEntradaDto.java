package com.example.bookingJuan.dto.dtoEntrada.clase;

import com.example.bookingJuan.entity.Profesor;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class ClaseEntradaDto {
    @NotBlank(message = "La clase debe tener nombre")
    @NotNull(message = "El nombre de la clase no puede ser nulo")
    @Size(max = 50,message = "El nombre de la clase debe tener maximo 50 caracteres")
    private String nombre;
    @NotBlank(message = "Ingrese un lugar")
    @NotNull(message = "El nombre del lugar no puede ser nulo")
    @Size(max = 50,message = "El nombre del lugar debe tener maximo 50 caracteres")
    private String lugar;
    @NotNull(message = "Debe ingresar una fecha y hora deseada")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    @FutureOrPresent(message = "La fecha no puede ser anterior al día de hoy")
    private LocalDateTime fechaYhora;

    @NotNull(message = "Debe seleccionar un profesor")
    private Long profesorId ;

    public ClaseEntradaDto() {
    }

    public ClaseEntradaDto(String nombre, String lugar, LocalDateTime fechaYhora, Long profesorId) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaYhora = fechaYhora;
        this.profesorId = profesorId;
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

    public Long getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(Long profesorId) {
        this.profesorId = profesorId;
    }

}
