package com.example.bookingJuan.service.impl;

import com.example.bookingJuan.dto.dtoEntrada.alumno.AlumnoEntradaDto;
import com.example.bookingJuan.dto.dtoEntrada.modificacion.AlumnoModificacionEntrada;
import com.example.bookingJuan.dto.dtoSalida.AlumnoSalidaDto;
import com.example.bookingJuan.exceptions.BadRequestException;
import com.example.bookingJuan.exceptions.ResourceNotFoundException;
import com.example.bookingJuan.service.IAlumnoService;

import java.util.List;

public class AlumnoService implements IAlumnoService {

    @Override
    public List<AlumnoSalidaDto> detallarAlumnos() {
        return null;
    }

    @Override
    public AlumnoSalidaDto crearAlumno(AlumnoEntradaDto alumno) throws BadRequestException, ResourceNotFoundException {
        return null;
    }

    @Override
    public void eliminarAlumnoPorId(Long id) throws ResourceNotFoundException {

    }

    @Override
    public AlumnoSalidaDto buscarAlumnoPorId(Long id) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public AlumnoSalidaDto actualizarAlumno(AlumnoModificacionEntrada alumnoModificacionEntrada) throws ResourceNotFoundException {
        return null;
    }
}
