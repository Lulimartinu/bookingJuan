package com.example.bookingJuan.service.impl;

import com.example.bookingJuan.dto.dtoEntrada.modificacion.ReservaModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.reserva.ReservaEntradaDto;
import com.example.bookingJuan.dto.dtoSalida.ReservaSalidaDto;
import com.example.bookingJuan.exceptions.BadRequestException;
import com.example.bookingJuan.exceptions.ResourceNotFoundException;
import com.example.bookingJuan.service.IReservaService;

import java.util.List;

public class ReservaService implements IReservaService {

    @Override
    public List<ReservaSalidaDto> detallarReservas() {
        return null;
    }

    @Override
    public ReservaSalidaDto crearReserva(ReservaEntradaDto reserva) throws BadRequestException, ResourceNotFoundException {
        return null;
    }

    @Override
    public void eliminarReservaPorId(Long id) throws ResourceNotFoundException {

    }

    @Override
    public ReservaSalidaDto buscarReservaPorId(Long id) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public ReservaSalidaDto actualizarReserva(ReservaModificacionEntrada reservaModificacionEntrada) throws ResourceNotFoundException {
        return null;
    }
}
