package com.example.bookingJuan.service;

import com.example.bookingJuan.dto.dtoEntrada.modificacion.ReservaModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.reserva.ReservaEntradaDto;
import com.example.bookingJuan.dto.dtoSalida.ReservaSalidaDto;
import com.example.bookingJuan.exceptions.BadRequestException;
import com.example.bookingJuan.exceptions.ResourceNotFoundException;

import java.util.List;

public interface IReservaService {

    List<ReservaSalidaDto> detallarReservas() ;

    ReservaSalidaDto crearReserva(ReservaEntradaDto reserva) throws BadRequestException, ResourceNotFoundException;
    void eliminarReservaPorId(Long id) throws ResourceNotFoundException;
    ReservaSalidaDto buscarReservaPorId(Long id) throws ResourceNotFoundException;
    ReservaSalidaDto actualizarReserva(ReservaModificacionEntrada reservaModificacionEntrada) throws ResourceNotFoundException;

}
