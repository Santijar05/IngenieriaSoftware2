/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Pregunta1;

/**
 *
 * @author santi
 */
public class OrdenEstado {
    public String obtenerEstado(int ordenId){
        int estado = Integer.compare(ordenId, 0);
        if(estado == 0){
            return "Pendiente";
        }else if(estado < 0){
            return "Invalido";
        }else{
            if(ordenId > 100){
                return "Completada";
            }else if (ordenId > 50){
                return "En progreso";
            }
        }
        return "Orden robada";
    }
}
