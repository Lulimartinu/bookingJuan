package com.example.bookingJuan.repository;

import com.example.bookingJuan.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReservaRepository extends JpaRepository<Reserva,Long> {

}
