package com.elaparato.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private int cantidad;

    /*
    @ManyToMany
    //@JoinColumn (name="id_venta")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private List<Venta> listaVentas;
*/
     @ManyToMany
    @JoinTable(
        name = "producto_lista_ventas",
        joinColumns = @JoinColumn(name = "lista_productos_id"),
        inverseJoinColumns = @JoinColumn(name = "lista_ventas_id_venta")
    )
    @JsonBackReference
    private Set<Venta> listaVentas = new HashSet<>();

    public Producto() {
    }

    public Producto(int id, String nombre, String descripcion, Double precio, int cantidad, Set<Venta> listaVentas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.listaVentas = listaVentas;
    }



}
