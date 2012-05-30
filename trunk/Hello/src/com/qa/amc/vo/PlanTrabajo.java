package com.qa.amc.vo;

import java.util.Date;

public class PlanTrabajo {

	private String nombreProyecto;
	private String duracion;
	private Date fechaInicio;
	private Date fechaFinal;
	private Actividad[] listaActividades;
	
	
	
	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public Actividad[] getListaActividades() {
		return listaActividades;
	}
	public void setListaActividades(Actividad[] listaActividades) {
		this.listaActividades = listaActividades;
	}
	
	
}
