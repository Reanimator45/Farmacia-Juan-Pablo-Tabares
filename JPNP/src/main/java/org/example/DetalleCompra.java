package org.example;

public class DetalleCompra {
    private Medicamento medicamento;
    private int cantidad;

    public DetalleCompra(Medicamento medicamento, int cantidad, Compra compra) {
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        compra.agregarMedicamento(medicamento, cantidad);
    }

    public double calcularSubtotal() {
        return medicamento.getPrecioUnitario() * cantidad;
    }

    public double calcularDescuento() {
        double subtotal = calcularSubtotal();
        double descuento = 0.0;
        switch (medicamento.getTipo()) {
            case "1":
                descuento = subtotal * 0.05;
                break;
            case "2":
                descuento = subtotal * 0.06;
                break;
            case "3":
                descuento = subtotal * 0.08;
                break;
            case "4":
                descuento = subtotal * 0.10;
                break;
            case "5":
                descuento = 0;
                break;
        }
        return descuento;
    }

    public double calcularCosto() {
        return calcularSubtotal() - calcularDescuento();
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}




