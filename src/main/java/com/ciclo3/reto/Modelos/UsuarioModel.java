package com.ciclo3.reto.Modelos;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener; 
 
@Entity
@Table(name="usuario_model", schema="grupo56_equipo3")
@EntityListeners(AuditingEntityListener.class)
public class UsuarioModel implements Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = -7628466442361484495L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cedula_usuario", columnDefinition="bigint(20)")
	private long cedula_usuario; 
	
	@Column(name="nombre_usuario", columnDefinition="varchar(255)")
	private String nombre_usuario; 
	
	@Column(name="email_usuario", columnDefinition="varchar(255)")
	private String email_usuario; 
	
	@Column(name="usuario", columnDefinition="varchar(255)")
	private String usuario; 
	
	@Column(name="password", columnDefinition="varchar(255)")
	private String password;
	
	/**
	 * @return the cedula_usuario
	 */
	public long getCedula_usuario() {
		return cedula_usuario;
	}
	/**
	 * @param cedula_usuario the cedula_usuario to set
	 */
	public void setCedula_usuario(long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	/**
	 * @return the nombre_usuario
	 */
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	/**
	 * @param nombre_usuario the nombre_usuario to set
	 */
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	/**
	 * @return the email_usuario
	 */
	public String getEmail_usuario() {
		return email_usuario;
	}
	/**
	 * @param email_usuario the email_usuario to set
	 */
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	} 
} 