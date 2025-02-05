package com.eduardo.blogveiculos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity(name = "tb_marca")
public class Marca {
  @Id
  @GeneratedValue (strategy = GenerationType.UUID)
  private String uuid;
  private String nome;
}
