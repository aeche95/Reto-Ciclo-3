package com.ciclo3.reto.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="productos_model", schema="grupo56_equipo3")
@EntityListeners(AuditingEntityListener.class)
public class ProductoModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_producto", columnDefinition="bigint(20)")
	private Long idProducto;
	
	@Column(name="codigo_producto", columnDefinition="bigint(20)")
	private Long codigo_producto;
	
	@Column(name="nombre_producto", columnDefinition="varchar(255)")
	private String nombre_producto;
	
	@ManyToOne
	@Column(name="FK_nit_proveedor", columnDefinition="bigint(20)")
	private Long nit_proveedor;
	
	@Column(name="precio_compra", columnDefinition="double")
	private double precio_compra;
	
	@Column(name="iva_compra", columnDefinition="double")
	private double iva_compra;
	
	@Column(name="precio_venta", columnDefinition="double")
	private double precio_venta;
	
	
	/**
	 * @return the idProducto
	 */
	public Long getIdProducto() {
		return idProducto;
	}


	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}


	/**
	 * @return the codigo_producto
	 */
	public Long getCodigo_producto() {
		return codigo_producto;
	}


	/**
	 * @param codigo_producto the codigo_producto to set
	 */
	public void setCodigo_producto(Long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}


	/**
	 * @return the nombre_producto
	 */
	public String getNombre_producto() {
		return nombre_producto;
	}


	/**
	 * @param nombre_producto the nombre_producto to set
	 */
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}


	/**
	 * @return the nit_proveedor
	 */
	public Long getNit_proveedor() {
		return nit_proveedor;
	}


	/**
	 * @param nit_proveedor the nit_proveedor to set
	 */
	public void setNit_proveedor(Long nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}


	/**
	 * @return the precio_compra
	 */
	public double getPrecio_compra() {
		return precio_compra;
	}


	/**
	 * @param precio_compra the precio_compra to set
	 */
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}


	/**
	 * @return the iva_compra
	 */
	public double getIva_compra() {
		return iva_compra;
	}


	/**
	 * @param iva_compra the iva_compra to set
	 */
	public void setIva_compra(double iva_compra) {
		this.iva_compra = iva_compra;
	}


	/**
	 * @return the precio_venta
	 */
	public double getPrecio_venta() {
		return precio_venta;
	}


	/**
	 * @param precio_venta the precio_venta to set
	 */
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}


	public ProductoModel(Long idProducto, Long codigo_producto, String nombre_producto, Long nit_proveedor,
			double precio_compra, double iva_compra, double precio_venta) {
		super();
		this.idProducto = idProducto;
		this.codigo_producto = codigo_producto;
		this.nombre_producto = nombre_producto;
		this.nit_proveedor = nit_proveedor;
		this.precio_compra = precio_compra;
		this.iva_compra = iva_compra;
		this.precio_venta = precio_venta;
	}


	public ProductoModel() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "ProductoModel [idProducto=" + idProducto + ", codigo_producto=" + codigo_producto + ", nombre_producto="
				+ nombre_producto + ", Nit_proveedor=" + nit_proveedor + ", precio_compra=" + precio_compra
				+ ", iva_compra=" + iva_compra + ", precio_venta=" + precio_venta + "]";
	}
	

}
