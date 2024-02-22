package com.example.bookingJuan.entity;

import javax.persistence.*;

@Entity
@Table(name = "RESERVA")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "clase_id")
    private Clase clase;
    @ManyToOne
    @JoinColumn(name = "alumno_id")
    private Alumno alumno;

    public Reserva() {
    }

    public Reserva(Long id, Clase clase, Alumno alumno) {
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
