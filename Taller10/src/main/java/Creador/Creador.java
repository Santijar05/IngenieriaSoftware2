/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Creador;

/**
 *
 * @author santi
 */
public class Creador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Orden orden = new Orden();

        orden.agregarComputadora("Intel i7", "NVIDIA GTX 1660", 16);
        orden.agregarComputadora("AMD Ryzen 5", "AMD Radeon RX 5700", 32);
        orden.agregarComputadora("Intel i5", "Intel HD Graphics 630", 8);

        orden.mostrarOrden();
    }
    
}
