/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial3.pregunta4;

/**
 *
 * @author santi
 */
public class MainSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuracion configuracion = new Configuracion();
        configuracion.getInstancia("url", "Usuario", "hola123");
        System.out.println(configuracion.toString());
    }
    
}
