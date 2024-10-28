/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import java.util.Set;

/**
 *
 * @author santi
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private Set<String> intereses;

    Usuario(String nombre, int edad, String correo, Set<String> intereses) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.intereses = intereses;
    }

    public void mostrarUsuario() {
        System.out.println("Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                ", intereses=" + intereses +
                '}');
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public Set<String> getIntereses() {
        return intereses;
    }

    
}