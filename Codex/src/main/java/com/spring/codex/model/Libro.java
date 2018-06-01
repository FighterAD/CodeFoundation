package com.spring.codex.model;

import javax.persistence.*;

@Entity
public class Libro {

	// clave primaria
	@Id
	private long isbn13;

	private String nombre;
	private int anyo; 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id", nullable = false)
	private Autor autor;

	private String editor;
	
	private String imagen;
	
	private String descripcion;

	public Libro() {

	}

	public Libro(long isbn13, String name, int anyo, Autor autor, String editor) {
		this.nombre = name;
		this.anyo = anyo;
		this.autor = autor;
		this.editor = editor;
		this.isbn13 = isbn13;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public int getAnyo() {
		return anyo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
		return "Libro [isbn13=" + isbn13 + ", nombre=" + nombre + ", A�o=" + anyo + ", autor=" + autor
				+ ", editor=" + editor + "]";
	}

}