package com.elaparato.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Getter
@Setter
@Entity
@Table(name = "Venta")
public class Venta {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_venta;

  private Date fecha;
  /*//@OneToMany(mappedBy="venta")
  @ManyToMany(mappedBy = "listaVentas")
  private List<Producto> listaProductos;*/

  @ManyToMany(mappedBy = "listaVentas")
  @JsonManagedReference
  private List<Producto> listaProductos = new ArrayList<>();

}