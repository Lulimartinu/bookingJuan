package com.example.bookingJuan.service.impl;

import com.example.bookingJuan.dto.dtoEntrada.modificacion.ProfesorModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.modificacion.ReservaModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.profesor.ProfesorEntradaDto;
import com.example.bookingJuan.dto.dtoEntrada.reserva.ReservaEntradaDto;
import com.example.bookingJuan.dto.dtoSalida.ProfesorSalidaDto;
import com.example.bookingJuan.dto.dtoSalida.ReservaSalidaDto;
import com.example.bookingJuan.entity.Profesor;
import com.example.bookingJuan.entity.Reserva;
import com.example.bookingJuan.exceptions.BadRequestException;
import com.example.bookingJuan.exceptions.ResourceNotFoundException;
import com.example.bookingJuan.repository.ProfesorRepository;
import com.example.bookingJuan.service.IProfesorService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfesorService implements IProfesorService {
    private final Logger LOGGER = LoggerFactory.getLogger(ReservaService.class);
    private final ProfesorRepository profesorRepository;
    private final ModelMapper modelMapper;

    public ProfesorService(ProfesorRepository profesorRepository, ModelMapper modelMapper) {
        this.profesorRepository = profesorRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<ProfesorSalidaDto> detallarProfesor() {
        return null;
    }

    @Override
    public ProfesorSalidaDto crearProfesor(ProfesorEntradaDto profesor) throws BadRequestException, ResourceNotFoundException {
        Profesor profesor1 = profesorRepository.save(profesorEntradaDtoaEntidad(profesor));
        ProfesorSalidaDto profesorSalidaDto = entidadAProfesorSalidaDto(profesor1);
        LOGGER.info("Se ha creado profesor con éxito ", profesorSalidaDto);
        return profesorSalidaDto;
    }

    @Override
    public void eliminarProfesorPorId(Long id) throws ResourceNotFoundException {
        if (buscarProfesorPorId(id) != null){
            profesorRepository.deleteById(id);
            LOGGER.warn("Se ha eliminado profesor coon el id " + id);
        }
        else{
            LOGGER.error("no se ha encontrado un profesor con el id " + id + " en la BDD");
        }
    }

    @Override
    public ProfesorSalidaDto buscarProfesorPorId(Long id) throws ResourceNotFoundException {
        Profesor profesorBuscado = profesorRepository.findById(id).orElse(null);
        ProfesorSalidaDto profesorSalidaDto = null;
        if (profesorBuscado != null) {
            profesorSalidaDto = entidadAProfesorSalidaDto(profesorBuscado);
            LOGGER.info("se ha encontrado el profesor ", profesorSalidaDto);
        } else {
            LOGGER.error("No se ha encontrado en la BDD un profesor con ese id " + id);
        }
        return profesorSalidaDto;
    }

    @Override
    public ProfesorSalidaDto actualizarProfesor(ProfesorModificacionEntrada profesorModificacionEntrada) throws ResourceNotFoundException {
        return null;
    }

    //MAPEO
    private Profesor profesorEntradaDtoaEntidad(ProfesorEntradaDto profesorEntradaDto){
        return modelMapper.map(profesorEntradaDto, Profesor.class);
    }

    private ProfesorSalidaDto entidadAProfesorSalidaDto(Profesor profesor){
        return modelMapper.map(profesor, ProfesorSalidaDto.class);
    }

    private Profesor profesorModificacionAEntidad(ProfesorModificacionEntrada profesorModificacionEntrada){
        return modelMapper.map(profesorModificacionEntrada, Profesor.class);
    }
}
