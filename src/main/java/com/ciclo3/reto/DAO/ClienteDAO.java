package com.ciclo3.reto.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.ciclo3.reto.Configuracion.*;
import com.ciclo3.reto.Modelos.Clientes;


/**
 * Clase que permite el acceso a la base de datos
 * 
 *
 */
public class ClienteDAO 
{

 /**
  * Permite registrar un Cliente nuevo
  * @param persona
  */
	
	
 public void registrarPersona(Clientes persona) 
 {
  Conexion conex= new Conexion();
  try {
   Statement estatuto = conex.getConnection().createStatement();
   estatuto.executeUpdate("INSERT INTO Cliente VALUES ('"+persona.getIdCliente()+"', '"
     +persona.getNombreCliente()+"', '"+persona.getApellidoCliente()+"')");
   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
   estatuto.close();
   conex.desconectar();
   
  } catch (SQLException e) {
            System.out.println(e.getMessage());
   JOptionPane.showMessageDialog(null, "No se Registro la persona");
  }
 }
   
 
 
/**
 * permite consultar el Cliente asociado al documento enviado
 * como parametro 
 * @param documento 
 * @return
 */
public ArrayList<Clientes> consultarPersona(int documento) {
  ArrayList< Clientes> miCliente = new ArrayList< Clientes>();
  Conexion conex= new Conexion();
    
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Cliente where idCliente = ? ");
   consulta.setInt(1, documento);
   ResultSet res = consulta.executeQuery();
   
  if(res.next()){
    Clientes persona= new Clientes();
    persona.setIdCliente(Integer.parseInt(res.getString("idCliente")));
    persona.setNombreCliente(res.getString("Nombre"));
    persona.setApellidoCliente(res.getString("Apellido"));
 
    miCliente.add(persona);
          }
          res.close();
          consulta.close();
          conex.desconectar();
   
  } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
  }
  return miCliente;
 }



/**
 * permite consultar la lista de Clientes
 * @return
 */
public ArrayList< Clientes> listaDePersonas() {
  ArrayList< Clientes> miCliente = new ArrayList< Clientes>();
  Conexion conex= new Conexion();
    
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Cliente");
   ResultSet res = consulta.executeQuery();
   while(res.next()){
    Clientes persona= new Clientes();
    persona.setIdCliente(Integer.parseInt(res.getString("idCliente")));
    persona.setNombreCliente(res.getString("nombre"));
    persona.setApellidoCliente(res.getString("Apellido"));
  
    miCliente.add(persona);
          }
          res.close();
          consulta.close();
          conex.desconectar();
   
  } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
  }
  return miCliente;
 }

}