/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1srp;

/**
 *
 * @author santi
 */
public class ValidadorContraseñas {
    
    public boolean ValidarContraseñas(String contraseña, String entrada){
        if(contraseña.equals(entrada)){
            System.out.println("Contraseña correcta");
            return true;
        }else{
            System.out.println("Contraseña incorrecta, Sigue intentando");
            return false;
        }
    }
    
}
