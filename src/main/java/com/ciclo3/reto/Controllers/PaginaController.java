package com.ciclo3.reto.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginaController {
	@GetMapping("")
	public String Principal()
	{
		return "login";
		
	}

}
