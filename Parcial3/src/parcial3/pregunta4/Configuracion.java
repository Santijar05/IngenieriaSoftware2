/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial3.pregunta4;

/**
 *
 * @author santi
 */
public class Configuracion {
    
    private static Configuracion instancia;
    
    private String url;
    private String usuario;
    private String password;

    public Configuracion() {
    }

    private Configuracion(String url, String usuario, String password) {
        this.url = url;
        this.usuario = usuario;
        this.password = password;
    }
    

    public static Configuracion getInstancia(String url, String usuario, String password) {
        if (instancia == null) {
            instancia = new Configuracion(url, usuario, password);
            return instancia;
        }
        return instancia;
    }    

    @Override
    public String toString() {
        return  "Configuracion: "+instancia.url+" "+instancia.usuario; 
    }
    
    
}
