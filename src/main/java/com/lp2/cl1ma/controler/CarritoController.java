package com.lp2.cl1ma.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lp2.cl1ma.interfaceService.IpersonaService;
import com.lp2.cl1ma.modelo.Persona;

@Controller
@RequestMapping
public class CarritoController {
	@Autowired
	private IpersonaService service;

	@GetMapping("/carrito")
	public String mostrarCarrito(Model model) {
		List<Persona> productosEnCarrito = service.listarEnCarrito();
		int totalCarrito = calcularTotalCarrito(productosEnCarrito);
		model.addAttribute("productosEnCarrito", productosEnCarrito);
		model.addAttribute("totalCarrito", totalCarrito);
		return "carrito";

	}

	private int calcularTotalCarrito(List<Persona> productosEnCarrito) {
		int total = 0;
		for (Persona producto : productosEnCarrito) {
			total += producto.getPrecioVenta();
		}
		return total;
	}

	@PostMapping("/agregarAlCarrito/{id}")
	public String agregarAlCarrito(@PathVariable int id) {
		Optional<Persona> producto = service.listarId(id);
		if (producto.isPresent()) {
			Persona p = producto.get();
			p.setEnCarrito(true);
			service.save(p);
		}
		return "redirect:/productos";
	}

	@PostMapping("/eliminarDelCarrito/{id}")
	public String eliminarDelCarrito(@PathVariable int id) {
		Optional<Persona> productoOpt = service.listarId(id);
		if (productoOpt.isPresent()) {
			Persona producto = productoOpt.get();
			producto.setEnCarrito(false);
			service.save(producto);
		}
		return "redirect:/carrito";
	}
}