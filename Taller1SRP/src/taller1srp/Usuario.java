/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1srp;

/**
 *
 * @author santi
 */
public class Usuario {
    private String nombre;
    private String email;
    private String contraseña;
    private float salario = 0;

    public Usuario(String nombre, String email, String contraseña, float salario) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.salario = salario;
    }
    
    public void ObtenerInfoUsuario(){
        if(this.nombre != null)
        System.out.println("Nombre:"+this.nombre);
        if(this.email != null)
        System.out.println("Email:"+this.email);
        if(this.salario != 0)
        System.out.println("Salario:"+this.salario);        
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
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
