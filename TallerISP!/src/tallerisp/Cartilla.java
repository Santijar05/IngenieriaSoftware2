/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerisp;

/**
 *
 * @author santi
 */
public class Cartilla implements LibreriaCartilla {
    
    private String nombre;
    
    private int  numeroHojas;

    @Override
    public void prestar() {
        System.out.println("Cartilla prestada");
    }

    @Override
    public void devolver() {
        System.out.println("Cartilla devuelta");
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("Mantemiento de hojas de la cartilla realizada.");
    }
    
}
