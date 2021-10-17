package com.ciclo3.reto.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginaController {
	@GetMapping(value = {"", "/index.html"})
	public String index(Model model)
	{
		return "login";
		
	}
	
	@GetMapping("/error")
	public String Error()
	{
		return "login";
	}

}
