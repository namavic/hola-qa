package com.qa.amc.vo;

import java.util.Date;

public class CasoPrueba {
	
	private String Modulo;
	private String Nombre;
	private String Descripcion;
	private String PasosParaResultado;
	private String ResultadoEsperado;
	private Date FechaEjecucion;
	private String Estatus;
	private String Precondiciones;
	private String Poscondiciones;
	private String Reejecuciones;
	private String Comentarios;

	private String ID;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getModulo() {
		return Modulo;
	}
	public void setModulo(String modulo) {
		Modulo = modulo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getPasosParaResultado() {
		return PasosParaResultado;
	}
	public void setPasosParaResultado(String pasosParaResultado) {
		PasosParaResultado = pasosParaResultado;
	}
	public String getResultadoEsperado() {
		return ResultadoEsperado;
	}
	public void setResultadoEsperado(String resultadoEsperado) {
		ResultadoEsperado = resultadoEsperado;
	}
	public Date getFechaEjecucion() {
		return FechaEjecucion;
	}
	public void setFechaEjecucion(Date fechaEjecucion) {
		FechaEjecucion = fechaEjecucion;
	}
	public String getEstatus() {
		return Estatus;
	}
	public void setEstatus(String estatus) {
		Estatus = estatus;
	}
	public String getPrecondiciones() {
		return Precondiciones;
	}
	public void setPrecondiciones(String precondiciones) {
		Precondiciones = precondiciones;
	}
	public String getPoscondiciones() {
		return Poscondiciones;
	}
	public void setPoscondiciones(String poscondiciones) {
		Poscondiciones = poscondiciones;
	}
	public String getReejecuciones() {
		return Reejecuciones;
	}
	public void setReejecuciones(String reejecuciones) {
		Reejecuciones = reejecuciones;
	}
	public String getComentarios() {
		return Comentarios;
	}
	public void setComentarios(String comentarios) {
		Comentarios = comentarios;
	}
}
	
