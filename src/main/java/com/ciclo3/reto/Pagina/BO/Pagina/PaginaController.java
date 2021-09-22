package com.ciclo3.reto.Pagina.BO.Pagina;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginaController {
	@GetMapping("")
	public String Principal()
	{
		return "Pagina principal";
		
	}

}
