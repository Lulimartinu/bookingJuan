package com.example.bookingJuan.service.impl;

import com.example.bookingJuan.dto.dtoEntrada.alumno.AlumnoEntradaDto;
import com.example.bookingJuan.dto.dtoEntrada.modificacion.AlumnoModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.modificacion.ProfesorModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.profesor.ProfesorEntradaDto;
import com.example.bookingJuan.dto.dtoSalida.AlumnoSalidaDto;
import com.example.bookingJuan.dto.dtoSalida.ProfesorSalidaDto;
import com.example.bookingJuan.entity.Alumno;
import com.example.bookingJuan.entity.Profesor;
import com.example.bookingJuan.exceptions.BadRequestException;
import com.example.bookingJuan.exceptions.ResourceNotFoundException;
import com.example.bookingJuan.repository.AlumnoRepository;
import com.example.bookingJuan.service.IAlumnoService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AlumnoService implements IAlumnoService {
    private final Logger LOGGER = LoggerFactory.getLogger(ReservaService.class);
    private final AlumnoRepository alumnoRepository;
    private final ModelMapper modelMapper;

    public AlumnoService(AlumnoRepository alumnoRepository, ModelMapper modelMapper) {
        this.alumnoRepository = alumnoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<AlumnoSalidaDto> detallarAlumnos() {
        return null;
    }

    @Override
    public AlumnoSalidaDto crearAlumno(AlumnoEntradaDto alumno) throws BadRequestException, ResourceNotFoundException {
        Alumno alumno1 = alumnoRepository.save(alumnoEntradaDtoaEntidad(alumno));
        AlumnoSalidaDto alumnoSalidaDto = entidadAalumnoSalidaDto(alumno1);
        LOGGER.info("Se ha creado alumno con éxito ", alumnoSalidaDto);
        return alumnoSalidaDto;
    }

    @Override
    public void eliminarAlumnoPorId(Long id) throws ResourceNotFoundException {
        if (buscarAlumnoPorId(id) != null){
            alumnoRepository.deleteById(id);
            LOGGER.warn("Se ha eliminado alumno coon el id " + id);
        }
        else{
            LOGGER.error("no se ha encontrado un alumno con el id " + id + " en la BDD");
        }

    }

    @Override
    public AlumnoSalidaDto buscarAlumnoPorId(Long id) throws ResourceNotFoundException {
        Alumno alumnoBuscado = alumnoRepository.findById(id).orElse(null);
        AlumnoSalidaDto alumnoSalidaDto = null;
        if (alumnoBuscado != null) {
            alumnoSalidaDto = entidadAalumnoSalidaDto(alumnoBuscado);
            LOGGER.info("se ha encontrado el alumno ", alumnoSalidaDto);
        } else {
            LOGGER.error("No se ha encontrado en la BDD un alumno con ese id " + id);
        }
        return alumnoSalidaDto;
    }

    @Override
    public AlumnoSalidaDto actualizarAlumno(AlumnoModificacionEntrada alumnoModificacionEntrada) throws ResourceNotFoundException {
        return null;
    }


    //MAPEO
    private Alumno alumnoEntradaDtoaEntidad(AlumnoEntradaDto alumnoEntradaDto){
        return modelMapper.map(alumnoEntradaDto, Alumno.class);
    }

    private AlumnoSalidaDto entidadAalumnoSalidaDto(Alumno alumno){
        return modelMapper.map(alumno, AlumnoSalidaDto.class);
    }

    private Alumno alumnoModificacionAentidad(AlumnoModificacionEntrada alumnoModificacionEntrada){
        return modelMapper.map(alumnoModificacionEntrada, Alumno.class);
    }

}
