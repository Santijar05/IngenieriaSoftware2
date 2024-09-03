/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerisp;

/**
 *
 * @author santi
 */
public class DVD implements LibreriaDVD{
    
    private String nombre;
    private String archivo;
    private int stock;

    @Override
    public void prestar() {
        System.out.println("DVD prestado");
    }

    @Override
    public void devolver() {
        System.out.println("DVD devuelto");
    }
    
}
