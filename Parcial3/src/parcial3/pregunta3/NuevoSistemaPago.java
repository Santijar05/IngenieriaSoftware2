    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial3.pregunta3;

/**
 *
 * @author santi
 */
public class NuevoSistemaPago {
    private String nombre;
    private String identificacion;
    private String correo;

    public NuevoSistemaPago(String nombre, String identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }
    
    
    public void crearSesion(){
        System.out.println("CREANDO LA SESION A: " + this.nombre);
    }

    public void validarCorreo(){
        System.out.println("VALIDANDO EL CORREO: "+ this.correo);
    }
    
    public void validarAutorizacion(){
        System.out.println("VALIDANDO AUTORIZACION");
    }

    public void realizarPago(){
        System.out.println("REALIZANDO EL PAGO");
    }

}
