/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerisp2;

/**
 *
 * @author santi
 */
public class PaquetePegriloso extends Paquete implements Asegurable, Verificable{
    
    private String etiquetasPeligro;
    private Boolean embalajeEspecial;

    public PaquetePegriloso(String etiquetasPeligro, Boolean embalajeEspecial, double peso, String dimensiones) {
        super(peso, dimensiones);
        this.etiquetasPeligro = etiquetasPeligro;
        this.embalajeEspecial = embalajeEspecial;
    }

    @Override
    public void asegurarPaquetePegriloso() {
        System.out.println("Paquete peligroso asegurado");
    }

    @Override
    public void verificarContenidoPegriloso() {
        System.out.println("Se verificó el contenido del paquete peligroso");
    }
    
    
}
