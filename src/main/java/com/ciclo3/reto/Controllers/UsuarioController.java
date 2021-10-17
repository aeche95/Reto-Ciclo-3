package com.ciclo3.reto.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciclo3.reto.Modelos.UsuarioModel;
import com.ciclo3.reto.Services.UsuarioService;

@RestController
@RequestMapping("/usuarios/")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("ver")
	public String Usuarios()
	{
		return "usuarios";
	}
	
	
	@GetMapping("")
	public String showUpdateForm(Model model)
	{
		model.addAttribute("usuarios", usuarioService.ObtenerUsuarios());
		return "usuarios";
	}
	
	@PostMapping()
	public UsuarioModel CrearUsuario(@RequestBody UsuarioModel usuario)
	{
		return usuarioService.GuardarUsuario(usuario);
	}
	
	@GetMapping("/{id}")
	public Optional<UsuarioModel> ObtenerPorId(@PathVariable("id") Long Id)
	{
		return usuarioService.ObtenerPorId(Id);
	}
	
	@DeleteMapping(path="eliminar/{id}")
	public String EliminarPorId(@PathVariable("id") Long Id)
	{
		boolean Eliminado = usuarioService.EliminarUsuario(Id);
		
		if(Eliminado)
		{
			return "Usuario eliminado";
		}
		else
		{
			return "Error al eliminar usuario";
		}
		
	}
	

}
