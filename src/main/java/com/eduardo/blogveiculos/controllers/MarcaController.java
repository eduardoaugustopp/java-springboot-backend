package com.eduardo.blogveiculos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.eduardo.blogveiculos.models.Marca;
import com.eduardo.blogveiculos.services.MarcaService;

@RestController
@RequestMapping("/marca")

public class MarcaController {

@Autowired
private MarcaService service;

   public MarcaController(MarcaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Marca> addMarca(@RequestBody Marca marca){
        return ResponseEntity.ok(service.addMarca(marca));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Marca> findById(@PathVariable String id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Marca>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

}
