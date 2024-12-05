package com.elaparato.service;

import com.elaparato.model.Venta;

import java.util.List;
import java.util.Optional;

public interface IVentaService {
    public List<Venta> getVentas();
    public Optional<Venta> findVenta(int id);
    public void saveVenta(Venta venta);
    public void editVenta(Venta venta);
    public void deleteVenta(int id);
}
