package com.elaparato.service;

import com.elaparato.model.Venta;
import com.elaparato.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService implements IVentaService {
    @Autowired
    private IVentaRepository ventaRepo;

    @Override
    public List<Venta> getVentas() {
        return ventaRepo.findAll();
    }

    @Override
    public Optional<Venta> findVenta(int id) {
        return ventaRepo.findById(id);
    }

    @Override
    public void saveVenta(Venta venta) {
        ventaRepo.save(venta);


    }

    @Override
    public void editVenta(Venta venta) {
        this.saveVenta(venta);
    }

    @Override
    public void deleteVenta(int id) {
        ventaRepo.deleteById(id);
    }
}
