package com.ciclo3.reto.Configuracion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludar {
	
	@RequestMapping("/saludar")
	public String Saludar() {
		
		return "Hola mundo";
	}

}
