/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AltaCohesiónBajoAcoplam;

/**
 *
 * @author santi
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    private List<Integer> idProducto = new ArrayList<>();
    private List<String> nombreProducto = new ArrayList<>();
    private List<Double> precioProducto = new ArrayList<>();
    private int idCliente;
    private String nombreCliente;
    private String direccionCliente;
    private List<Integer> listaProductosIdComprados = new ArrayList<>();
    private double descuento;
    private double total;
    private Date fechaFactura;

    public double calcularPrecioConDescuento(double descuento) {
        return getTotal() - (getTotal() * descuento / 100); // Lógica para aplicar descuento
    }

    public void calcularTotal() {
        setTotal(0);
        for (double precio : getPrecioProducto()) {
            setTotal(getTotal() + precio);
        }
    }

    public String generarNumeroFactura() {
        return "FACT-" + getIdCliente() + "-" + new Date().getTime(); 
    }

    public void procesarFactura(Cliente cliente, List<Producto> productos) {
        this.setIdCliente(cliente.getIdCliente());
        this.setNombreCliente(cliente.getNombre());
        this.setDireccionCliente(cliente.getDireccion());
        // Guardar productos comprados
        for (Producto producto : productos) {
            getIdProducto().add(producto.getIdProducto());
            getNombreProducto().add(producto.getNombreProducto());
            getPrecioProducto().add(producto.getPrecioProducto());
        }
        calcularTotal();
        guardarFacturaEnBaseDeDatos();
    }

    private void guardarFacturaEnBaseDeDatos() {
        System.out.println("Factura guardada en la base de datos");
    }

    /**
     * @return the idProducto
     */
    public List<Integer> getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(List<Integer> idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the nombreProducto
     */
    public List<String> getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(List<String> nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the precioProducto
     */
    public List<Double> getPrecioProducto() {
        return precioProducto;
    }

    /**
     * @param precioProducto the precioProducto to set
     */
    public void setPrecioProducto(List<Double> precioProducto) {
        this.precioProducto = precioProducto;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the direccionCliente
     */
    public String getDireccionCliente() {
        return direccionCliente;
    }

    /**
     * @param direccionCliente the direccionCliente to set
     */
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    /**
     * @return the listaProductosIdComprados
     */
    public List<Integer> getListaProductosIdComprados() {
        return listaProductosIdComprados;
    }

    /**
     * @param listaProductosIdComprados the listaProductosIdComprados to set
     */
    public void setListaProductosIdComprados(List<Integer> listaProductosIdComprados) {
        this.listaProductosIdComprados = listaProductosIdComprados;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the fechaFactura
     */
    public Date getFechaFactura() {
        return fechaFactura;
    }

    /**
     * @param fechaFactura the fechaFactura to set
     */
    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }
}

