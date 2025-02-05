package com.eduardo.blogveiculos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.blogveiculos.models.Peca;

public interface PecaRepository extends JpaRepository<Peca,String>{
  
}
