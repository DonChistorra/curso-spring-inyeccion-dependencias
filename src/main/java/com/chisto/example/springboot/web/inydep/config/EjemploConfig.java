package com.chisto.example.springboot.web.inydep.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chisto.example.springboot.web.inydep.services.IServicio;
import com.chisto.example.springboot.web.inydep.services.ServicioComplejo;
import com.chisto.example.springboot.web.inydep.services.ServicioSencillo;

@Configuration
public class EjemploConfig {

	@Bean("servicioComplejo")
	public IServicio registrarServicioComplejo() {
		return new ServicioComplejo();
	}
	
	@Bean("servicioSencillo")
	public IServicio registrarServicioSencillo() {
		return new ServicioSencillo();
	}
}
