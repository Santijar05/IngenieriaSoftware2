/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1srp;

/**
 * Esta clase define objetos que validan si una contraseña es válida.
 * @author Santiago Jimenez
 */
public class ValidadorContraseña {

    /**
     * Constructor del Validador de contraseña.
     */
    public ValidadorContraseña() {
    }
    
    
    /**
     * Metodo que retorna un booleano que indica la validez de una contraseña ingresada.
     * @param contraseña Contraseña de un usuario
     * @param entrada Contraseña ingresada que se desea validar.
     * @return Validez de la contraseña ingresada.
     */
    public boolean ValidarContraseña(String contraseña, String entrada){
        if(contraseña.equals(entrada)){
            System.out.println("Contraseña correcta");
            return true;
        }else{
            System.out.println("Contraseña incorrecta, Sigue intentando");
            return false;
        }
    }
    
}
