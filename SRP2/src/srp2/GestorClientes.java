/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srp2;

import java.util.LinkedList;

/**
 *
 * @author Santiago Jimenez
 */
public class GestorClientes {
    
    private LinkedList<Cliente> baseDatosClientes = new LinkedList<>();

    public GestorClientes() {
    }
    
    public void guardarCliente(Cliente c){
        if(c != null){
            baseDatosClientes.add(c);
            System.out.println("Cliente guardado exitosamente");
        }else{
            System.out.println("Cliente inválido");
        }
    }
    
    public void mostrarBaseDatos() {
        if (baseDatosClientes.isEmpty()) {
            System.out.println("No hay clientes en la base de datos.");
        } else {
            for (Cliente cliente : baseDatosClientes) {
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Cédula: " + cliente.getCedula());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("Teléfono: " + cliente.getTelefono());
                System.out.println("Dirección: " + cliente.getDireccion());
                System.out.println("Historial de Compras: ");
                for (Factura factura : cliente.getHistorial()) {
                    System.out.println("  ID Factura: " + factura.getId() + ", Total: " + factura.getTotal());
                }
                System.out.println();
            }
        }
    }
}
