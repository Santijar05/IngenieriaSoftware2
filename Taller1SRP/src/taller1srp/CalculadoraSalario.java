/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1srp;

/**
 * Esta clase define objetos que se encargan de calcular un salario a partir de una cantidad de horas trabajadas.
 * @author Santiago Jimenez
 */
public class CalculadoraSalario {

    /**
     * Constructor de la Calculadora de salarios.
     */
    public CalculadoraSalario() {
    }
    
    /**
     * Metodo que retorna en un entero el salario en dólares segun unas horas trabajadas.
     * @param horas Horas trabajadas.
     * @return
     */
    public int CalcularSalario(int horas){
        // Lógica del cálculo del salario del usuario
        int salario;
        salario = horas * 15;
        System.out.println("Salario del Usuario: "+salario);
        return salario;
        
    }
}
