/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1srp;

/**
 * Esta clase define objetos que contienen información básica de un usuario como nombre, email, contraseña un salario y un # de horas trabajadas. 
 * @author Santiago Jimenez 
 */
public class Usuario {
    private String nombre;
    private String email;
    private String contraseña;
    private float salario;
    private int horasTrabaj;

    /**
     * Constructor parametrizado para los usuarios
     * @param nombre Nombre del usuario
     * @param email Correo con el que se va a identificar al usuario 
     * @param contraseña Clave de seguridad del usuario.
     * @param salario Salario del usuario en dólares.
     * @param horasTrabaj Número de horas trabajadas por semana.
     */
    public Usuario(String nombre, String email, String contraseña, float salario, int horasTrabaj) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.salario = salario;
        this.horasTrabaj = horasTrabaj;
    };

    /**
     * Constructor para los usuarios
     */
    public Usuario() {
    };

    /**
     * Obtiene los valores de los atributos del usuario
     */
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

    /**
     * @return the horasTrabaj
     */
    public int getHorasTrabaj() {
        return horasTrabaj;
    }

    /**
     * @param horasTrabaj the horasTrabaj to set
     */
    public void setHorasTrabaj(int horasTrabaj) {
        this.horasTrabaj = horasTrabaj;
    }
    
}
