package com.ciclo3.reto.Modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="ventas_model",schema="grupo56_equipo3")
@EntityListeners(AuditingEntityListener.class)
public class VentasModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1748535081781398053L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_venta", columnDefinition="bigint(20)")
	private long codigo_venta;
	
	@Column(name="iva_venta", columnDefinition="double")
	private double iva_venta;
	
	@Column(name="total_venta", columnDefinition="double")
	private double total_venta;
	
	@Column(name="valor_venta", columnDefinition="double")
	private double valor_venta;
	
	@OneToOne
	@Column(name="FK_cedula_cliente", columnDefinition="bigint(20)")
	private long cedula_cliente;
	
	@OneToOne
	@Column(name="FK_cedula_usuario", columnDefinition="bigint(20)")
	private long cedula_usuario;
	
	
	public long getCodigo_venta() {
		return codigo_venta;
	}
	public void setCodigo_venta(long codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public double getIva_venta() {
		return iva_venta;
	}
	public void setIva_venta(double iva_venta) {
		this.iva_venta = iva_venta;
	}
	public double getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}
	public double getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}
	public long getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public long getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	
	
}
