/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerisp2;

/**
 *
 * @author santi
 */
public class PaqueteGrande extends Paquete implements CalculableGrande{
    private double volumen;
    private String medioTransporte;


    public PaqueteGrande(double volumen, String medioTransporte, double peso, String dimensiones) {
        super(peso, dimensiones);
        this.volumen = volumen;
        this.medioTransporte = medioTransporte;
    }

    @Override
    public void calcularCostoEnvioGrande() {
        System.out.println("El costo de envio de un paquete grande es: $78");
    }
}
