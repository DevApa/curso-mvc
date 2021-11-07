package com.web.home.models.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class Usuario {
	@NotEmpty
	private String nombres;
	
	@NotEmpty
	private String apellidos;
	
	@NotEmpty	
	private String telefono;
	
	@NotEmpty	
	private String username;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	private String password;
	
	public Usuario() {

	}

	public Usuario(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Usuario(@NotEmpty String nombres, @NotEmpty String apellidos, String telefono, @NotEmpty String username,
			@NotEmpty @Email String email, @NotEmpty String password) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.username = username;
		this.email = email;
		this.password = password;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
