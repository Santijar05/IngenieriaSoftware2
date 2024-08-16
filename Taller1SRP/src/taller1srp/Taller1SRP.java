/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1srp;

/**
 *
 * @author santi
 */
public class Taller1SRP {
    
    private Usuario u;
    private ServicioDeCorreos s;
    private CalculadoraSalario c;
    private ValidadorContraseñas v;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario u = new Usuario("Chipi Chipi", "chipic@example.com", "Ch1p1", 2000);
        Usuario us = new Usuario("Lola Mento", "lmento@example.com", "1o1a", 2000);
        ServicioDeCorreos s = new ServicioDeCorreos();
        CalculadoraSalario c = new CalculadoraSalario();
        ValidadorContraseñas v = new ValidadorContraseñas();
        
        u.ObtenerInfoUsuario();
        s.EnviarCorreo(u.getEmail(), us.getEmail(), "¡Viva la Libertad CARAJO!");
        v.ValidarContraseñas(us.getContraseña(), "1o1a");
    }
    
}
