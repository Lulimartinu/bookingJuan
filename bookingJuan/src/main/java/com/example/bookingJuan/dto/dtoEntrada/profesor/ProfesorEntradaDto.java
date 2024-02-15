package com.example.bookingJuan.dto.dtoEntrada.profesor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.logging.log4j.message.Message;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@JsonIgnoreProperties(ignoreUnknown = true)

public class ProfesorEntradaDto {
    @NotBlank(message = "Profesor debe tener nombre")
    @NotNull(message = "Nombre de profesor no puede ser nulo")
    @Size(max = 20,message = "El nombre profesor debe tener maximo 20 caracteres")
    private String nombre;

}
