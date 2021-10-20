package com.ciclo3.reto.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name ="clientes_model", schema="grupo56_equipo3")
@EntityListeners(AuditingEntityListener.class)
public class ClienteModel {
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 @Column(name="id_cliente", columnDefinition="bigint(20)")
	 private Long id_cliente;
	 
	 @Column(name="", columnDefinition="")
	 private String nombre_cliente;
	 
	 @Column(name="", columnDefinition="")
	 private String apellido_cliente;
	 
	 
	 
	 public ClienteModel() {
		super();
	}

	public ClienteModel(Long idCliente, String nombreCliente, String apellidoCliente) {
		super();
		this.id_cliente = idCliente;
		this.nombre_cliente = nombreCliente;
		this.apellido_cliente = apellidoCliente;
	}

	/**
	  * @return the idCliente
	  */
	 public Long getIdCliente() {
	  return id_cliente;
	 }
	 
	 /**
	  * @param idCliente the idCliente to set
	  */
	 public void setIdCliente(Long idCliente) {
	  this.id_cliente = idCliente;
	 }
	 
	 
	 /**
	  * @return the nombreCliente
	  */
	 public String getNombreCliente() {
	  return nombre_cliente;
	 }
	 /**
	  * @param nombreCliente the nombreCliente to set
	  */
	 public void setNombreCliente(String nombreCliente) {
	  this.nombre_cliente = nombreCliente;
	 }
	 
	 
	 /**
	  * @return the nombreCliente
	  */
	 public String getApellidoCliente() {
	  return apellido_cliente;
	 }
	 /**
	  * @param nombreCliente the nombreCliente to set
	  */
	 public void setApellidoCliente(String nombreCliente) {
	  this.apellido_cliente = nombreCliente;
	 }
	 

}
