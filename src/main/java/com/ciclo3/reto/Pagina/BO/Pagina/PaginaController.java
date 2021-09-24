package com.ciclo3.reto.Pagina.BO.Pagina;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PaginaController {
	@GetMapping("")
	public String Principal()
	{
		return "login.html";
		
	}

}
