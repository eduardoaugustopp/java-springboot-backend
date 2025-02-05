package com.eduardo.blogveiculos.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.eduardo.blogveiculos.models.Marca;
import com.eduardo.blogveiculos.repositories.MarcaRepository;

@Service
public class MarcaService {
  private MarcaRepository repository;

  public MarcaService(MarcaRepository repository) {
    this.repository = repository;
  }

  public Marca addMarca(Marca marca) {
    return repository.save(marca);
  }

  public Marca findById(String uuid) {
    return repository.findById(uuid).orElseThrow(() -> new RuntimeException("Marca não encontrada"));
  }

  public List<Marca> findAll() {
    return repository.findAll();
  }
}
