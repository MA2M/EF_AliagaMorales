package com.lp2.cl1ma.controler;

import com.lp2.cl1ma.modelo.Venta;
import com.lp2.cl1ma.service.VentaService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

	@Autowired
	private VentaService ventaService;

	@PostMapping("/realizarCompra")
	public void realizarCompra(HttpServletRequest request) {
	    HttpSession session = request.getSession();
	    Long userId = (Long) session.getAttribute("userId");
	    Venta nuevaVenta = new Venta();
	    nuevaVenta.setIdUsuario(userId);
	    nuevaVenta.setFechaVenta(new Date()); 
	   
	    nuevaVenta.setTotalVenta(0.0); 

	    ventaService.agregarVenta(nuevaVenta);
	}

}
