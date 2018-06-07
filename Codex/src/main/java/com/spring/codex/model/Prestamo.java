
package com.spring.codex.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Prestamo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String prestatario;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_prestamo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_devolucion;

	public Prestamo() {
		id = 1;
	}
	
	public Prestamo(String n, Date fp, Date fd) {
		prestatario = n;
		fecha_prestamo = fp;
		fecha_devolucion = fd;
	}

	public long getId() {
		return id;
	}

	public void setId(int idPrestamo) {
		this.id = idPrestamo;
	}

	public String getPrestatario() {
		return prestatario;
	}

	public void setPrestatario(String prestatario) {
		this.prestatario = prestatario;
	}

	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}

	public void setFecha_prestamo(Date fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}

	public Date getFecha_devolucion() {
		return fecha_devolucion;
	}

	public void setFecha_devolucion(Date fecha_devolucion) {
		this.fecha_devolucion = fecha_devolucion;
	}
}
