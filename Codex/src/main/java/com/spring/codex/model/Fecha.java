package com.spring.codex.model;

import java.util.Calendar;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anyo;
	private Calendar date = Calendar.getInstance();

	// La fecha se inicia a la de hoy
	public Fecha() {
		dia = date.get(Calendar.DAY_OF_MONTH);
		mes = date.get(Calendar.MONTH) + 1;
		anyo = date.get(Calendar.YEAR);
	}

	// La fecha es la que es pasada por parametros
	public Fecha(int d, int m, int a) {
		establecerFecha(d, m, a);
	}

	public Fecha(Fecha f) {
		dia = f.obtenerDia();
		mes = f.obtenerMes();
		anyo = f.obtenerAnyo();
	}

	public void establecerFecha(int d, int m, int a) {
		if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d < 1 || d > 31)) {
			throw new RuntimeException("Día erroneo.");
		} else if ((m == 4 || m == 6 || m == 9 || m == 11) && (d < 1 || d > 30)) {
			throw new RuntimeException("Día erroneo.");
		} else if (m == 2) {
			if (!bisiesto(a) && (d < 1 || d > 28)) {
				throw new RuntimeException("Día erroneo.");
			} else if (bisiesto(a) && (d < 1 || d > 29)) {
				throw new RuntimeException("Día erroneo.");
			}
		} else if (m < 1 && m > 12) {
			throw new RuntimeException("Mes erroneo");
		}

		dia = d;
		mes = m;
		anyo = a;
	}

	public int obtenerDia() {
		return dia;
	}

	public int obtenerMes() {
		return mes;
	}
  
	public int obtenerAnyo() {
		return anyo;
	}

	private boolean bisiesto(int a) {
		return a % 4 == 0 && (a % 100 != 0 || a % 400 == 0);
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anyo;
	}
}
