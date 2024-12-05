package com.elaparato.controllers;

import com.elaparato.model.Producto;
import com.elaparato.service.IProductoService;
import com.elaparato.service.ProductoService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ProductoController {
    @Autowired
    private IProductoService productoService;

    @PostMapping("/productos/create")
    @PreAuthorize("hasAnyRole('ROLE_repositor','ROLE_administrador')")
    public String createProducto(@RequestBody Producto producto) {
        productoService.saveProducto(producto);
        return "Producto creado correctamente";
    }

    @GetMapping("/productos/getall")
    @PreAuthorize("hasAnyRole('ROLE_repositor','ROLE_administrador')")
    public List<Producto> getPrdductos() {
            return productoService.getProductos();
    }

    @PutMapping("/productos/edit")
    @PreAuthorize("hasAnyRole('ROLE_repositor','ROLE_administrador')")
    public String editProducto(@RequestBody Producto producto) {
        productoService.editProducto(producto);
        return "Producto editado correctamente";
    }

    @PostMapping("/productos/delete")
    @PreAuthorize("hasAnyRole('ROLE_repositor','ROLE_administrador')")
    public String deleteProducto(@RequestParam int id) {
        productoService.deleteProducto(id);
        return "Producto se ha eliminado correctamente";
    }

}
