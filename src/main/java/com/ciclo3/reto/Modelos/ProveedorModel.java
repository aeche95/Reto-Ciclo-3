package com.ciclo3.reto.Modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Proveedores")
public class ProveedorModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProveedor;
	private Integer NITProveedor;
	private String  NombreProveedor;
	private String DireccionProveedor;
	private Integer TelefonoProveedor;
	private String CiudadProveedor;
	
	
	
	public ProveedorModel() {
		super();
	}


	public ProveedorModel(Long idProveedor, Integer nITProveedor, String nombreProveedor, String direccionProveedor,
			Integer telefonoProveedor, String ciudadProveedor) {
		super();
		this.idProveedor = idProveedor;
		NITProveedor = nITProveedor;
		NombreProveedor = nombreProveedor;
		DireccionProveedor = direccionProveedor;
		TelefonoProveedor = telefonoProveedor;
		CiudadProveedor = ciudadProveedor;
	}
	
	
	/**
	 * @return the idProveedor
	 */
	public Long getIdProveedor() {
		return idProveedor;
	}
	/**
	 * @param idProveedor the idProveedor to set
	 */
	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}
	/**
	 * @return the nITProveedor
	 */
	public Integer getNITProveedor() {
		return NITProveedor;
	}
	/**
	 * @param nITProveedor the nITProveedor to set
	 */
	public void setNITProveedor(Integer nITProveedor) {
		NITProveedor = nITProveedor;
	}
	/**
	 * @return the nombreProveedor
	 */
	public String getNombreProveedor() {
		return NombreProveedor;
	}
	/**
	 * @param nombreProveedor the nombreProveedor to set
	 */
	public void setNombreProveedor(String nombreProveedor) {
		NombreProveedor = nombreProveedor;
	}
	/**
	 * @return the direccionProveedor
	 */
	public String getDireccionProveedor() {
		return DireccionProveedor;
	}
	/**
	 * @param direccionProveedor the direccionProveedor to set
	 */
	public void setDireccionProveedor(String direccionProveedor) {
		DireccionProveedor = direccionProveedor;
	}
	/**
	 * @return the telefonoProveedor
	 */
	public Integer getTelefonoProveedor() {
		return TelefonoProveedor;
	}
	/**
	 * @param telefonoProveedor the telefonoProveedor to set
	 */
	public void setTelefonoProveedor(Integer telefonoProveedor) {
		TelefonoProveedor = telefonoProveedor;
	}
	/**
	 * @return the ciudadProveedor
	 */
	public String getCiudadProveedor() {
		return CiudadProveedor;
	}
	/**
	 * @param ciudadProveedor the ciudadProveedor to set
	 */
	public void setCiudadProveedor(String ciudadProveedor) {
		CiudadProveedor = ciudadProveedor;
	}
}
