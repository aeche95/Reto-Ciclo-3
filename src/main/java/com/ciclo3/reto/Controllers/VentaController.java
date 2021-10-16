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

import com.ciclo3.reto.Modelos.VentasModel;
import com.ciclo3.reto.Services.VentasService;

@RestController
@RequestMapping("/ventas")
public class VentaController {
	@Autowired
	VentasService ventaService;
	
	@GetMapping
	public ArrayList<VentasModel> obtenerVentas()
	{
		return ventaService.ObtenerVentas();
	}
	
	@PostMapping
	public VentasModel CrearVenta(@RequestBody VentasModel venta)
	{
		return ventaService.GuardarVenta(venta);
	}
	
	@GetMapping(path="{id}")
	public Optional<VentasModel> ObtenerPorId(@PathVariable("id") Long Id)
	{
		return ventaService.ObtenerPorId(Id);
	}
	
	@DeleteMapping(path="{id}")
	public String EliminarPorId(@PathVariable("id") Long Id)
	{
		boolean Eliminado = ventaService.EliminarVenta(Id);
		
		if(Eliminado)
		{
			return "Venta eliminada";
		}
		else
		{
			return "Error al eliminar venta";
		}
		
	}
	

}
