package com.spring.codex.model;

import javax.persistence.*;

@Entity
public class Prestamo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPrestamo;
	
	private Fecha fecha_prestamo;
	private Fecha fecha_devolucion;
	
	public Prestamo() {
		this(new Fecha(), new Fecha());
	}
	
	public Prestamo(Fecha f_prestamo, Fecha f_devolucion) {
		establecerPrestamo(f_prestamo);
		establecerDevolucion(f_devolucion);
	}
	
	public Prestamo(int d_prest, int m_prest, int a_prest, int d_devol, int m_devol, int a_devol) {
		establecerPrestamo(d_prest, m_prest, a_prest);
		establecerDevolucion(d_devol, m_devol, a_devol);
	}
	
	public void establecerPrestamo(Fecha f_prestamo) {
		fecha_prestamo = new Fecha(f_prestamo);
	}
	
	public void establecerPrestamo(int d, int m, int a) {
		fecha_prestamo = new Fecha(d, m, a);
	}
	
	public void establecerDevolucion(Fecha f_devolucion) {
		fecha_devolucion = new Fecha(f_devolucion);
	}
	
	public void establecerDevolucion(int d, int m, int a) {
		fecha_devolucion = new Fecha(d, m, a);
	}
	
	public String obtenerPrestamo() {
		return fecha_prestamo.toString();
	}
	
	public String obtenerDevolucion() {
		return fecha_devolucion.toString();
	}
	
	@Override
	public String toString() {
		return "Fecha del prestamo: " + fecha_prestamo.toString() + "\n" + "Fecha de la devolucion: " + fecha_devolucion.toString();
	}
}
