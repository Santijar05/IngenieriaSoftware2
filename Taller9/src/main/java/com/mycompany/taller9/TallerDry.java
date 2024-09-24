/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller9;

/**
 *
 * @author santi
 */
public class TallerDry {
    
    private String email1 = "ejemplo1@dominio.com";
    private String email2 = "ejemplo2@dominio";

    public void verificarValidezEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Email inválido: " + email);
        } else {
            System.out.println("Email válido: " + email);
        }
    }

    public static void main(String[] args) {
        TallerDry main = new TallerDry();
        main.verificarValidezEmail(main.email1);
        main.verificarValidezEmail(main.email2);
    }
}
