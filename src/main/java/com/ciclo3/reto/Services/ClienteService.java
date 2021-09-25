package com.ciclo3.reto.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo3.reto.Interfaces.ClientesRepository;
import com.ciclo3.reto.Modelos.Clientes;

@Service
public class ClienteService {
	
	@Autowired
	ClientesRepository ClientesRepo;
	
	public Clientes GuardarCliente(Clientes cliente)
	{
		return ClientesRepo.save(cliente);
	}
	
	public ClienteService() {
		// TODO Auto-generated constructor stub
	}

}
