package com.example.bookingJuan.exceptions;

public class BadRequestException extends Exception
{
    public BadRequestException(String mensaje){
        super(mensaje);
    }
}
