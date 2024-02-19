package com.example.bookingJuan.service.impl;

import com.example.bookingJuan.dto.dtoEntrada.modificacion.ReservaModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.reserva.ReservaEntradaDto;
import com.example.bookingJuan.dto.dtoSalida.ReservaSalidaDto;
import com.example.bookingJuan.entity.Reserva;
import com.example.bookingJuan.exceptions.BadRequestException;
import com.example.bookingJuan.exceptions.ResourceNotFoundException;
import com.example.bookingJuan.repository.ReservaRepository;
import com.example.bookingJuan.service.IReservaService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ReservaService implements IReservaService {
    private final Logger LOGGER = LoggerFactory.getLogger(ReservaService.class);
    private final ReservaRepository reservaRepository;
    private final ModelMapper modelMapper;
    private final ClaseService claseService;
    private final AlumnoService alumnoService;

    public ReservaService(ReservaRepository reservaRepository, ModelMapper modelMapper, ClaseService claseService, AlumnoService alumnoService) {
        this.reservaRepository = reservaRepository;
        this.modelMapper = modelMapper;
        this.claseService = claseService;
        this.alumnoService = alumnoService;
    }

    @Override
    public List<ReservaSalidaDto> detallarReservas() {
        return null;
    }

    @Override
    public ReservaSalidaDto crearReserva(ReservaEntradaDto reserva) throws BadRequestException, ResourceNotFoundException {
        Reserva reservaGuardada = reservaRepository.save(reservaEntradaDtoAentidad(reserva));
        ReservaSalidaDto reservaSalidaDto = entidadAreservaSalidaDto(reservaGuardada);
        LOGGER.info("Se ha reservado la clase con éxito ", reservaSalidaDto);
        return reservaSalidaDto;
    }

    @Override
    public void eliminarReservaPorId(Long id) throws ResourceNotFoundException {
        if (buscarReservaPorId(id) != null){
            reservaRepository.deleteById(id);
            LOGGER.warn("Se ha eliminado la reserva coon el id" + id);
        }
        else{
            LOGGER.error("no se ha encontrado la reserva con el id" + id + " en la BDD");
        }
    }

    @Override
    public ReservaSalidaDto buscarReservaPorId(Long id) throws ResourceNotFoundException {
        Reserva reservaBuscada = reservaRepository.findById(id).orElse(null);
        ReservaSalidaDto reservaSalidaDto = null;
        if (reservaBuscada != null) {
            reservaSalidaDto = entidadAreservaSalidaDto(reservaBuscada);
            LOGGER.info("se ha encontrado la reserva", reservaSalidaDto);
        } else {
            LOGGER.error("No se ha encontrado en la BDD una reserva con ese id" + id);
        }
        return reservaSalidaDto;
        }

    @Override
    public ReservaSalidaDto actualizarReserva(ReservaModificacionEntrada reservaModificacionEntrada) throws ResourceNotFoundException {
        return null;
    }

    private Reserva reservaEntradaDtoAentidad(ReservaEntradaDto reservaEntradaDto){
        return modelMapper.map(reservaEntradaDto, Reserva.class);
    }

    private ReservaSalidaDto entidadAreservaSalidaDto(Reserva reserva){
        return modelMapper.map(reserva, ReservaSalidaDto.class);
    }

    private Reserva reservaModificacionDeEntradaAentidad(ReservaModificacionEntrada reservaModificacionEntrada){
        return modelMapper.map(reservaModificacionEntrada, Reserva.class);

    }

}
