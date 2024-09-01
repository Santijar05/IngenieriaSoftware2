/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerlsp1;

import java.util.Random;

/**
 *
 * @author santi
 */
public class ProductoMixtos extends Producto implements Enviable {
    
    private double tamañoArchivo; // Tamaño del archivo en GB
    private double peso; // Peso del producto en KG

    public ProductoMixtos(double tamañoArchivo, double peso, String nombre, int cantidad, double precio) {
        super(nombre, cantidad, precio);
        this.tamañoArchivo = tamañoArchivo;
        this.peso = peso;
    }

    @Override
    public double calcularCosto() {
        return this.cantidad * this.precio;
    }

    @Override
    public void enviarPorCorreo() {
        Random random = new Random();
        String guia = String.valueOf(random.nextInt(2_147_100_178 - 1_000_000_000) + 1000_000_000);
        System.out.println("Su producto Mixto ha sido enviado en la empresa de Correo Rapidin ");
        System.out.println("Su número de guía es: " +guia);
    }
    
    
    
}
