package com.elaparato.service;

import com.elaparato.model.Producto;
import com.elaparato.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoRepository productoRepo;

    @Override
    public List<Producto> getProductos() {
        return productoRepo.findAll();
    }

    @Override
    public Optional<Producto> findProductoById(int id) {
        return productoRepo.findById(id);
    }

    @Override
    public void saveProducto(Producto producto) {
        productoRepo.save(producto);

    }

    @Override
    public void editProducto(Producto producto) {
        this.saveProducto(producto);

    }

    @Override
    public void deleteProducto(int id) {
        productoRepo.deleteById(id);

    }
}
