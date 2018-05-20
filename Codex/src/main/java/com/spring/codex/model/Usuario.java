package com.spring.codex.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*; //Utilizamos Date desde aquí, desde java.sql es INCOMPATIBLE 

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Usuario {
	
    @Id
    //@Size(min=9, max=9)
    private String DNI;
    
    private String nombre;
    private String apellido1;
    private String apellido2;

    @Column(unique=true, nullable = false)
    private String email;
    
    @NotNull
    private String password;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fecha_nacimiento;
    
    private String direccion;
    
    //@Size(min=5, max=5)
    private int codigoPostal;
    
    public Usuario() {
    	
    }
    
    public Usuario(Usuario usuario) {
    	this.DNI = usuario.DNI;
    	this.apellido1 = usuario.apellido1;
    	this.apellido2 = usuario.apellido2;
    	this.email = usuario.email;
    	this.password = usuario.password;
    	this.fecha_nacimiento = usuario.fecha_nacimiento;
    	this.direccion = usuario.direccion;
    	this.codigoPostal = usuario.codigoPostal;
    }

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
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

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
    
    @Override
    public int hashCode() {
    	String str = DNI.replaceAll("\\D+","");
    	Integer.parseInt(str);
		try {
			return Integer.parseInt(str);
		} catch (Exception er) {
			return 0;
		}
    }
    
	@Override
	public boolean equals(Object obj) {
		boolean res = obj instanceof Usuario;
		Usuario user = res? (Usuario)obj : null;
		return res && DNI.equals(user.DNI);
	}
    
    

}
