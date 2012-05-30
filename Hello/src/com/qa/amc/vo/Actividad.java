package com.qa.amc.vo;

import java.util.Date;

public class Actividad {
	private int numeroActividad;
	private String actividad;
	private String predecesora;
	private Date fechaInicio;
	private Date fechaTermino;
	private int duracion;
	private String recursoAsignado;
	private String tipo;
	
	public int getNumeroActividad() {
		return numeroActividad;
	}
		public void setNumeroActividad(int numeroActividad) {
		this.numeroActividad = numeroActividad;
	}
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	public String getPredecesora() {
		return predecesora;
	}
	public void setPredecesora(String predecesora) {
		this.predecesora = predecesora;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaTermino() {
		return fechaTermino;
	}
	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getRecursoAsignado() {
		return recursoAsignado;
	}
	public void setRecursoAsignado(String recursoAsignado) {
		this.recursoAsignado = recursoAsignado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		

}
