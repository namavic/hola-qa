package com.qa.amc.vo;

import java.util.Date;

public class EquipoTrabajo {
	
	private String nombre;
	private String estatus;
	private Date ultimaModificacion;
	private Usuario liderProyecto;
	private Usuario liderDesarrollo;
	private String activo;
	private String[] integrantes;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public Date getUltimaModificacion() {
		return ultimaModificacion;
	}
	public void setUltimaModificacion(Date ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}
	public Usuario getLiderProyecto() {
		return liderProyecto;
	}
	public void setLiderProyecto(Usuario liderProyecto) {
		this.liderProyecto = liderProyecto;
	}
	public Usuario getLiderDesarrollo() {
		return liderDesarrollo;
	}
	public void setLiderDesarrollo(Usuario liderDesarrollo) {
		this.liderDesarrollo = liderDesarrollo;
	}
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	public String[] getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(String[] integrantes) {
		this.integrantes = integrantes;
	}
	

}
