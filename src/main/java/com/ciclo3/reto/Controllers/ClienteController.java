package com.ciclo3.reto.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciclo3.reto.Modelos.ClienteModel;
import com.ciclo3.reto.Services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public ArrayList<ClienteModel> obtenerClientes()
	{
		return clienteService.ObtenerClientes();
	}
	
	@PostMapping
	public ClienteModel CrearCliente(@RequestBody ClienteModel cliente)
	{
		return clienteService.GuardarCliente(cliente);
	}
	
	@GetMapping(path="{id}")
	public Optional<ClienteModel> ObtenerPorId(@PathVariable("id") Long Id)
	{
		return clienteService.ObtenerPorId(Id);
	}
	
	@DeleteMapping(path="{id}")
	public String EliminarPorId(@PathVariable("id") Long Id)
	{
		boolean Eliminado = clienteService.EliminarCliente(Id);
		
		if(Eliminado)
		{
			return "Cliente eliminado";
		}
		else
		{
			return "Error al eliminar cliente";
		}
		
	}
	
}