package com.example.bookingJuan.dto.dtoEntrada.profesor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.logging.log4j.message.Message;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ProfesorEntradaDto {

    @NotBlank(message = "Odontologo debe tener nombre")
    @NotNull(message = "Nombre de odontologo no puede ser nulo")
    @Size(max = 50,message = "El nombre odontologo debe tener maximo 50 caracteres")

    private String nombre;

}
