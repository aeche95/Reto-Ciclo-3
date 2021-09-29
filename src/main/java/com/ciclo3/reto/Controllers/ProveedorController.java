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

import com.ciclo3.reto.Modelos.ProveedorModel;
import com.ciclo3.reto.Services.ProveedorService;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

	@Autowired
	ProveedorService proveedorService;
	
	@GetMapping
	public ArrayList<ProveedorModel> obtenerProveedors()
	{
		return proveedorService.ObtenerProveedores();
	}
	
	@PostMapping
	public ProveedorModel CrearProveedor(@RequestBody ProveedorModel proveedor)
	{
		return proveedorService.GuardarProveedor(proveedor);
	}
	
	@GetMapping(path="{id}")
	public Optional<ProveedorModel> ObtenerPorId(@PathVariable("id") Long Id)
	{
		return proveedorService.ObtenerPorId(Id);
	}
	
	@DeleteMapping(path="{id}")
	public String EliminarPorId(@PathVariable("id") Long Id)
	{
		boolean Eliminado = proveedorService.EliminarProveedor(Id);
		
		if(Eliminado)
		{
			return "Proveedor eliminado";
		}
		else
		{
			return "Error al eliminar proveedor";
		}
		
	}
}
