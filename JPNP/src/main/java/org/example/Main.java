package org.example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Crear compra
        Compra compra = new Compra();

        // Agregar medicamentos
        System.out.println("¿Cuantos medicamentos desea agregar?");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Medicamento " + (i+1) + ":");
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Precio unitario: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Laboratorio: ");
            String lab = scanner.nextLine();
            System.out.println("Descripción: ");
            String desc = scanner.nextLine();
            System.out.println("Fecha de vencimiento (dd/MM/yyyy): ");
            Date fechaVencimiento = null;
            try {
                fechaVencimiento = sdf.parse(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Error al ingresar fecha de vencimiento. " + e.getMessage());
            }
            System.out.println("Fecha de fabricación (dd/MM/yyyy): ");
            Date fechaFabricacion = null;
            try {
                fechaFabricacion = sdf.parse(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Error al ingresar fecha de fabricación. " + e.getMessage());
            }
            System.out.println("Cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            Medicamento medicamento = new Medicamento(nombre, precio, lab, desc, fechaVencimiento, fechaFabricacion, cantidad);
            compra.agregarMedicamento(medicamento, cantidad);
        }

        // Mostrar factura
        System.out.println("FACTURA DE COMPRA\n");

        System.out.println("Fecha: " + sdf.format(new Date()));
        System.out.println("Detalles de la compra:");
        for (DetalleCompra detalle : compra.getDetalles()) {
            System.out.println(detalle.getMedicamento().getNombre() + " x " + detalle.getCantidad() + " - Subtotal: $" + detalle.calcularSubtotal());
        }
        System.out.println("Subtotal: $" + compra.calcularSubtotal());
        System.out.println("Descuento: $" + compra.calcularDescuento());
        System.out.println("IVA (19%): $" + compra.calcularIVA());
        System.out.println("Costo total: $" + compra.calcularCostoTotal());
    }
}



