package com.eduardo.blogveiculos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.blogveiculos.models.Categoria;
import com.eduardo.blogveiculos.services.CategoriaService;

@RestController
@RequestMapping("/categoria")

public class CategoriaController {
  
@Autowired
private CategoriaService service;

   public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Categoria> addCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.ok(service.addCategoria(categoria));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable String id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

}
