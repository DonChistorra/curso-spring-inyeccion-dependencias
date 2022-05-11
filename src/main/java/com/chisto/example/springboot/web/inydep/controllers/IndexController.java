package com.chisto.example.springboot.web.inydep.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chisto.example.springboot.web.inydep.services.IServicio;

@Controller
@RequestMapping({"/web"})
public class IndexController {
	
	@Value("${controllers.index.titulo}")
	private String titulo;
	@Value("${controllers.index.mensaje-bienvenida}")
	private String mensaje_bienvenida;

	@Autowired
	@Qualifier("servicioComplejo")
	private IServicio servicio;
	
	@GetMapping({"", "/", "/index"})
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping("/pruebaGenerica")
	public String testPruebaGenerica(Model model){
		model.addAttribute("texto_prueba", servicio.ejecutarPrueba());
		return "pruebas";
	}
	
//	@GetMapping("/pruebaSencilla")
//	public String testPruebaSencilla(Model model){
//		model.addAttribute("texto_prueba", servicio.ejecutarPrueba());
//		return "pruebas";
//	}
//	
//	@GetMapping("/pruebaCompleja")
//	public String testPruebaCompleja(Model model){
//		model.addAttribute("texto_prueba", servicio.ejecutarPrueba());
//		return "pruebas";
//	}
	
	@ModelAttribute("basicos")
	public Map<String, String> poblarBasicos() {
		Map<String, String> usuarios = new HashMap<String, String>();
		usuarios.put("titulo", titulo);
		usuarios.put("mensaje_bienvenida", mensaje_bienvenida);
		return usuarios;
	}
}

