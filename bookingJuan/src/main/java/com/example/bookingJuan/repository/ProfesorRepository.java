package com.example.bookingJuan.repository;

import com.example.bookingJuan.entity.Profesor;
import com.example.bookingJuan.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProfesorRepository extends JpaRepository<Profesor,Long> {
}
