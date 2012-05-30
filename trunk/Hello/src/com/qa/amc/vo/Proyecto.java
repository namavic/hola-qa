package com.qa.amc.vo;

import java.util.Date;

public class Proyecto {
	
	private EquipoTrabajo equipoDeTrabajo;
	private Cliente cliente;
	private Departamento subDireccion;
	private String status;
	private Date fechaInicial;
	private Date fechaFinal;
	private String observaciones;

	

	public EquipoTrabajo getequipoDeTrabajo() {
		return equipoDeTrabajo;
	}

	public void setEquipoDeTrabajo(EquipoTrabajo equipoDeTrabajo) {
		this.equipoDeTrabajo = equipoDeTrabajo;
	}

	public Cliente getcliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Departamento getSubDireccion() {
		return subDireccion;
	}

	public void setSubDireccion(Departamento subDireccion) {
		this.subDireccion = subDireccion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;

	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;

	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}
