package com.spring.codex;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.codex.model.Libro;
import com.spring.codex.model.LibroRepository;
import com.spring.codex.model.LibroService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibroTests {

	private static final long ISBN_TEST = 000;
	@MockBean
	LibroRepository libroRepository;

	@Autowired
	public LibroService libroService;
	

	@Test
	public void contextLoads() {
		assertNotNull(libroService);
	}
	
	@Test
	public void testUpdate() {
		
		Libro Libro1 = new Libro();
		Libro1.setIsbn13(ISBN_TEST);
		Libro1.setNombre("WILD");
		when(libroRepository.findByIsbn13(ISBN_TEST)).thenReturn(Libro1);
		
		Libro resultLibro = libroService.getByIsbn13(ISBN_TEST);
		
		resultLibro.setNombre("CambiarNombre");		
		libroService.update(resultLibro);		
		Libro resultLibro2 = libroService.getByIsbn13(ISBN_TEST);
		assertEquals(resultLibro2, resultLibro);		
	}
	
	
	@Test
	public void testDelete() {
		libroService.delete(ISBN_TEST); 
		verify(libroRepository, times(1)).deleteById(ISBN_TEST);
			
	}
	
	@Test
	public void GetByISBN() {
		Libro Libro1 = new Libro();
		Libro1.setIsbn13(ISBN_TEST);
		Libro1.setNombre("WILD");
		when(libroRepository.findByIsbn13(ISBN_TEST)).thenReturn(Libro1);	
		Libro resultLibro = libroService.getByIsbn13(ISBN_TEST);
		assertEquals(Libro1.getIsbn13(),resultLibro.getIsbn13());		
	}
	
	@Test
	public void GetByName() {
		Libro Libro1 = new Libro();
		Libro1.setIsbn13(ISBN_TEST);
		Libro1.setNombre("WILD");
		
		when(libroRepository.findByNombre("WILD")).thenReturn(Libro1);	
		Libro resultLibro = libroService.getByName("WILD");
		assertEquals(Libro1.getNombre(),resultLibro.getNombre());	
	}
	
	
	
}
