package org.example;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private int codigo;
    private List<DetalleCompra> detalles;
    private double subtotal;
    private double iva;
    private double descuento;
    private double total;

    public Compra(int codigo) {
        this.codigo = codigo;
        detalles = new ArrayList<>();
        subtotal = 0;
        iva = 0;
        descuento = 0;
        total = 0;
    }

    public void agregarMedicamento(Medicamento medicamento, int cantidad) {
        DetalleCompra detalleCompra = new DetalleCompra(medicamento, cantidad);
        detalles.add(detalleCompra);
        subtotal += detalleCompra.calcularCosto();
        descuento += detalleCompra.calcularDescuento();
        iva = calcularIVA();
        total = calcularCostoTotal();
    }

    public double calcularCostoTotal() {
        return subtotal + iva - descuento;
    }

    public double calcularIVA() {
        return subtotal * 0.12;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<DetalleCompra> getDetalles() {
        return detalles;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getIVA() {
        return iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getTotal() {
        return total;
    }
}




