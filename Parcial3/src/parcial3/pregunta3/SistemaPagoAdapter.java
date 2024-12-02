/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial3.pregunta3;

/**
 *
 * @author santi
 */
public class SistemaPagoAdapter implements SistemaPago{

    private NuevoSistemaPago sistemapago;

    public SistemaPagoAdapter(NuevoSistemaPago sistemapago) {
        this.sistemapago = sistemapago;
    }
    
    
    @Override
    public void nuevaSesion() {
        sistemapago.crearSesion();
    }

    @Override
    public void validacionCorreo() {
        sistemapago.validarCorreo();
    }

    @Override
    public void validacionAutorizacion() {
        sistemapago.validarAutorizacion();
    }

    @Override
    public void realizacionPago() {
        sistemapago.realizarPago();
    }
    
    @Override
    public void operar(){
        nuevaSesion();
        validacionCorreo();
        validacionAutorizacion();
        realizacionPago();
    }
    
}
