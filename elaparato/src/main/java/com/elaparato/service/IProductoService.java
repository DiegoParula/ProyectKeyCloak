package com.elaparato.service;

import com.elaparato.model.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public List<Producto> getProductos();
    public Optional<Producto> findProductoById(int id);
    public void saveProducto(Producto producto);
    public void editProducto(Producto producto);
    public void deleteProducto(int id);
}
