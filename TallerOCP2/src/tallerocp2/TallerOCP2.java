/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerocp2;

/**
 *
 * @author santi
 */
public class TallerOCP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura f = new Factura();
        Calculo civa = new CalculoImpuestoIva("Producto 1", 14);
        Calculo criva = new CalculoImpuestoRetelva("Producto 1", 10);
        Calculo csalud = new CalculoImpuestoSaludable("Producto 1", 8);
        
        System.out.println("Iva: "+civa.calcularImpuesto());
        System.out.println("Total con impuesto IVA: "+f.calcularImpuesto(civa));
        
        System.out.println("Iva: "+criva.calcularImpuesto());
        System.out.println("Total con impuesto IVA: "+f.calcularImpuesto(criva));

        System.out.println("Iva: "+csalud.calcularImpuesto());
        System.out.println("Total con impuesto IVA: "+f.calcularImpuesto(csalud));
    }
    
}
