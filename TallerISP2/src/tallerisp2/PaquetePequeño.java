/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerisp2;

/**
 *
 * @author santi
 */
public class PaquetePequeño extends Paquete implements CalculablePequeño{
    private double valorDeclarado;

    public PaquetePequeño(double valorDeclarado, double peso, String dimensiones) {
        super(peso, dimensiones);
        this.valorDeclarado = valorDeclarado;
    }
    
    

    @Override
    public void calcularCostoEnvioPequeño() {
        System.out.println("El costo de paquete pequeño es: $20");
    }
    
}
