/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author santi
 */
public class TallerOCP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Envio e1 = new EnvioEstandar(20.0,150.0,"Un lugar", " Otro lugar");
        Envio e2 = new EnvioExpress(5.0, 200.0, "La quinta porra", "Por allá lejos");
        Envio e3 = new EnvioInternacional(15.0, 825.0, "Un país", "Otro país");
        
        CalculadorCosto calculador = new CalculadorCosto();
        
        System.out.println("Costo Envio Estandar #1: $"+ calculador.calcularCosto(e1));
        System.out.println("Costo Envio Express #1: $"+ calculador.calcularCosto(e2));
        System.out.println("Costo Envio Internacional #1: $"+ calculador.calcularCosto(e3));
    }
    
}
