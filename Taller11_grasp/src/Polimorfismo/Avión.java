/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author santi
 */
public class Avión implements Transporte{
    @Override
    public void acelerar() {
        System.out.println("El avión acelera.");
    }

    @Override
    public void frenar() {
        System.out.println("El avión frena");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Info del avión");
    }
}
