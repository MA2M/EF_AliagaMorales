package com.lp2.cl1ma.interfaces;

import com.lp2.cl1ma.modelo.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVenta extends JpaRepository<Venta, Long> {
}
