/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial3.pregunta2;

/**
 *
 * @author santi
 */
public class Hamburguesa {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;

    public Hamburguesa(Builder builder) {
        this.tipoTomate = builder.tipoTomate;
        this.tipoCarne = builder.tipoCarne;
        this.tipoQueso = builder.tipoQueso;
        this.tipoPan = builder.tipoPan;
    }

    /**
     * @return the tipoTomate
     */
    public String getTipoTomate() {
        return tipoTomate;
    }

    /**
     * @param tipoTomate the tipoTomate to set
     */
    public void setTipoTomate(String tipoTomate) {
        this.tipoTomate = tipoTomate;
    }

    /**
     * @return the tipoCarne
     */
    public String getTipoCarne() {
        return tipoCarne;
    }

    /**
     * @param tipoCarne the tipoCarne to set
     */
    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    /**
     * @return the tipoQueso
     */
    public String getTipoQueso() {
        return tipoQueso;
    }

    /**
     * @param tipoQueso the tipoQueso to set
     */
    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    /**
     * @return the tipoPan
     */
    public String getTipoPan() {
        return tipoPan;
    }

    /**
     * @param tipoPan the tipoPan to set
     */
    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }
    
    public void tostring(){
        System.out.println("Carne: "+this.tipoCarne+" Queso: "+this.tipoQueso+" Pan: "+this.tipoPan+" Tomate: "+this.tipoTomate);
    }
    
}
    