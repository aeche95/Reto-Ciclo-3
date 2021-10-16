package com.ciclo3.reto.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo3.reto.Interfaces.VentasRepository;
import com.ciclo3.reto.Modelos.VentasModel;

@Service
public class VentasService {
	@Autowired
	VentasRepository VentasRepo;
	
	public VentasModel GuardarVenta(VentasModel Ventas)
	{
		return VentasRepo.save(Ventas);
	}
	
	public Optional<VentasModel> ObtenerPorId (Long Id)
	{
		return VentasRepo.findById(Id);
	}
	
	public ArrayList<VentasModel> ObtenerVentas()
	{
		return (ArrayList<VentasModel>) VentasRepo.findAll();
	}
	
	public boolean EliminarVenta(Long Id)
	{
		try
		{
			VentasRepo.deleteById(Id);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
