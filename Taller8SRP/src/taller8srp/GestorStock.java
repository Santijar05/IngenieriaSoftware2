/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8srp;

/**
 *
 * @author santi
 */
public class GestorStock {

    public GestorStock() {
    }
    
    public void aumentarStock(Producto p, int cantidad){
        p.setStock(p.getStock()+cantidad);
    }
    
    public void disminuirStock(Producto p, int cantidad){
        p.setStock(p.getStock()-cantidad);
    }
}
