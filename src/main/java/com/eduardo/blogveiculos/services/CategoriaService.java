package com.eduardo.blogveiculos.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.eduardo.blogveiculos.models.Categoria;
import com.eduardo.blogveiculos.repositories.CategoriaRepository;

@Service
public class CategoriaService {
  private CategoriaRepository repository;

  public CategoriaService(CategoriaRepository repository) {
    this.repository = repository;
  }

  public Categoria addCategoria(Categoria categoria) {
    return repository.save(categoria);
  }

  public Categoria findById(String uuid) {
    return repository.findById(uuid).orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
  }

  public List<Categoria> findAll() {
    return repository.findAll();
  }
}
