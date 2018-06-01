package com.spring.codex.model;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface LibroRepository extends JpaRepository<Libro, Long> {
	Libro findByNombre(String bookName);
	Libro findByIsbn13(long isbn13);
	
    @Query("SELECT l FROM Libro l left join l.autor a "
    		+ "WHERE lower(l.nombre) LIKE lower(concat('%',:searchTerm,'%')) "
			+ "OR lower(l.isbn13) LIKE lower(concat('%',:searchTerm,'%')) "
			+ "OR lower(a.apellido1) LIKE lower(concat('%',:searchTerm,'%')) "
			+ "OR lower(a.apellido2) LIKE lower(concat('%',:searchTerm,'%')) "
			+ "OR lower(a.nombre) LIKE lower(concat('%',:searchTerm,'%'))")
    public List<Libro> searchWithJPQLQuery(@Param("searchTerm") String searchTerm);

}
