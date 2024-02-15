package com.example.bookingJuan.dto.dtoEntrada.profesor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.logging.log4j.message.Message;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ProfesorEntradaDto {

    @NotBlank(message = "El profesor debe tener nombre")
    @NotNull(message = "Nombre del profesor no puede ser nulo")
    @Size(max = 50,message = "El nombre del profesor debe tener maximo 50 caracteres")

    private String nombre;
    @NotNull(message = "El numero del dni no puede ser nulo")
    @Pattern(regexp = "^[A-Z]{2}-\\d{1,3}\\d*$")
    @Size(min = 10, message = "El dni debe tener 8 caracteres mínimo")
    @Size(max = 12,message = "El dni debe tener 8 caracteres Maximo")
    private int dni;
    @NotNull(message = "El numero del telefono no puede ser nulo")
    @Pattern(regexp = "^[A-Z]{2}-\\d{1,3}\\d*$")
    @Size(min = 10, message = "El numero de telefono debe tener 10 caracteres mínimo")
    @Size(max = 12,message = "El numero de telefono debe tener 12 caracteres Maximo")
    private int telefono;

    @NotBlank(message = "El profesor debe tener mail")
    @NotNull(message = "El mail no puede ser nulo")
    @Size(max = 50,message = "El mail debe tener 50 caracteres como maximo")
    private String mail;
    @NotBlank(message = "Debe ingresar una contraseña")
    @NotNull(message = "La contraseña no puede ser nula")
    @Size(max = 10,message = "la contraseña debe tener 10 caracteres como maximo")
    private String contrasena;
    @NotBlank(message = "Debe ingresar una especialidad")
    @NotNull(message = "La especialidad no puede ser nula")
    @Size(max = 20,message = "la especialidad debe tener 20 caracteres como maximo")
    private String especialidad;

    public ProfesorEntradaDto() {
    }

    public ProfesorEntradaDto(String nombre, int dni, int telefono, String mail, String contrasena, String especialidad) {

        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.contrasena = contrasena;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
