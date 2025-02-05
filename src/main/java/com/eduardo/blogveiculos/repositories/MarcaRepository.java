package com.eduardo.blogveiculos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eduardo.blogveiculos.models.Marca;

public interface MarcaRepository extends JpaRepository<Marca,String>{
  
}
