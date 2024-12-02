/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial3.pregunta5;

/**
 *
 * @author santi
 */
public class ReiniciarComandoCelular implements Comando{
    private Celular celular;

    public ReiniciarComandoCelular(Celular celular) {
        this.celular = celular;
    }
           
    
    @Override
    public void ejecutar() {
        celular.reiniciar();
    }
}
