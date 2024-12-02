/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial3.pregunta5;

/**
 *
 * @author santi
 */
public class Control {
    
    private Comando comando;

    public Control(Comando comando) {
        this.comando = comando;
    }
    
    
    public void ejecutar(){
        comando.ejecutar();
    }
}
