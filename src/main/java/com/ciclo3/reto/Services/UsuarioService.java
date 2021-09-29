package com.ciclo3.reto.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo3.reto.Interfaces.UsuariosRepository;
import com.ciclo3.reto.Modelos.UsuarioModel;

@Service
public class UsuarioService {
	
	@Autowired
	UsuariosRepository UsuariosRepo;
	
	public UsuarioModel GuardarCliente(UsuarioModel cliente)
	{
		return UsuariosRepo.save(cliente);
	}
	
	public Optional<UsuarioModel> ObtenerPorId (Long Id)
	{
		return UsuariosRepo.findById(Id);
	}
	
	public ArrayList<UsuarioModel> ObtenerClientes()
	{
		return (ArrayList<UsuarioModel>) UsuariosRepo.findAll();
	}
	
	public boolean EliminarCliente(Long Id)
	{
		try
		{
			UsuariosRepo.deleteById(Id);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
