package com.chisto.example.springboot.web.inydep.services;

import org.springframework.stereotype.Service;

@Service("servicioSencillo")
public class ServicioSencillo implements IServicio{

	@Override
	public String ejecutarPrueba() {
		return "Realizando alguna operación sencilla...";
	}

}
