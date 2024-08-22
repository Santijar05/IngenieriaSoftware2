/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srp2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.LinkedList;

/**
 *
 * @author santi
 */
public class GestorReportesFacturas {
    
    private GestorFacturas g;

    public GestorReportesFacturas() {
    }

    public GestorReportesFacturas(GestorFacturas g) {
        this.g = g;
    }
    
    public void generarReporteUltimoMes() {
        LocalDateTime inicioMes = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay();
        LocalDateTime finMes = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).atTime(23, 59, 59);

        LinkedList<Factura> facturasUltimoMes = new LinkedList<>();

        for (Factura factura : g.getBaseDatosFacturas()) {
            if (factura.getFecha().isAfter(inicioMes) && factura.getFecha().isBefore(finMes)) {
                facturasUltimoMes.add(factura);
            }
        }

        mostrarReporte(facturasUltimoMes);
    }

    private void mostrarReporte(LinkedList<Factura> facturas) {
        if (facturas.isEmpty()) {
            System.out.println("No hay facturas del último mes.");
        } else {
            System.out.println("Reporte de Facturas del Último Mes:");
            for (Factura factura : facturas) {
                System.out.println("ID Factura: " + factura.getId());
                System.out.println("Fecha: " + factura.getFecha());
                System.out.println("Cliente: " + factura.getCliente().getNombre());
                System.out.println("Total: " + factura.getTotal());
                System.out.println("Productos: " + factura.getProductos());
                System.out.println();
            }
        }
    }
    
    
}
