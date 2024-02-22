package com.example.bookingJuan;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class






BookingJuanApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookingJuanApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BookingJuanApplication.class, args);
		LOGGER.info("el bookingJuan esta corriendo");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
