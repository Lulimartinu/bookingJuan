package com.example.bookingJuan;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingJuanApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookingJuanApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BookingJuanApplication.class, args);
		LOGGER.info("el bookingJuan esta corriendo");
	}

}
