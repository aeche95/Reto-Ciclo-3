package com.ciclo3.reto.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo3.reto.Interfaces.ProveedoresRepository;
import com.ciclo3.reto.Modelos.ProveedorModel;

@Service
public class ProveedorService {
	
	@Autowired
	ProveedoresRepository ProveedoresRepo;
	
	public ProveedorModel GuardarProveedor(ProveedorModel proveedor)
	{
		return ProveedoresRepo.save(proveedor);
	}
	
	public Optional<ProveedorModel> ObtenerPorId (Long Id)
	{
		return ProveedoresRepo.findById(Id);
	}
	
	public ArrayList<ProveedorModel> ObtenerProveedores()
	{
		return (ArrayList<ProveedorModel>) ProveedoresRepo.findAll();
	}
	
	public boolean EliminarProveedor(Long Id)
	{
		try
		{
			ProveedoresRepo.deleteById(Id);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
