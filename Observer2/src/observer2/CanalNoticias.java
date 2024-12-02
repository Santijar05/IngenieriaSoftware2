/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class CanalNoticias {
    private List<Observador> suscriptores;
    private Noticia noticia;

    public CanalNoticias() {
        this.suscriptores = new ArrayList<>();
    }
    
    public void agregarSuscriptor(Observador suscriptor){
        suscriptores.add(suscriptor);
    }
    
    public void eliminarSuscriptor(Observador suscriptor){
        suscriptores.remove(suscriptor);
    }
    
    public void notificarSuscriptores(Noticia ultima){
        this.noticia = ultima;
        for (Observador suscriptor : suscriptores) {
            suscriptor.actualizar(noticia);
        }
    }
    
}
