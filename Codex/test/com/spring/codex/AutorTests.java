package com.spring.codex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.codex.model.Autor;
import com.spring.codex.model.AutorRepository;
import com.spring.codex.model.AutorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutorTests {
  
  private static final long ID = 1000;
  @MockBean
  AutorRepository autorRepository;

  @Autowired
  public AutorService autorService;

  @Test
  public void contextLoads() {
    assertNotNull(autorService);
  }
  
  @Test
  public void testUpdate() {    
    Autor autor1= new Autor();
    autor1.setID(ID);
    autor1.setNombre("WILD");
    when(autorRepository.getOne(ID)).thenReturn(autor1);
    
    Autor autorResultado = autorService.getByID(ID);
    autorResultado.setNombre("FRANK");    
    autorService.update(autorResultado);
    Autor autorResultado1 = autorService.getByID(ID);
    
    assertEquals(autorResultado.getNombre(),autorResultado1.getNombre());
  }
  @Test
  public void testDelete() {
    autorService.delete(ID); 
    verify(autorRepository, times(1)).deleteById(ID);
      
  }
  
  @Test
  public void GetByName() {
    Autor autor1 = new Autor();
    autor1.setID(ID);
    autor1.setNombre("WILD");
    when(autorRepository.findByNombre("WILD")).thenReturn(autor1);  
    Autor autorRes = autorService.getByNombre("WILD");
    assertEquals(autor1.getNombre(),autorRes.getNombre());  
  }
}