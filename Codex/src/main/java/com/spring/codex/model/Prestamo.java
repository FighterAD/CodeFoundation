
package com.spring.codex.model;

import java.util.Date;

//@Entity
public class Prestamo {
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 */
	private int idPrestamo;
	private String prestatario;
	private Date fecha_prestamo;
	private Date fecha_devolucion;

	public Prestamo(String n, Date fp, Date fd) {
		prestatario = n;
		fecha_prestamo = fp;
		fecha_devolucion = fd;
	}

	public int getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
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
