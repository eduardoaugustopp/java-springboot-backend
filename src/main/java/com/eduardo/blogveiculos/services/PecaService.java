package com.eduardo.blogveiculos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.eduardo.blogveiculos.models.Categoria;
import com.eduardo.blogveiculos.models.Marca;
import com.eduardo.blogveiculos.models.Peca;
import com.eduardo.blogveiculos.repositories.CategoriaRepository;
import com.eduardo.blogveiculos.repositories.MarcaRepository;
import com.eduardo.blogveiculos.repositories.PecaRepository;

@Service
public class PecaService {
  private PecaRepository pecaRepository;
  private MarcaRepository marcaRepository;
  private CategoriaRepository categoriaRepository;

  public PecaService(PecaRepository pecaRepository, MarcaRepository marcaRepository,
      CategoriaRepository categoriaRepository) {
    this.pecaRepository = pecaRepository;
    this.marcaRepository = marcaRepository;
    this.categoriaRepository = categoriaRepository;
  }

  public Peca addPeca(Peca peca) {
    Peca pecaParaAdicionar = new Peca(peca.getName(), peca.getDescription(), peca.getImageUrl(), peca.getPromotionalPrice(), peca.getNormalPrice(), peca.getInstallment());
    return pecaRepository.save(pecaParaAdicionar);
  }

  public Peca findById(String id) {
    return pecaRepository.findById(id).get();
  }

  public List<Peca> findAll() {
    return pecaRepository.findAll();
  }

  public Peca addMarca(String idPeca, String idMarca) {
    Optional<Peca> pecaRetornado = pecaRepository.findById(idPeca);
    Optional<Marca> marcaOptional = marcaRepository.findById(idMarca);

    if (pecaRetornado.isEmpty() || marcaOptional.isEmpty()) {
      throw new RuntimeException("Peça ou Marca não existe");
    }

    pecaRetornado.get().addMarca(marcaOptional.get());
    return pecaRepository.save(pecaRetornado.get());
  }

  public Peca addCategoria(String idPeca, String idCategoria) {
    Optional<Peca> pecaRetornado = pecaRepository.findById(idPeca);
    Optional<Categoria> categoriaOptional = categoriaRepository.findById(idCategoria);

    if (pecaRetornado.isEmpty() || categoriaOptional.isEmpty()) {
      throw new RuntimeException("Peça ou Categoria não existe");
    }

    pecaRetornado.get().addCategoria(categoriaOptional.get());
    return pecaRepository.save(pecaRetornado.get());
  }

}
