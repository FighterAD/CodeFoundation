package com.spring.codex.model;

import javax.persistence.*;

@Entity
public class Libro {

	// clave primaria
	@Id
	private long isbn13;

	private String nombre;
	private int anyo; 

	@OneToOne
	private Persona autor;

	@OneToOne
	private Persona editor;

	public Libro() {

	}

	public Libro(long isbn13, String name, int anyo, Persona autor, Persona editor) {
		this.nombre = name;
		this.anyo = anyo;
		this.autor = autor;
		this.editor = editor;
		this.isbn13 = isbn13;
	}

	public Persona getEditor() {
		return editor;
	}

	public void setEditor(Persona editor) {
		this.editor = editor;
	}

	public long getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(long isbn13) {
		this.isbn13 = isbn13;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getAutor() {
		return autor;
	}

	public void setAutor(Persona autor) {
		this.autor = autor;
	}
	
	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public int hashCode() {
		try {
			return (int) isbn13;
		} catch (Exception er) {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = obj instanceof Libro;
		Libro lib = res? (Libro)obj : null;
		return res && isbn13 == lib.isbn13;
	}

	@Override
	public String toString() {
		return "Libro [isbn13=" + isbn13 + ", nombre=" + nombre + ", Año=" + anyo + ", autor=" + autor
				+ ", editor=" + editor + "]";
	}

}