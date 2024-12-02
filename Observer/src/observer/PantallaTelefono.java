/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author santi
 */
public class PantallaTelefono implements Observador{
    
    private String ultimoDato;

    @Override
    public void actualizar(String datoClimatico) {
        ultimoDato = datoClimatico;
        System.out.println("Actualizando dato climatico en telefono: "+datoClimatico);
    }
    
}
