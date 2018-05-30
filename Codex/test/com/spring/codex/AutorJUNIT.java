package com.spring.codex;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.spring.codex.model.Autor;
import com.spring.codex.model.Libro;


public class AutorJUNIT {
	
	public static Autor a;
	public static List<Libro> l;
	public static Libro lib;
	
	public static String nombre="Agatha";
	public static String apellido1="Christie";
	public static String apellido2="";
	public static long ID=5;
	public static long ISB=0005;
	
	public static int anyo=1975;
	public static String nombreLib ="West End";
	public static String nombreEdit ="LOX";
	

	
	@BeforeClass
	public static void CrearAutor() {
		a=new Autor();
		a.setID(ID);
		a.setNombre(nombre);
		a.setApellido1(apellido1);
		a.setApellido2(apellido2);
		lib=new Libro();
		lib.setIsbn13(ISB);
		lib.setAnyo(anyo);
		lib.setAutor(a);
		lib.setNombre(nombreLib);
		lib.setEditor(nombreEdit);
		l=new ArrayList<Libro>();
		l.add(lib);
		a.setLibros(l);
	
		
	}
	@Test
	public void Libro() {
		assertEquals("Comprobando el ISBN",ISB,lib.getIsbn13());
		assertEquals("Comprobando el año",anyo,lib.getAnyo());
		assertEquals("Comprobando el autor",a,lib.getAutor());
		assertEquals("Comprobando el nombre",nombreLib,lib.getNombre());
		assertEquals("Comprobando el editor",nombreEdit,lib.getEditor());
	}
	
	@Test
	public void Autor() {
		assertEquals("Comprobando el id",ID,a.getID());
		assertEquals("Comprobando el nobre",nombre,a.getNombre());
		assertEquals("Comprobando el apellido",apellido1,a.getApellido1());
		assertEquals("Comprobando el apellido2",apellido2,a.getApellido2());
		assertEquals("Comprobando el Libros",l,a.getLibros());		
	}
}
