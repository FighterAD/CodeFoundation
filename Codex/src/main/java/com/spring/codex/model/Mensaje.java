package com.spring.codex.model;

import javax.persistence.*;

@Entity
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;

	private String mensaje;
	private String emisor;
	private String receptor;

	public Mensaje() {
		this("", "", "");
	}

	public Mensaje(String e, String r, String m) {
		emisor = e;
		receptor = r;
		mensaje = m;
	}

	public void establecerMensaje(String m) {
		mensaje = m;
	}

	public String obtenerMensaje() {
		return mensaje;
	}

	public void establecerEmisor(String e) {
		emisor = e;
	}

	public String obtenerEmisor() {
		return emisor;
	}

	public void establecerReceptor(String r) {
		receptor = r;
	}

	public String obtenerReceptor() {
		return receptor;
	}
	
	public int obtenerId() {
		return ID;
	}

	@Override
	public int hashCode() {
		try {
			return ID;
		} catch (Exception er) {
			return 0;
		}
	}
	
	@Override
	public boolean equals(Object o) {
		boolean res = false;;
		
		if(o instanceof Mensaje) {
			Mensaje m = (Mensaje) o;
			res = m.obtenerId() == ID;
		}
		
		return res;
	}

	@Override
	public String toString() {
		return "Emisor: " + emisor + "\nReceptor: " + receptor + "\nMensaje " + mensaje + "\n";
	}
}
