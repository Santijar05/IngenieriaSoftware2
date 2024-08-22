/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package srp2;

import java.util.LinkedList;

/**
 *
 * @author Santiago Jimenez
 */
public class SRP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorClientes gc = new GestorClientes();
        GestorFacturas gf = new GestorFacturas();
        RemitenteCorreoFactura rcf = new RemitenteCorreoFactura();
        RemitenteFacturaDian rfd = new RemitenteFacturaDian();
        GestorReportesFacturas grf = new GestorReportesFacturas(gf);
        
        // Crear listas de productos
        LinkedList<String> productos1 = new LinkedList<>();
        productos1.add("Laptop Dell XPS 13");
        productos1.add("Mouse Logitech MX Master 3");

        LinkedList<String> productos2 = new LinkedList<>();
        productos2.add("Smartphone Samsung Galaxy S21");
        productos2.add("Auriculares Sony WH-1000XM4");

        LinkedList<String> productos3 = new LinkedList<>();
        productos3.add("Tablet Apple iPad Pro");
        productos3.add("Teclado Mecánico Corsair K95");

        LinkedList<String> productos4 = new LinkedList<>();
        productos4.add("Monitor LG UltraWide");
        productos4.add("Impresora HP LaserJet Pro");

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Pérez", "123456789", "juan.perez@example.com", "555-1234", "Calle Falsa 123");
        Cliente cliente2 = new Cliente("Ana Gómez", "987654321", "ana.gomez@example.com", "555-5678", "Avenida Siempre Viva 456");
        System.out.println("");
        gc.guardarCliente(cliente1);
        gc.guardarCliente(cliente2);
        System.out.println("");
        // Crear facturas para cliente1
        Factura factura1 = new Factura("F001",  cliente1, productos1, 1200.50);
        Factura factura2 = new Factura("F002",  cliente1, productos2, 2000.75);
        Factura factura3 = new Factura("F003",  cliente1, productos3, 1500.00);

        // Crear facturas para cliente2
        Factura factura4 = new Factura("F004",  cliente2, productos2, 3000.25);
        Factura factura5 = new Factura("F005",  cliente2, productos3, 2500.50);
        Factura factura6 = new Factura("F006",  cliente2, productos4, 4000.00);
        System.out.println("");
        gf.guardarFactura(factura1);
        gf.guardarFactura(factura2);
        gf.guardarFactura(factura3);
        gf.guardarFactura(factura4);
        gf.guardarFactura(factura5);
        gf.guardarFactura(factura6);
        System.out.println("");
        
        rcf.enviarFactura(factura6, cliente2);
        System.out.println("");
        rfd.enviarFacturaDian(factura1);
        System.out.println("");
        gf.mostrarBaseDatos();
        gc.mostrarBaseDatos();
        
        // Verificar el historial de compras de cada cliente
        System.out.println("Historial de compras de "+cliente1.getNombre());
        for (Factura f : cliente1.getHistorial()) {
            System.out.println("ID Factura: " + f.getId() + ", Total: " + f.getTotal());
        }

        System.out.println("\nHistorial de compras de "+cliente2.getNombre());
        for (Factura f : cliente2.getHistorial()) {
            System.out.println("ID Factura: " + f.getId() + ", Total: " + f.getTotal());
        }
        System.out.println("");
        grf.generarReporteUltimoMes();
    }
    
}
