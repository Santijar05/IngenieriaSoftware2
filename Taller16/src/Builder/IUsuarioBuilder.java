/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builder;

import java.util.Set;

/**
 *
 * @author santi
 */
public interface IUsuarioBuilder {
    IUsuarioBuilder setNombre(String nombre);
    IUsuarioBuilder setEdad(int edad);
    IUsuarioBuilder setCorreo(String correo);
    IUsuarioBuilder setIntereses(Set<String> intereses);
    Usuario build();
}
