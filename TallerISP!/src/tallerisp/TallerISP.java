/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerisp;

/**
 *
 * @author santi
 */
public class TallerISP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibreriaCartilla lcart = new Cartilla();
        LibreriaDVD ldvd = new DVD();
        LibreriaLibro llibro = new Libro();
        
        lcart.prestar();
        lcart.devolver();
        lcart.mantenimientoHojas();
        
        ldvd.prestar();
        ldvd.devolver();
        
        llibro.prestar();
        llibro.mantenimienetoHojas();
        llibro.renovarPortada();
        llibro.solicitarNuevaVersión();
        llibro.devolver();
        
    }
    
}
