package com.example.bookingJuan.service;

import com.example.bookingJuan.dto.dtoEntrada.alumno.AlumnoEntradaDto;
import com.example.bookingJuan.dto.dtoEntrada.modificacion.AlumnoModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.modificacion.ProfesorModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.profesor.ProfesorEntradaDto;
import com.example.bookingJuan.dto.dtoSalida.AlumnoSalidaDto;
import com.example.bookingJuan.dto.dtoSalida.ProfesorSalidaDto;
import com.example.bookingJuan.exceptions.BadRequestException;
import com.example.bookingJuan.exceptions.ResourceNotFoundException;

import java.util.List;

public interface IAlumnoService {
    List<AlumnoSalidaDto> detallarAlumnos() ;

    AlumnoSalidaDto crearAlumno(AlumnoEntradaDto alumno) throws BadRequestException, ResourceNotFoundException;
    void eliminarAlumnoPorId(Long id) throws ResourceNotFoundException;
    AlumnoSalidaDto buscarAlumnoPorId(Long id) throws ResourceNotFoundException;
    AlumnoSalidaDto actualizarAlumno(AlumnoModificacionEntrada alumnoModificacionEntrada) throws ResourceNotFoundException;
}
