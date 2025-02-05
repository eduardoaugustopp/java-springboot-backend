package com.eduardo.blogveiculos.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity(name = "tb_peca")
public class Peca {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String uuid;
  private String name;
  private String description;
  private String imageUrl;
  private String promotionalPrice;
  private String normalPrice;
  private String installment;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "tb_peca_marca", joinColumns = @JoinColumn(name = "peca_id"), inverseJoinColumns = @JoinColumn(name = "marca_id"))
  private List<Marca> marcas = new ArrayList<>();

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "tb_peca_categoria", joinColumns = @JoinColumn(name = "peca_id"), inverseJoinColumns = @JoinColumn(name = "categoria_id"))
  private List<Categoria> categorias = new ArrayList<>();

  


  public Peca(String name, String description, String imageUrl, String promotionalPrice, String normalPrice,
      String installment) {
    this.name = name;
    this.description = description;
    this.imageUrl = imageUrl;
    this.promotionalPrice = promotionalPrice;
    this.normalPrice = normalPrice;
    this.installment = installment;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Peca other = (Peca) obj;
    if (uuid == null) {
      if (other.uuid != null)
        return false;
    } else if (!uuid.equals(other.uuid))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }
 
  public void addCategoria(Categoria categoria){
    this.categorias.add(categoria);
  }
  public void addMarca(Marca marca){
    this.marcas.add(marca);
  }
}
