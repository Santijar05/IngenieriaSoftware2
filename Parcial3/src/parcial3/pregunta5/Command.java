/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial3.pregunta5;

/**
 *
 * @author santi
 */
public class Command {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computador computador = new Computador();
        Celular celular = new Celular();
        
        Comando apagarcelular = new ApagarComandoCelular(celular);
        Comando encendercelular = new EncenderComandoCelular(celular);
        Comando reiniciarcelular = new ReiniciarComandoCelular(celular);
        Comando suspendercelular = new SuspenderComandoCelular(celular);
        
        Comando apagarcomputador = new ApagarComandoComputador(computador);
        Comando encendercomputador = new EncenderComandoComputador(computador);
        Comando reiniciarcomputador = new ReiniciarComandoComputador(computador);
        Comando suspendercomputador = new SuspenderComandoComputador(computador);
        
        Control control = new Control(apagarcomputador);
        control.ejecutar();
    }
    
}
