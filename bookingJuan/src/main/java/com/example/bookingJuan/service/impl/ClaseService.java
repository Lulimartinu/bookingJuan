package com.example.bookingJuan.service.impl;

import com.example.bookingJuan.dto.dtoEntrada.clase.ClaseEntradaDto;
import com.example.bookingJuan.dto.dtoEntrada.modificacion.ClaseModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.modificacion.ProfesorModificacionEntrada;
import com.example.bookingJuan.dto.dtoEntrada.profesor.ProfesorEntradaDto;
import com.example.bookingJuan.dto.dtoSalida.ClaseSalidaDto;
import com.example.bookingJuan.dto.dtoSalida.ProfesorSalidaDto;
import com.example.bookingJuan.entity.Clase;
import com.example.bookingJuan.entity.Profesor;
import com.example.bookingJuan.exceptions.BadRequestException;
import com.example.bookingJuan.exceptions.ResourceNotFoundException;
import com.example.bookingJuan.repository.ClaseRepository;
import com.example.bookingJuan.service.IClaseService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ClaseService implements IClaseService {

    private final Logger LOGGER = LoggerFactory.getLogger(ReservaService.class);
    private final ClaseRepository claseRepository;
    private final ModelMapper modelMapper;
    private Profesor profesor;

    public ClaseService(ClaseRepository claseRepository, ModelMapper modelMapper, Profesor profesor) {
        this.claseRepository = claseRepository;
        this.modelMapper = modelMapper;
        this.profesor = profesor;
    }

    @Override
    public List<ClaseSalidaDto> detallarClase() {
        List<ClaseSalidaDto> clases = claseRepository.findAll().stream().map(this::entidadAClaseSalidaDto).toList();
        LOGGER.info("lista de todas las clases disponibles :{}", clases);
        return clases;
    }

    @Override
    public ClaseSalidaDto crearClase(ClaseEntradaDto clase) throws BadRequestException, ResourceNotFoundException {
        Clase clase1 = claseRepository.save(claseEntradaDtoaEntidad(clase));
        ClaseSalidaDto claseSalidaDto = entidadAClaseSalidaDto(clase1);
        LOGGER.info("Se ha creado nueva clase con éxito ", claseSalidaDto);
        return claseSalidaDto;
    }

    @Override
    public void eliminarClasePorId(Long id) throws ResourceNotFoundException {
        if (buscarClasePorId(id) != null){
            claseRepository.deleteById(id);
            LOGGER.warn("Se ha eliminado la clase con el id " + id);
        }
        else{
            LOGGER.error("no se ha encontrado una clase con el id " + id + " en la BDD");
        }

    }

    @Override
    public ClaseSalidaDto buscarClasePorId(Long id) throws ResourceNotFoundException {
        Clase claseBuscada = claseRepository.findById(id).orElse(null);
        ClaseSalidaDto claseSalidaDto = null;
        if (claseBuscada != null) {
            claseSalidaDto = entidadAClaseSalidaDto(claseBuscada);
            LOGGER.info("se ha encontrado en la BDD la clase ", claseSalidaDto);
        } else {
            LOGGER.error("No se ha encontrado en la BDD una clase con ese id " + id);
        }
        return claseSalidaDto;

    }

    @Override
    public ClaseSalidaDto actualizarClase(ClaseModificacionEntrada claseModificacionEntrada) throws ResourceNotFoundException {
        return null;
    }

    //MAPEO
    private Clase claseEntradaDtoaEntidad(ClaseEntradaDto claseEntradaDto){
        return modelMapper.map(claseEntradaDto, Clase.class);
    }

    private ClaseSalidaDto entidadAClaseSalidaDto(Clase clase){
        return modelMapper.map(clase, ClaseSalidaDto.class);
    }

    private Clase claseMoficacionAEntidad(ClaseModificacionEntrada claseModificacionEntrada){
        return modelMapper.map(claseModificacionEntrada, Clase.class);
    }
}
