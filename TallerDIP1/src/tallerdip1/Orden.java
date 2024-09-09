/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip1;

import java.util.Date;

/**
 *
 * @author santi
 */
public class Orden {
    private String numeroOrden;
    private Date fecha = new Date();
    private String origen;
    private String destino;

    public Orden(String numeroOrden, String origen, String destino) {
        this.numeroOrden = numeroOrden;
        this.origen = origen;
        this.destino = destino;
    }

    

    /**
     * @return the numeroOrden
     */
    public String getNumeroOrden() {
        return numeroOrden;
    }

    /**
     * @param numeroOrden the numeroOrden to set
     */
    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    
    
}
