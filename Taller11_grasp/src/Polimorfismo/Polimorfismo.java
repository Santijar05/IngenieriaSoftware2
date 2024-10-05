/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author santi
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garage garage = new Garage();
        Coche coche = new Coche();
        Avión avion = new Avión();
        Bicicleta bicicleta = new Bicicleta();
        garage.estacionar(coche);
        garage.estacionar(avion);
        garage.estacionar(bicicleta);
    }
    
}
