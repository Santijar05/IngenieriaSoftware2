/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerisp;

/**
 *
 * @author santi
 */
public class Libro implements LibreriaLibro{
    
    private String nombre;
    private String autor;
    private int numeroHojas;
    private String imagen;
    private String serial;

    @Override
    public void prestar() {
        System.out.println("Libro prestado ");
    }

    @Override
    public void devolver() {
        System.out.println("Libro devuelto");
    }

    @Override
    public void renovarPortada() {
        System.out.println("Portada renovada");
    }

    @Override
    public void mantenimienetoHojas() {
        System.out.println("Mantenimietno a hojas realizado" );
    }

    @Override
    public void solicitarNuevaVersión() {
        System.out.println("Nueva versión solicitada");
    }
    
}
