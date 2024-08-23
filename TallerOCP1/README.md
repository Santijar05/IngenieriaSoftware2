# Taller sobre OCP (Open/Closed Principle)

Este taller se enfoca en aplicar el principio de **Open/Closed Principle (OCP)**, uno de los cinco principios SOLID de la ingeniería de software. El principio OCP establece que una clase debe estar **abierta para extensión pero cerrada para modificación**.

## Descripción del Problema

Se tiene un desarrollo de un sistema de envíos. Actualmente, el desarrollo cuenta con una clase Envio que contiene un metodo para calcular el costo donde para cada tipo de envio especifico se tiene que generar una extensión de la sentencia **else if**. En principio hay dos tipos de envíos: **Estándar** y **Express**. A partir del código actual se deben aplicar el principio SOLID OCP y explicar por qué. A continuación se presenta el código actual:

```java
public class Envio {
    public double calcularCosto(double peso, double distancia) {
        if (this instanceof EnvioEstandar) {
            return peso * 0.5 + distancia * 0.1;
        } else if (this instanceof EnvioExpress) {
            return peso * 1.0 + distancia * 0.2;
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
```
## Violaciones del OCP
El código actual viola el principio OCP por las siguientes razones:
- **Modificación del código existente:** Si se quiere agregar un nuevo tipo de envío, como envío internacional, debemos modificar la clase Envio para agregar una nueva condición if, lo cual rompe el principio de estar "cerrado para modificación".
- **Acoplamiento alto:** La clase Envio está muy acoplada a los tipos de envíos específicos, lo que dificulta la extensión del sistema sin cambiar el código existente.

### ¿Qué sucede si queremos agregar un nuevo tipo de envío, como envío internacional?
Si quisiéramos agregar un nuevo tipo de envío, tendríamos que modificar la clase Envio para añadir más if-else o instanceof. Esto implica que el código debe modificarse cada vez que se agregue un nuevo tipo de envío, lo cual no es sostenible a largo plazo y viola el OCP.

## Refactorización aplicando el OCP
Para cumplir con el principio de OCP, es necesario que nuestro código permita la adición de nuevos tipos de envíos sin necesidad de modificar las clases existentes. Esto lo logramos separando la lógica de cálculo de costo en diferentes clases y haciendo que Envio sea una clase abstracta.
### Nuevas clases:
- **Envio**: Clase abstracta que hereda a los tipos de envío más específico debido a los atributos comunes entre ellos y que contiene el metodo de calcularCosto que tambien queda abstracto.
- **EnvioEstandar**: Clase de envio específico que hereda de la clase Envio y que sobrescribe el método calcularCosto con su respectiva lógica.
- **EnvioExpress**: Clase de envio específico que hereda de la clase Envio y que sobrescribe el método calcularCosto con su respectiva lógica.
- **EnvioInternacional**: Clase de envio específico que hereda de la clase Envio y que sobrescribe el método calcularCosto con su respectiva lógica.
- **CalculadorCosto**: Clase que se encarga del cálculo de costo de cualquier tipo de Envio de manera uniforme. 

## Conclusión
Al aplicar el principio OCP, hemos conseguido que nuestro código sea extensible sin necesidad de modificar las clases existentes, lo que hace que el sistema sea más flexible y fácil de mantener. Cada nuevo tipo de envío que agreguemos se encapsula en una nueva clase sin alterar el comportamiento de las clases anteriores.

## Ejecución del proyecto
Para ver la funcionalidad del código refactorizado, se debe ejecutar la clase principal (TallerOCP1.java)
