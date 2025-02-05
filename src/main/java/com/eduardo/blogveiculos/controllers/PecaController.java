package com.eduardo.blogveiculos.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.blogveiculos.models.Peca;
import com.eduardo.blogveiculos.services.PecaService;

@RestController
@RequestMapping("/pecas")

public class PecaController {
  private PecaService service;

  public PecaController(PecaService service) {
    this.service = service;

  }

  @PostMapping
  public ResponseEntity<Peca> addPeca(@RequestBody Peca peca) {
    return ResponseEntity.status(HttpStatus.CREATED).body(service.addPeca(peca));
  }

  @GetMapping("/{id}")
  public ResponseEntity<Peca> findById(@PathVariable String id) {
    return ResponseEntity.ok(service.findById(id));
  }

  @GetMapping
  public ResponseEntity<List<Peca>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @PatchMapping("/{idPeca}/marca/{idMarca}")
  public ResponseEntity<Peca> addMarca(@PathVariable String idPeca, @PathVariable String idMarca) {
    return ResponseEntity.ok(service.addMarca(idPeca, idMarca));
  }

  @PatchMapping("/{idPeca}/categoria/{idCategoria}")
  public ResponseEntity<Peca> addCategoria(@PathVariable String idPeca, @PathVariable String idCategoria) {
    return ResponseEntity.ok(service.addCategoria(idPeca, idCategoria));
  }

}
