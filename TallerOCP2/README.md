# Taller 4: Cálculo de Impuestos - Principio OCP

Este taller tiene como objetivo aplicar el Principio de Abierto/Cerrado (OCP) para un sistema de facturación en una tienda en línea. El sistema debe permitir la adición de nuevos tipos de impuestos sin modificar las clases existentes.

## Descripción del Problema

Imagina que estás desarrollando un sistema de facturación para una tienda en línea. Inicialmente, solo se aplica el impuesto IVA del 19%. Sin embargo, en el futuro se quiere agregar nuevos tipos de impuestos como el ICA (10%) e IVASALUDABLE (5%).

El objetivo es diseñar un sistema que pueda manejar estos diferentes tipos de impuestos, siguiendo el Principio de Abierto/Cerrado, donde las clases deben estar abiertas a la extensión pero cerradas a la modificación.

## Clases a Tener en Cuenta

1. **Producto**: Clase que representa un producto en la tienda, con atributos como `nombre` y `precio`.

2. **Calculo**: Clase abstracta que representa el cálculo del impuesto. Tendrá como atributos el `producto` y la `cantidad` del producto.

3. **CalculoImpuestoIva**: Clase concreta que calcula el impuesto por IVA. Tiene un atributo fijo para el valor del IVA (19%).

4. **CalculoImpuestoReteIva**: Clase concreta que calcula la retención del IVA (ReteIVA). Calcula el 50% del valor del IVA.

5. **CalculoImpuestoSaludable**: Clase concreta que calcula un impuesto saludable. Tiene un atributo fijo para el valor del impuesto (5%).

6. **Factura**: Clase encargada de realizar el cálculo del impuesto correspondiente y de imprimir los detalles.

## Aplicación del Principio de Abierto/Cerrado (OCP) en el Taller

El Principio de Abierto/Cerrado (OCP) establece que una clase debe estar abierta para la extensión pero cerrada para la modificación. En este taller, el OCP se aplica de la siguiente manera:

1. **Clases Abiertas para Extensión**: 
   - La clase abstracta `Calculo` define una interfaz común para todas las clases de cálculo de impuestos. Esto permite que se puedan agregar nuevos tipos de impuestos simplemente creando nuevas subclases de `Calculo` sin tener que modificar el código existente.
   - Por ejemplo, si se requiere agregar un nuevo tipo de impuesto, como un impuesto ecológico, se puede crear una nueva clase `CalculoImpuestoEcologico` que extienda `Calculo` e implemente el cálculo del nuevo impuesto. No es necesario modificar las clases de cálculo existentes ni la clase `Factura`.

2. **Clases Cerradas para Modificación**: 
   - Las clases `CalculoImpuestoIva`, `CalculoImpuestoReteIva` y `CalculoImpuestoSaludable` no necesitan ser modificadas cuando se agregan nuevos tipos de impuestos. Esto protege el código existente contra errores o comportamientos inesperados al evitar cambios innecesarios en clases que ya funcionan correctamente.

### Beneficios de Aplicar el OCP en el Taller

1. **Mantenibilidad**: 
   - Al seguir el OCP, se facilita la mantenibilidad del sistema ya que no es necesario modificar el código existente cuando se agregan nuevas funcionalidades. Esto reduce el riesgo de introducir errores en partes del código que ya funcionan.
   
2. **Extensibilidad**: 
   - La estructura del código permite que se añadan nuevos tipos de impuestos de forma rápida y sencilla. Cada nuevo impuesto se implementa como una nueva subclase, lo que asegura que el código sea fácilmente extensible para adaptarse a futuras necesidades.

3. **Reducción del Acoplamiento**: 
   - Al utilizar clases abstractas y polimorfismo, se reduce el acoplamiento entre las diferentes partes del sistema. La clase `Factura` no necesita saber cómo se implementa cada tipo de cálculo de impuestos, simplemente interactúa con objetos de tipo `Calculo`, lo que promueve un diseño más flexible y modular.

4. **Reutilización del Código**: 
   - Al encapsular la lógica del cálculo de impuestos en clases independientes, se fomenta la reutilización del código. Las subclases que implementan diferentes cálculos de impuestos pueden ser reutilizadas en otros contextos sin necesidad de duplicar código.

En resumen, la aplicación del OCP en este taller asegura que el sistema sea más robusto, flexible y preparado para cambios futuros sin necesidad de realizar modificaciones en el código base, facilitando así el desarrollo a largo plazo.

## Expansión del Sistema
Para agregar un nuevo tipo de impuesto en el futuro, simplemente crea una nueva subclase de Calculo que implemente el método `calcularImpuesto()`. No es necesario modificar las clases existentes, lo que sigue el Principio de Abierto/Cerrado (OCP).

## Ejecución del proyecto
Para ejecutar el taller de manera funcional simplemente se debe correr la clase principal del proyecto que seria `TallerOCP2.java` .
