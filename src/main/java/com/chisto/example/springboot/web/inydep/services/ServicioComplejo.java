package com.chisto.example.springboot.web.inydep.services;

import org.springframework.stereotype.Service;

@Service("servicioComplejo")
public class ServicioComplejo implements IServicio{

	@Override
	public String ejecutarPrueba() {
		return "Realizando alguna operación compleja...";
	}
	
}
