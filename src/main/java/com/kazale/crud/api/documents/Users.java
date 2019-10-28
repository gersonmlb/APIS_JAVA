package com.kazale.crud.api.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
public class Users {

	@Id
	private String id;
	private String nombres;
	private String apellidos;
	private String usuario;
	private String clave;
	private String estado;

	public Users() {
	}
	
	

	public Users(String id, String nombres, String apellidos, String usuario, String clave, String estado) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.clave = clave;
		this.estado = estado;
	}
	
	



	public Users(String id, String nombres, String apellidos, String usuario, String clave) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.clave = clave;
	}

	


	public Users(String id) {
		super();
		this.id = id;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
