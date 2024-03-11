package com.lp2.cl1ma.interfaceService;

import java.util.List;
import java.util.Optional;

import com.lp2.cl1ma.modelo.Persona;

public interface IpersonaService {
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
	public List<Persona> listarEnCarrito();

}
