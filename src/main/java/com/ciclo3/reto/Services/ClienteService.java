package com.ciclo3.reto.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo3.reto.Interfaces.ClientesRepository;
import com.ciclo3.reto.Modelos.ClienteModel;

@Service
public class ClienteService {
	
	@Autowired
	ClientesRepository ClientesRepo;
	
	public ClienteModel GuardarCliente(ClienteModel cliente)
	{
		return ClientesRepo.save(cliente);
	}
	
	public Optional<ClienteModel> ObtenerPorId (Long Id)
	{
		return ClientesRepo.findById(Id);
	}
	
	public ArrayList<ClienteModel> ObtenerClientes()
	{
		return (ArrayList<ClienteModel>) ClientesRepo.findAll();
	}
	
	public boolean EliminarCliente(Long Id)
	{
		try
		{
			ClientesRepo.deleteById(Id);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
