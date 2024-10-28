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
public class IUsuarioBuilderImpl implements IUsuarioBuilder{
    private String nombre;
    private int edad;
    private String correo;
    private Set<String> intereses;

    @Override
    public IUsuarioBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public IUsuarioBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    @Override
    public IUsuarioBuilder setCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    @Override
    public IUsuarioBuilder setIntereses(Set<String> intereses) {
        this.intereses = intereses;
        return this;
    }

    @Override
    public Usuario build() {
        return new Usuario(nombre, edad, correo, intereses);
    }
}

