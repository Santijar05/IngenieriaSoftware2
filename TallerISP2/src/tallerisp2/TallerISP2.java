/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerisp2;

/**
 *
 * @author santi
 */
public class TallerISP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculablePequeño peq1 = new PaquetePequeño(20000.0, 250, "1m*1.15m");
        CalculableGrande paq_grande = new PaqueteGrande(2, "Cheta", 8, "0.4*0.45");
        Verificable paq_pelig = new PaquetePegriloso("Frágil", Boolean.TRUE, 12, "1*0.85");
        Asegurable paq_pelig2 = new PaquetePegriloso("Delicado", Boolean.FALSE, 24, "1.25*1.12");
        
        peq1.calcularCostoEnvioPequeño();
        paq_grande.calcularCostoEnvioGrande();
        paq_pelig.verificarContenidoPegriloso();
        paq_pelig2.asegurarPaquetePegriloso();
        
    }
    
}
