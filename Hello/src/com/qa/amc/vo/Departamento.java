package com.qa.amc.vo;
//@Author Joshua  tu papa ja ja ja
public class Departamento {
	
	private Cliente  cliente ;
	private String ubicacion ;
	private String correo ;
	private String nombreDelDepartamento ;
	private Usuario responsable ;
	public Cliente  getCliente() {
		return cliente;
	}
	public void setCliente(Cliente  cliente) {
		this.cliente = cliente;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getNombreDelDepartamento() {
		return nombreDelDepartamento;
	}
	public void setNombreDelDepartamento(String nombreDelDepartamento) {
		this.nombreDelDepartamento = nombreDelDepartamento;
	}
	public Usuario getResponsable() {
		return responsable;
	}
	public void setResponsable(Usuario responsable) {
		this.responsable = responsable;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
