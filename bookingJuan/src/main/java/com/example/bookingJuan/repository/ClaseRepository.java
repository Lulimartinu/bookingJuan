package com.example.bookingJuan.repository;

import com.example.bookingJuan.entity.Clase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClaseRepository extends JpaRepository<Clase,Long> {
}
