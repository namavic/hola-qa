package com.qa.amc.vo;
import java.util.Date;
public class AnalisisAmbiguedades {
	/**
	 * 
	 */
	private AnalisisAmbiguedades PlanTrabajo;
	private Ambiguedad[] AnalisisAmbiguedades;
	private PlanTrabajo[] nombreProyecto;
	private Cliente[] propietarioProyecto;
	private String defectoEncontrado;
	private Date[] fechaComienzo;
	private String comentario;
	public AnalisisAmbiguedades getPlanTrabajo() {
		return PlanTrabajo;
	}
	public void setPlanTrabajo(AnalisisAmbiguedades planTrabajo) {
		PlanTrabajo = planTrabajo;
	}
	public Ambiguedad[] getAnalisisAmbiguedades() {
		return AnalisisAmbiguedades;
	}
	public void setAnalisisAmbiguedades(Ambiguedad[] analisisAmbiguedades) {
		AnalisisAmbiguedades = analisisAmbiguedades;
	}
	public PlanTrabajo[] getNombreProyecto() {
		return nombreProyecto;
	}
	public void setNombreProyecto(PlanTrabajo[] nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	public Cliente[] getPropietarioProyecto() {
		return propietarioProyecto;
	}
	public void setPropietarioProyecto(Cliente[] propietarioProyecto) {
		this.propietarioProyecto = propietarioProyecto;
	}
	public String getDefectoEncontrado() {
		return defectoEncontrado;
	}
	public void setDefectoEncontrado(String defectoEncontrado) {
		this.defectoEncontrado = defectoEncontrado;
	}
	public Date[] getFechaComienzo() {
		return fechaComienzo;
	}
	public void setFechaComienzo(Date[] fechaComienzo) {
		this.fechaComienzo = fechaComienzo;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
