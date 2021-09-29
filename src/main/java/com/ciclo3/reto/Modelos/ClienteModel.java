package com.ciclo3.reto.Modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Clientes")
public class ClienteModel {
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private Long idCliente;
	 private String nombreCliente;
	 private String apellidoCliente;
	 
	 
	 
	 public ClienteModel() {
		super();
	}

	public ClienteModel(Long idCliente, String nombreCliente, String apellidoCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
	}

	/**
	  * @return the idCliente
	  */
	 public Long getIdCliente() {
	  return idCliente;
	 }
	 
	 /**
	  * @param idCliente the idCliente to set
	  */
	 public void setIdCliente(Long idCliente) {
	  this.idCliente = idCliente;
	 }
	 
	 
	 /**
	  * @return the nombreCliente
	  */
	 public String getNombreCliente() {
	  return nombreCliente;
	 }
	 /**
	  * @param nombreCliente the nombreCliente to set
	  */
	 public void setNombreCliente(String nombreCliente) {
	  this.nombreCliente = nombreCliente;
	 }
	 
	 
	 /**
	  * @return the nombreCliente
	  */
	 public String getApellidoCliente() {
	  return apellidoCliente;
	 }
	 /**
	  * @param nombreCliente the nombreCliente to set
	  */
	 public void setApellidoCliente(String nombreCliente) {
	  this.apellidoCliente = nombreCliente;
	 }
	 

}
