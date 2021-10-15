package com.ciclo3.reto.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo3.reto.Interfaces.ProductosRepository;
import com.ciclo3.reto.Modelos.ProductoModel;

@Service
public class ProductoService {

	@Autowired
	ProductosRepository ProductosRepo;

	public ProductoModel GuardarProducto(ProductoModel Producto)
	{
		return ProductosRepo.save(Producto);
	}
	
	public Optional<ProductoModel> ObtenerPorId(Long Id)
	{
		return ProductosRepo.findById(Id);
	}
	
	public ArrayList<ProductoModel> ObtenerProductos()
	{
		return (ArrayList<ProductoModel>) ProductosRepo.findAll();
	}
	
	public boolean EliminarProducto(Long Id)
	{
		try 
		{
			ProductosRepo.deleteById(Id);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
