package com.ciclo3.reto.Modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@Table(name="detalle_ventas", schema="grupo56_equipo3")
@EntityListeners(AuditingEntityListener.class)
public class DetalleVentaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2648364995317144132L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigo_detalle_venta", columnDefinition="bigint(20)") 
	private Long codigoDetalleVenta;
	
	@Column(name="cantidad_producto", columnDefinition="int(11)") 
	private Integer cantidad_producto;
	
	@Column(name="codigo_producto",  columnDefinition="bigint(20)") 
	private Long codigo_producto;
	
	@Column(name="codigo_venta", columnDefinition="varchar(20)")
	private String codigo_venta;
	
	@Column(name="valor_total", columnDefinition="double") 
	private Double valor_total;
	
	@Column(name="valor_venta", columnDefinition="double")
	private Double valor_venta;
	
	@Column(name="valor_iva", columnDefinition="double") 
	private Double valor_iva;
	
	@ManyToOne (fetch= FetchType.LAZY)
	@JoinColumn(name="Ventas_idVentas", referencedColumnName="idVentas", columnDefinition="bigint(20)")
	private VentasModel ventasIdVentas;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Productos_codigo_productos", referencedColumnName="codigo_productos", columnDefinition="bigint(20)")
	private ProductoModel productosCodigoProductos;

	public Long getCodigoDetalleVenta() {
		return codigoDetalleVenta;
	}

	public void setCodigoDetalleVenta(Long codigoDetalleVenta) {
		this.codigoDetalleVenta = codigoDetalleVenta;
	}

	public Integer getCantidadProducto() {
		return cantidad_producto;
	}

	public void setCantidadProducto(Integer cantidadProducto) {
		this.cantidad_producto = cantidadProducto;
	}

	public Long getCodigoProducto() {
		return codigo_producto;
	}

	public void setCodigoProducto(Long codigoProducto) {
		this.codigo_producto = codigoProducto;
	}

	public String getCodigoVenta() {
		return codigo_venta;
	}

	public void setCodigoVenta(String codigoVenta) {
		this.codigo_venta = codigoVenta;
	}

	public Double getValorTotal() {
		return valor_total;
	}

	public void setValorTotal(Double valorTotal) {
		this.valor_total = valorTotal;
	}

	public Double getValorVenta() {
		return valor_venta;
	}

	public void setValorVenta(Double valorVenta) {
		this.valor_venta = valorVenta;
	}

	public Double getValorIva() {
		return valor_iva;
	}

	public void setValorIva(Double valorIva) {
		this.valor_iva = valorIva;
	}

	public VentasModel getVentasIdVentas() {
		return ventasIdVentas;
	}

	public void setVentasIdVentas(VentasModel ventasIdVentas) {
		this.ventasIdVentas = ventasIdVentas;
	}

	public ProductoModel getProductosCodigoProductos() {
		return productosCodigoProductos;
	}

	public void setProductosCodigoProductos(ProductoModel productosCodigoProductos) {
		this.productosCodigoProductos = productosCodigoProductos;
	}

	
}
