package com.example.bookingJuan.repository;

import com.example.bookingJuan.entity.Alumno;
import com.example.bookingJuan.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno,Long> {
}
