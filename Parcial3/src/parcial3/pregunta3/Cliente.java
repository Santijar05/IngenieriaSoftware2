/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial3.pregunta3;

/**
 *
 * @author santi
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NuevoSistemaPago nuevoSistemaPago = new NuevoSistemaPago("Santiago", "1234567890", "mbappe.fantasma@madrid.com");
        SistemaPago adapter = new SistemaPagoAdapter(nuevoSistemaPago);
        adapter.operar();
    }
    
}
