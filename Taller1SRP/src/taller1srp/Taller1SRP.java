/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1srp;

import javax.swing.JOptionPane;

/**
 * Funcionalidad de la refactorización de la clase Usuario luego de aplicar el SRP
 * @author Santiago Jimenez
 */
public class Taller1SRP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario u = new Usuario("Chipi Chipi", "chipic@example.com", "Ch1p1", 2000, 38);
        Usuario us = new Usuario("Lola Mento", "lmento@example.com", "1o1a", 2000, 43);
        GestorCorreos s = new GestorCorreos();
        CalculadoraSalario c = new CalculadoraSalario();
        ValidadorContraseña v = new ValidadorContraseña();
        
        u.ObtenerInfoUsuario();
        s.EnviarCorreo(u.getEmail(), us.getEmail(), "¡Viva la Libertad CARAJO!");
        String entrada = JOptionPane.showInputDialog("Ingrese la contraseña: ");
        v.ValidarContraseña(u.getContraseña(), entrada);
        c.CalcularSalario(us.getHorasTrabaj());
    }
    
}
