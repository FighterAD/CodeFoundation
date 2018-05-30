import static org.mockito.Mockito.*;

import org.junit.Before;
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
public class MockLibro {
	private static long isbn1 = 1010;
	private static long isbn2 = 1009;

	@MockBean
	LibroRepository libroRepository;

	@Autowired
	public LibroService libroService;

	@Test
	public void contextLoads() {
		assertNotNull(libroService);
	}
	
	@Test
	public void testGetOne() {
		
		
		Libro l1 = new Libro();
		l1.setIsbn13(isbn1);
		l1.setNombre("WILD");
		
		

		Libro l2 = new Libro();
		l2.setIsbn13(isbn2);
		l2.setNombre("CHINA");

		when(libroRepository.getOne(anyLong())).thenReturn(l2);
		when(libroRepository.getOne(isbn1)).thenReturn(l1);

		
		
		Libro resultLibro = libroService.getByIsbn13(isbn1);
		verify(libroRepository, times(1)).getOne(isbn1);
		assertEquals(l1, resultLibro);

		Libro resultLibro2 = libroService.getByIsbn13(isbn2);
		assertEquals(l2, resultLibro2);
	}
	
	@Test
	public void testUpdate() {	
		Libro resultLibro = libroService.getByIsbn13(isbn1);	
		resultLibro.setNombre("Nuevo nombre");	
		libroService.update(resultLibro);	
		Libro resultLibro2 = libroService.getByIsbn13(isbn1);	
		assertEquals(resultLibro2, resultLibro);	
	}
		
	
	@Test
	public void testDelete() {	
		libroService.delete(isbn1); 
		verify(libroRepository, times(1)).deleteById(isbn1);	
	}
	
	
}
