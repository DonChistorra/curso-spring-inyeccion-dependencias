package com.chisto.example.springboot.web.inydep.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/web"})
public class IndexController {

	
	@GetMapping({"", "/", "/index"})
	public String index(Model model) {
		return "index";
	}
	
	@Value("${controllers.index.titulo}")
	private String titulo;
	@Value("${controllers.index.mensaje-bienvenida}")
	private String mensaje_bienvenida;
	
	@ModelAttribute("basicos")
	public Map<String, String> poblarBasicos() {
		Map<String, String> usuarios = new HashMap<String, String>();
		usuarios.put("titulo", titulo);
		usuarios.put("mensaje_bienvenida", mensaje_bienvenida);
		return usuarios;
	}
}

