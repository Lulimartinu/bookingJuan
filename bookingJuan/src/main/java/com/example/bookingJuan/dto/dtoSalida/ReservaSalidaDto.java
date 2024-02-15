package com.example.bookingJuan.dto.dtoSalida;

import com.example.bookingJuan.entity.Alumno;
import com.example.bookingJuan.entity.Clase;

public class ReservaSalidaDto {
    private Long id;
    private Clase clase;
    private Alumno alumno;

    public ReservaSalidaDto() {
    }

    public ReservaSalidaDto(Long id, Clase clase, Alumno alumno) {
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
