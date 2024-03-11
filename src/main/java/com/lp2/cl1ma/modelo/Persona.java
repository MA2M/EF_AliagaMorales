package com.lp2.cl1ma.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "persona")

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telefono;
    private int precioCompra;
    private int precioVenta;
    private int existencia;
    private boolean enCarrito; 
    
    public Persona() {        
    }

    public Persona(int id, String name, String telefono, int precioCompra, int precioVenta, int existencia, boolean enCarrito) {
        super();
        this.id = id;
        this.name = name;
        this.telefono = telefono;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.existencia = existencia;
        this.enCarrito = enCarrito;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getPrecioCompra() {
        return precioCompra;
    }
    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }
    public int getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    public boolean isEnCarrito() {
        return enCarrito;
    }

    public void setEnCarrito(boolean enCarrito) {
        this.enCarrito = enCarrito;
    }
}
