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
@Table(name="proveedor_model", schema ="grupo56_equipo3")
@EntityListeners(AuditingEntityListener.class)
public class ProveedorModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_proveedor", columnDefinition="bigint(20)")
	private Long id_proveedor;
	
	@Column(name="nit_proveedor", columnDefinition="bigint(20)")
	private Integer nit_proveedor;
	
	@Column(name="nombre_proveedor", columnDefinition="varchar(255)")
	private String  nombre_proveedor;
	
	@Column(name="direccion_proveedor", columnDefinition="varchar(255)")
	private String direccion_proveedor;
	
	@Column(name="telefono_proveedor", columnDefinition="varchar(255)")
	private Integer telefono_proveedor;
	
	@Column(name="ciudad_proveedor", columnDefinition="varchar(255)")
	private String ciudad_proveedor;
	
	
	
	public ProveedorModel() {
		super();
	}


	public ProveedorModel(Long idProveedor, Integer nITProveedor, String nombreProveedor, String direccionProveedor,
			Integer telefonoProveedor, String ciudadProveedor) {
		super();
		this.id_proveedor = idProveedor;
		nit_proveedor = nITProveedor;
		nombre_proveedor = nombreProveedor;
		direccion_proveedor = direccionProveedor;
		telefono_proveedor = telefonoProveedor;
		ciudad_proveedor = ciudadProveedor;
	}
	
	
	/**
	 * @return the idProveedor
	 */
	public Long getIdProveedor() {
		return id_proveedor;
	}
	/**
	 * @param idProveedor the idProveedor to set
	 */
	public void setIdProveedor(Long idProveedor) {
		this.id_proveedor = idProveedor;
	}
	/**
	 * @return the nITProveedor
	 */
	public Integer getNITProveedor() {
		return nit_proveedor;
	}
	/**
	 * @param nITProveedor the nITProveedor to set
	 */
	public void setNITProveedor(Integer nITProveedor) {
		nit_proveedor = nITProveedor;
	}
	/**
	 * @return the nombreProveedor
	 */
	public String getNombreProveedor() {
		return nombre_proveedor;
	}
	/**
	 * @param nombreProveedor the nombreProveedor to set
	 */
	public void setNombreProveedor(String nombreProveedor) {
		nombre_proveedor = nombreProveedor;
	}
	/**
	 * @return the direccionProveedor
	 */
	public String getDireccionProveedor() {
		return direccion_proveedor;
	}
	/**
	 * @param direccionProveedor the direccionProveedor to set
	 */
	public void setDireccionProveedor(String direccionProveedor) {
		direccion_proveedor = direccionProveedor;
	}
	/**
	 * @return the telefonoProveedor
	 */
	public Integer getTelefonoProveedor() {
		return telefono_proveedor;
	}
	/**
	 * @param telefonoProveedor the telefonoProveedor to set
	 */
	public void setTelefonoProveedor(Integer telefonoProveedor) {
		telefono_proveedor = telefonoProveedor;
	}
	/**
	 * @return the ciudadProveedor
	 */
	public String getCiudadProveedor() {
		return ciudad_proveedor;
	}
	/**
	 * @param ciudadProveedor the ciudadProveedor to set
	 */
	public void setCiudadProveedor(String ciudadProveedor) {
		ciudad_proveedor = ciudadProveedor;
	}
}
