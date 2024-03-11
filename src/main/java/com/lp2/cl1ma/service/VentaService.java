package com.lp2.cl1ma.service;

import com.lp2.cl1ma.modelo.Venta;
import com.lp2.cl1ma.interfaces.IVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    private final IVenta ventaRepositorio;

    @Autowired
    public VentaService(IVenta ventaRepositorio) {
        this.ventaRepositorio = ventaRepositorio;
    }

    public Venta agregarVenta(Venta venta) {
        return ventaRepositorio.save(venta);
    }

    public List<Venta> listarVentas() {
        return ventaRepositorio.findAll();
    }
    
}
