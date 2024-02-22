package com.example.bookingJuan.dto.dtoEntrada.modificacion;

import com.example.bookingJuan.entity.Alumno;
import com.example.bookingJuan.entity.Clase;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReservaModificacionEntrada {
    @NotNull
    private Long id;
    @NotNull
    private Clase clase;
    @NotNull
    private Alumno alumno;

    public ReservaModificacionEntrada() {
    }

    public ReservaModificacionEntrada(Long id, Clase clase, Alumno alumno) {
        this.id = id;
        this.clase = clase;
        this.alumno = alumno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
