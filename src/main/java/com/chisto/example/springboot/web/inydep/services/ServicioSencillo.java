package com.chisto.example.springboot.web.inydep.services;

//@Service("servicioSencillo")
public class ServicioSencillo implements IServicio{

	@Override
	public String ejecutarPrueba() {
		return "Realizando alguna operación sencilla...";
	}

}
