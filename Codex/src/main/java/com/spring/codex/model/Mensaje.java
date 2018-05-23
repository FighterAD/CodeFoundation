package com.spring.codex.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String mensaje;
	private String emisor;
	private String receptor;

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="mensaje")
	public List<Usuario> usuarios;
	
	public Mensaje() {
		this("", "", "");
	}

	public Mensaje(String e, String r, String m) {
		emisor = e;
		receptor = r;
		mensaje = m;
	}

	public void setMensaje(String m) {
		mensaje = m;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setEmisor(String e) {
		emisor = e;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setReceptor(String r) {
		receptor = r;
	}

	public String getReceptor() {
		return receptor;
	}
	
	public long getId() {
		return id;
	}

	@Override
	public int hashCode() {		
		return (int) id;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean res = false;;
		
		if(o instanceof Mensaje) {
			Mensaje m = (Mensaje) o;
			res = m.getId() == id;
		}
		
		return res;
	}

	@Override
	public String toString() {
		return "Emisor: " + emisor + "\nReceptor: " + receptor + "\nMensaje " + mensaje + "\n";
	}
}
