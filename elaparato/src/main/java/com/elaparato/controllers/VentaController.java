package com.elaparato.controllers;

import com.elaparato.model.Venta;
import com.elaparato.service.IVentaService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VentaController {

    @Autowired
    private IVentaService ventaService;

    @PostMapping("/ventas/create")
    @PreAuthorize("hasAnyRole('ROLE_vendedor','ROLE_administrador')")
    public String createProducto(@RequestBody Venta venta) {
        ventaService.saveVenta(venta);
        return "Venta creada correctamente";
    }

    @GetMapping("/ventas/getall")
    @PreAuthorize("hasAnyRole('ROLE_vendedor','ROLE_administrador')")
    public List<Venta> getVentas() {
        return ventaService.getVentas();
    }

    @PutMapping("/ventas/edit")
    @PreAuthorize("hasAnyRole('ROLE_vendedor','ROLE_administrador')")
    public String editVenta(@RequestBody Venta venta) {
        ventaService.editVenta(venta);
        return "Venta editada correctamente";
    }

    @DeleteMapping("/ventas/delete")
    @PreAuthorize("hasAnyRole('ROLE_vendedor','ROLE_administrador')")
    public void deleteVenta(@RequestParam int id) {
        ventaService.deleteVenta(id);
    }
}
