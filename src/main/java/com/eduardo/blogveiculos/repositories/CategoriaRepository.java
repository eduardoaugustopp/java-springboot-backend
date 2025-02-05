package com.eduardo.blogveiculos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eduardo.blogveiculos.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,String>{
 
}
