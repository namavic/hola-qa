package com.qa.amc.vo;


public class Roles {
		private Usuario rol;
		private Pantalla perfil;
		private String descripcion;
		private String acciones;
		public Usuario getRol() {
			return rol;
		}
		public void setRol(Usuario rol) {
			this.rol = rol;
		}
		public Pantalla getPerfil() {
			return perfil;
		}
		public void setPerfil(Pantalla perfil) {
			this.perfil = perfil;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getAcciones() {
			return acciones;
		}
		public void setAcciones(String acciones) {
			this.acciones = acciones;
		}
}
