package com.example.bookingJuan.dto.dtoEntrada.reserva;

import com.example.bookingJuan.entity.Alumno;
import com.example.bookingJuan.entity.Clase;

import javax.validation.constraints.NotNull;

public class ReservaEntradaDto {
    @NotNull(message = "Debe seleccionar una clase")
    private Long claseId;
    @NotNull(message = "Debe seleccionar un alumno")
    private Long alumnoId;

    public ReservaEntradaDto() {
    }

    public ReservaEntradaDto(Long claseId, Long alumnoId) {
        this.claseId = claseId;
        this.alumnoId = alumnoId;
    }

    public Long getClaseId() {
        return claseId;
    }

    public void setClaseId(Long claseId) {
        this.claseId = claseId;
    }

    public Long getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Long alumnoId) {
        this.alumnoId = alumnoId;
    }

}
