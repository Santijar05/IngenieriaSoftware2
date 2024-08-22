/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srp2;

import java.util.LinkedList;

/**
 *
 * @author Santiago Jimenez
 */
public class Cliente {
    
    private String nombre;
    private String cedula;
    private String email;
    private String telefono;
    private String direccion;
    private LinkedList<Factura> historial = new LinkedList<>();

    public Cliente() {
    }

    public Cliente(String nombre, String cedula, String email, String telefono, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public void agregarFactura(Factura factura) {
        this.historial.add(factura);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the historial
     */
    public LinkedList<Factura> getHistorial() {
        return historial;
    }

    /**
     * @param historial the historial to set
     */
    public void setHistorial(LinkedList<Factura> historial) {
        this.historial = historial;
    }
    
    
    
}
