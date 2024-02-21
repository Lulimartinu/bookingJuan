package com.example.bookingJuan.service;

import com.example.bookingJuan.dto.dtoEntrada.modificacion.ProfesorModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.modificacion.ReservaModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.profesor.ProfesorEntradaDto;
import com.example.bookingJuan.dto.dtoEntrada.reserva.ReservaEntradaDto;
import com.example.bookingJuan.dto.dtoSalida.ProfesorSalidaDto;
import com.example.bookingJuan.dto.dtoSalida.ReservaSalidaDto;
import com.example.bookingJuan.exceptions.BadRequestException;
import com.example.bookingJuan.exceptions.ResourceNotFoundException;

import java.util.List;

public interface IProfesorService {

    List<ProfesorSalidaDto> detallarProfesor() ;

    ProfesorSalidaDto crearProfesor(ProfesorEntradaDto profesor) throws BadRequestException, ResourceNotFoundException;
    void eliminarProfesorPorId(Long id) throws ResourceNotFoundException;
    ProfesorSalidaDto buscarProfesorPorId(Long id) throws ResourceNotFoundException;
    ProfesorSalidaDto actualizarProfesor(ProfesorModificacionEntrada profesorModificacionEntrada) throws ResourceNotFoundException;

}
