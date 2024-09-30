/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author santi
 */
public class Usuario {
    private ControladorVenta controlador = new ControladorVenta();
    public void comprar(String tipoEntrada) {
        controlador.comprarEntrada(tipoEntrada);
    }
}
