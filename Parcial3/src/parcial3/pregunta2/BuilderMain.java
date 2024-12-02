/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial3.pregunta2;

/**
 *
 * @author santi
 */
public class BuilderMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setTipoCarne("Angus 100%");
        builder.setTipoPan("Brioche");
        builder.setTipoQueso("Americano");        
        builder.setTipoTomate("Milano");
        Hamburguesa hamburguesa = new Hamburguesa(builder);
        hamburguesa.tostring();
        
                    
    }
    
}
