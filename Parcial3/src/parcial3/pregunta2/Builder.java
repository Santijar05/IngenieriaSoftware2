/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial3.pregunta2;

/**
 *
 * @author santi
 */
public class Builder {
    String tipoTomate;
    String tipoCarne;
    String tipoQueso;
    String tipoPan;

    public Builder() {
    }

    /**
     * @param tipoTomate the tipoTomate to set
     */
    public void setTipoTomate(String tipoTomate) {
        this.tipoTomate = tipoTomate;
    }

    /**
     * @param tipoCarne the tipoCarne to set
     */
    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    /**
     * @param tipoQueso the tipoQueso to set
     */
    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    /**
     * @param tipoPan the tipoPan to set
     */
    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }
    
    public Hamburguesa build(){
        return new Hamburguesa(this);
    }
}
