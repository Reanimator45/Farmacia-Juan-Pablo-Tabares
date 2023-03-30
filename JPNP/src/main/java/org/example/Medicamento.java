package org.example;

import java.util.Date;

public class Medicamento {
    private String nombre;
    private double precio;
    private String marca;
    private Date fechaCaducidad;
    private Date fechaFabricacion;
    private int cantidad;

    public Medicamento(String nombre, double precio, String marca, Date fechaCaducidad, Date fechaFabricacion, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.fechaCaducidad = fechaCaducidad;
        this.fechaFabricacion = fechaFabricacion;
        this.cantidad = cantidad;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}








