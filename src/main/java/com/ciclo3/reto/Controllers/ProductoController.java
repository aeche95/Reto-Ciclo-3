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

import com.ciclo3.reto.Modelos.ProductoModel;
import com.ciclo3.reto.Services.ProductoService;


@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	ProductoService productoService;
	
	@GetMapping
	public ArrayList<ProductoModel> obtenerProductos()
	{
		return productoService.ObtenerProductos();
	}

	@PostMapping
	public ProductoModel CrearCliente(@RequestBody ProductoModel producto)
	{
		return productoService.GuardarProducto(producto);
	}
	
	@GetMapping(path="{id}")
	public Optional<ProductoModel> ObtenerPorId(@PathVariable("id") Long Id)
	{
		return productoService.ObtenerPorId(Id);
	}
	
	@DeleteMapping(path="{id}")
	public String EliminarPorId(@PathVariable("id") Long Id)
	{
		boolean Eliminado = productoService.EliminarProducto(Id);
		
		if(Eliminado)
		{
			return "Producto eliminado";
		}
		else
		{
			return "Error al eliminar producto";
		}
		
	}
}
