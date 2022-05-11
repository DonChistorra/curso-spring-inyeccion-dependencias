package com.chisto.example.springboot.web.inydep.services;

import org.springframework.stereotype.Service;

@Service
public class ServicioPrueba {

	public String pruebaSencilla() {
		return "Realizando alguna operación sencilla...";
	}
	
	public String pruebaComleja() {
		return "Realizando alguna operación compleja...";
	}
	
}
