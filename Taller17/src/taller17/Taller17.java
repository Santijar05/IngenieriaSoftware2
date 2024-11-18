/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller17;

import Adapter.Impresora;
import Adapter.ImpresoraInkJet;
import Adapter.ImpresoraInkJetAdapter;
import Adapter.ImpresoraLaser;
import Adapter.ImpresoraLaserAdapter;
import Singleton.Settings;

/**
 *
 * @author santi
 */
public class Taller17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Singleton
        Settings configuracion = Settings.getInstance();
        System.out.println("Tema actual: " + configuracion.getConfiguracion("theme"));
        System.out.println("Idioma actual: " + configuracion.getConfiguracion("language"));

        configuracion.setConfiguracion("theme", "dark");
        configuracion.setConfiguracion("language", "es");

        System.out.println("Nuevo tema: " + configuracion.getConfiguracion("theme"));
        System.out.println("Nuevo idioma: " + configuracion.getConfiguracion("language"));
        
        // Adapter
        ImpresoraLaser impresoraLaser = new ImpresoraLaser();
        ImpresoraInkJet impresoraInkJet = new ImpresoraInkJet();

        Impresora impresora1 = new ImpresoraLaserAdapter(impresoraLaser);
        Impresora impresora2 = new ImpresoraInkJetAdapter(impresoraInkJet);

        impresora1.imprimir();
        impresora2.imprimir();
    }
    
}
