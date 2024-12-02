/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer2;

/**
 *
 * @author santi
 */
public class Usuario implements Observador{
    
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    

    @Override
    public void actualizar(Noticia noticia) {
        System.out.println("Atención "+this.nombre+" Ultima noticia: "+noticia.getDescripción());
    }
    
}
