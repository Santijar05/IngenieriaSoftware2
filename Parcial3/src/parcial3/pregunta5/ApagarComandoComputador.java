/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial3.pregunta5;

/**
 *
 * @author santi
 */
public class ApagarComandoComputador implements Comando{
    private Computador computador;

    public ApagarComandoComputador(Computador computador) {
        this.computador = computador;
    }
           
    
    @Override
    public void ejecutar() {
        computador.apagar();
    }
}
