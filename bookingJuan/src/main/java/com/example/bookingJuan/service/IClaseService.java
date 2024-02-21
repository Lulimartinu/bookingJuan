package com.example.bookingJuan.service;

import com.example.bookingJuan.dto.dtoEntrada.clase.ClaseEntradaDto;
import com.example.bookingJuan.dto.dtoEntrada.modificacion.ClaseModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.modificacion.ProfesorModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.profesor.ProfesorEntradaDto;
import com.example.bookingJuan.dto.dtoSalida.ClaseSalidaDto;
import com.example.bookingJuan.dto.dtoSalida.ProfesorSalidaDto;
import com.example.bookingJuan.exceptions.BadRequestException;
import com.example.bookingJuan.exceptions.ResourceNotFoundException;

import java.util.List;

public interface IClaseService {
    List<ClaseSalidaDto> detallarClase() ;

    ClaseSalidaDto crearClase(ClaseEntradaDto clase) throws BadRequestException, ResourceNotFoundException;
    void eliminarClasePorId(Long id) throws ResourceNotFoundException;
    ClaseSalidaDto buscarClasePorId(Long id) throws ResourceNotFoundException;
    ClaseSalidaDto actualizarClase(ClaseModificacionEntrada claseModificacionEntrada) throws ResourceNotFoundException;
}
