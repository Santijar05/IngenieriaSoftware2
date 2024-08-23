# Taller 2 sobre SRP (Single Responsibility Principle)

Este proyecto tiene como objetivo aplicar el principio de responsabilidad única (SRP) a las clases `Cliente` y `Factura` dentro de un sistema de facturación. La refactorización realizada busca distribuir las diferentes responsabilidades en clases especializadas.

## Contexto

Inicialmente, la clase `Factura` contenía múltiples responsabilidades:

- Guardar la información de la factura en la base de datos.
- Enviar un correo electrónico con la factura generada.
- Enviar la factura a la DIAN.
- Generar reportes de facturas.

Además, la clase `Cliente` también mezclaba la lógica de gestión de clientes con otras responsabilidades no relacionadas directamente con la entidad de cliente.

### Problemas Identificados

- **Violación del SRP**: Tanto la clase `Factura` como la clase `Cliente` asumían múltiples responsabilidades. Esto hace que el código sea más difícil de mantener, modificar y probar.

### Justificación de la Refactorización

El principio de responsabilidad única establece que una clase debería tener una única razón para cambiar. Al tener responsabilidades múltiples, las clases originales no cumplían con este principio, lo que generaba alta cohesión y baja mantenibilidad.

## Solución Propuesta

Se han refactorizado las clases `Cliente` y `Factura`, dividiendo sus responsabilidades en varias clases más pequeñas y especializadas.

### Nuevas Clases

#### Relacionadas con `Cliente`
- **Cliente**: Contiene la información básica del cliente, como nombre, dirección, etc.
- **GestorClientes**: Se encarga de la lógica de guardar la información de los clientes en la base de datos.

#### Relacionadas con `Factura`
- **Factura**: Contiene la información básica de la factura, como fecha, monto, y el cliente asociado.
- **GestorFacturas**: Se encarga de guardar la información de la factura en la base de datos y de generar reportes de facturación.
- **RemitenteCorreoFactura**: Se ocupa de enviar la factura al cliente por correo electrónico.
- **RemitenteFacturaDian**: Gestiona el envío de la factura a la DIAN.
- **GestorReportesFacturas**: Gestiona el reporte de facturas del último mes.

### Clase Principal

- **SRP2**: Clase principal que ejecuta el código refactorizado y demuestra el funcionamiento de las nuevas clases. 

## Refactorización del Código

### División de Responsabilidades

1. **Cliente**:
   - **Antes**: Gestionaba tanto la información del cliente como la lógica para almacenar los datos en la base de datos.
   - **Después**: Ahora solo contiene los datos del cliente. La lógica de almacenamiento se delega a la clase `GestorClientes`.

2. **Factura**:
   - **Antes**: Se encargaba de manejar la información de la factura, almacenar en la base de datos, enviar correos, generar reporte de facturas y reportar a la DIAN.
   - **Después**: Ahora solo se ocupa de los datos de la factura. Las tareas de almacenamiento, envío de correos, reportes de facturas y reporte a la DIAN se delegan a las clases `GestorFacturas`, `RemitenteCorreoFactura`, `GestorReportesFacturas` y `RemitenteFacturaDian`, respectivamente.

### Beneficios de la Refactorización

- **Mantenibilidad**: Al separar las responsabilidades en diferentes clases, el código es más fácil de entender y mantener.
- **Reusabilidad**: Las nuevas clases son más modulares y pueden ser reutilizadas en otros contextos del sistema.
- **Facilidad para pruebas**: Las clases más pequeñas permiten pruebas unitarias más precisas.

## Ejecución del Proyecto

Para ejecutar el código refactorizado, ejecuta la clase Main `SRP2`. En esta clase se demuestra la funcionalidad de las nuevas clases en conjunto.

## Conclusión

La refactorización aplicada cumple con el principio de responsabilidad única (SRP), mejorando la calidad del código al hacerlo más mantenible, flexible y fácil de probar. Cada clase ahora tiene una única responsabilidad, lo que reduce la complejidad y facilita futuras modificaciones.
