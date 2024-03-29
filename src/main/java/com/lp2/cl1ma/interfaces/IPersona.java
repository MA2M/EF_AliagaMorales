package com.lp2.cl1ma.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lp2.cl1ma.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{
    List<Persona> findByEnCarritoTrue();
}

