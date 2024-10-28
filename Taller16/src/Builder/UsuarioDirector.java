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
public class UsuarioDirector {
    public Usuario constructUsuario(IUsuarioBuilder builder) {
        return builder
                .setNombre("Santiago")
                .setEdad(18)
                .setCorreo("santiago@example.com")
                .setIntereses(Set.of("Deportes", "Música"))
                .build();
    }
}
