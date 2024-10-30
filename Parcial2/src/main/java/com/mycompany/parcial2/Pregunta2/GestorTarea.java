/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Pregunta2;

/**
 *
 * @author santi
 */
public class GestorTarea {
    public void insertarTarea(Tarea tarea){
        System.out.println("Insertando tarea: "+ tarea.getDescripción());
    }
    public void leerTarea(Tarea tarea){
        System.out.println("Obteniendo tarea: "+ tarea.getDescripción());
    }
}
