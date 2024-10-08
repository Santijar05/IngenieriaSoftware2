# Taller 1 del SRP

## Descripción

Este proyecto aborda la refactorización de una clase llamada `Usuario` que inicialmente violaba el Principio de Responsabilidad Única (SRP). La clase original contenía múltiples métodos que cubrían diferentes responsabilidades, lo que hacía que la clase fuese difícil de mantener y extender.

## Problema Inicial

La clase `Usuario` originalmente contenía los siguientes métodos:

- **Obtener información del usuario**
- **Enviar correos electrónicos**
- **Validar contraseñas**
- **Calcular el salario**

### Violaciones del SRP

El SRP establece que una clase debe tener una única responsabilidad, es decir, debe haber una sola responsabilidad por el cual una clase necesite ser modificada. En la clase `Usuario`, se observan múltiples responsabilidades:
a
1. **Gestión de información del usuario**: Obtener la información del usuario es una responsabilidad relacionada los datos del usuario.
2. **Envío de correos electrónicos**: Este método implica una responsabilidad relacionada con la comunicación y no con los datos del usuario.
3. **Validación de contraseñas**: Esta es una responsabilidad de seguridad, que debe estar separada de la gestión de usuarios.
4. **Cálculo del salario**: Esta responsabilidad está relacionada con la lógica de negocio, específicamente con el cálculo de salarios, y no con la gestión de usuarios.

Debido a estas múltiples responsabilidades, la clase `Usuario` violaba el SRP.

## Solución: Refactorización

Para cumplir con el SRP, se refactorizó la clase `Usuario` dividiéndola en varias clases más pequeñas, cada una con una única responsabilidad.

### Nuevas Clases

1. **Clase `Usuario`**: Encargada de manejar la información del usuario.
2. **Clase `GestorCorreos`**: Responsable del envío de correos electrónicos.
3. **Clase `ValidadorContrasena`**: Encargada de validar las contraseñas.
4. **Clase `CalculadoraSalario`**: Responsable de calcular el salario del usuario.

### Razón de la Separación

- **`Usuario`**: Esta clase se centra exclusivamente en los datos del usuario y de su obtención.
- **`GestorCorreos`**: Al separar la lógica de envío de correos, se hace más fácil modificar y mantener esta funcionalidad, además de permitir su reutilización en otros contextos.
- **`ValidadorContrasena`**: Separar la validación de contraseñas permite que la lógica de seguridad sea independiente.
- **`CalculadoraSalario`**: La lógica de cálculo de salarios se encapsula en esta clase, lo que permite cambios en las reglas de negocio sin afectar otras partes del sistema.

## Conclusión

Esta refactorización mejora la mantenibilidad y escalabilidad del código al asegurar que cada clase tiene una única responsabilidad, cumpliendo así con el Principio de Responsabilidad Única.

## Instrucciones para Ejecutar

1. Asegúrate de tener configurado tu entorno de desarrollo.
2. Ejecuta el archivo Taller1SRP el cual corresponde a la clase Main del proyecto.

