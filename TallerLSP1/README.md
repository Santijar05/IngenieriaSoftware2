# Taller 5: Principio de Sustitución de Liskov (LSP)

Este taller aborda la implementación de un sistema de inventario que gestiona diferentes tipos de productos: productos físicos y productos digitales. Además, incluye productos mixtos que combinan características de ambos. El ejercicio aplica el Principio de Sustitución de Liskov (LSP) y otros principios SOLID para asegurar un diseño robusto y flexible.

## Descripción del Problema

Se nos pide diseñar un sistema de inventario para una tienda que maneja los siguientes tipos de productos:

- **Productos Físicos:** Tienen atributos como nombre, precio, cantidad y peso.
- **Productos Digitales:** Tienen atributos como nombre, precio, cantidad y tamaño del archivo.
- **Productos Mixtos:** Combinan los atributos de productos físicos (peso) y digitales (tamaño del archivo).

Además, se requiere implementar la funcionalidad de `enviarPorCorreo` únicamente para productos físicos y mixtos sin romper el cumplimiento de los principios SOLID.

## Clases Involucradas

### 1. **Clase Producto**
   - Contiene atributos comunes como nombre, precio y cantidad.
   - Define el método `calcularCosto()` para calcular el costo total de los productos.
   - Es la clase base para los tipos de productos físicos, digitales y mixtos.

### 2. **Clase ProductoFisico**
   - Hereda de `Producto`.
   - Incluye el atributo `peso`.
   - Sobrescribe el método `calcularCosto()` para incluir el cálculo basado en el peso.

### 3. **Clase ProductoDigital**
   - Hereda de `Producto`.
   - Incluye el atributo `tamañoArchivo`.
   - Sobrescribe el método `calcularCosto()` para calcular el costo basado en el tamaño del archivo.

### 4. **Clase ProductoMixto**
   - Hereda de `Producto`.
   - Incluye los atributos `peso` y `tamañoArchivo`.
   - Sobrescribe el método `calcularCosto()` para combinar los cálculos de costo basados en peso y tamaño de archivo.

### 5. **Interface Enviable**
   - Define el método `enviarPorCorreo()` que debe ser implementado por clases que representen productos que se pueden enviar por correo (ProductoFisico y ProductoMixto).

### 6. **Clase EnviadorCorreos**
   - Encapsula la lógica del envío por correo de productos que implementan la interfaz `Enviable`.
   - El método `enviarProducto()` toma un objeto `Enviable` y gestiona el envío por correo.

### 7. **Clase CalculadorCostoProducto**
   - Encapsula la lógica de cálculo de costos para cualquier tipo de producto.
   - Implementa un método `calcularCosto()` que se puede personalizar para distintos tipos de productos.

## Ejemplo de Implementación en Java

### Clase Producto
```java
public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public abstract double calcularCostoTotal();
}
```
## Aplicación del Principio de Sustitución de Liskov (LSP)
El Principio de Sustitución de Liskov (LSP) se aplica al garantizar que cualquier instancia de una clase hija (ProductoFisico, ProductoDigital, ProductoMixto) pueda ser utilizada en lugar de su clase base (Producto) sin alterar el comportamiento correcto del programa. Cada clase hija implementa su propia versión de calcularCosto() y, en el caso de las clases que implementan Enviable, el método enviarPorCorreo().

### Beneficios del LSP en este Taller
- **Flexibilidad**: Podemos agregar nuevos tipos de productos sin modificar el código existente en las clases base o en la lógica de envío.
- **Extensibilidad**: El sistema es fácil de extender si se necesita agregar más tipos de productos o modificar el cálculo de costos.
- **Reutilización de Código**: Al seguir LSP y otros principios SOLID, se promueve la reutilización de código, reduciendo la duplicación y mejorando el mantenimiento del sistema.
- 
## Principios SOLID Aplicados
S: Principio de Responsabilidad Única (SRP): Cada clase tiene una responsabilidad única, como calcular costos o enviar productos.
O: Principio de Abierto/Cerrado (OCP): El sistema está abierto a la extensión, permitiendo agregar nuevos tipos de productos sin modificar el código existente.
L: Principio de Sustitución de Liskov (LSP): Las subclases pueden sustituir a la clase base sin alterar la funcionalidad del programa.

## Conclusión
Este taller ilustra cómo aplicar el Principio de Sustitución de Liskov en el diseño de un sistema de inventario que maneja diferentes tipos de productos y calcula sus costos de manera flexible y extensible. Además, muestra cómo varios de los principios SOLID pueden trabajar en conjunto para crear sistemas más robustos y mantenibles.

## Ejecución del proyecto
Para ver la funcionalidad del sistema de Inventario, puede ejecutar la clase principal (TallerLSP1.java)
