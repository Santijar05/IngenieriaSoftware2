/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author santi
 */


public class Settings {
    private static Settings instancia;
    private Map<String, String> configuraciones;

    private Settings() {
        configuraciones = new HashMap<>();
        configuraciones.put("theme", "light");
        configuraciones.put("language", "en");
    }

    public static Settings getInstance() {
        if (instancia == null) {
            instancia = new Settings();
        }
        return instancia;
    }

    public String getConfiguracion(String clave) {
        return configuraciones.get(clave);
    }

    public void setConfiguracion(String clave, String valor) {
        configuraciones.put(clave, valor);
    }
}

