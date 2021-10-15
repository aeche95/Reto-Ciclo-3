package com.ciclo3.reto.Modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Productos")
public class ProductoModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProducto;
	private Long codigo_producto;
	private String nombre_producto;
	private Long nitproveedor;
	private double precio_compra;
	private double iva_compra;
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
		return nitproveedor;
	}


	/**
	 * @param nit_proveedor the nit_proveedor to set
	 */
	public void setNit_proveedor(Long nit_proveedor) {
		nitproveedor = nit_proveedor;
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
		this.nitproveedor = nit_proveedor;
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
				+ nombre_producto + ", Nit_proveedor=" + nitproveedor + ", precio_compra=" + precio_compra
				+ ", iva_compra=" + iva_compra + ", precio_venta=" + precio_venta + "]";
	}
	

}
