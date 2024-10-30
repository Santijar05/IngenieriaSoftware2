/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.Pregunta5;

import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Banco {
    private ArrayList<Cuenta> cuentas;

    public Banco(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public void depositar(String numeroCuenta, double cantidad){
        if(cantidad == 0){
            throw new IllegalArgumentException("La cantida ingresada debe ser mayor que cero");
        }
        for(Cuenta cuenta: cuentas){
            if(cuenta.getNumeroCuenta().equals(numeroCuenta)){
                double saldo = cuenta.getSaldo() + cantidad;
                cuenta.setSaldo(saldo);
                return;
            }
        }
        throw new IllegalArgumentException("No existe el numero de cuenta");
    }
    public void retirar(String numerocuenta, double cantidad){
        if(cantidad == 0){
            throw new IllegalArgumentException("La cantida ingresada debe ser mayor que cero");
        }
        for(Cuenta cuenta: cuentas){
            if(cuenta.getNumeroCuenta().equals(numerocuenta)){
                if(cantidad > cuenta.getSaldo()){
                    throw new IllegalArgumentException("Fondos insuficientes");
                }
                double saldo = cuenta.getSaldo() - cantidad;
                cuenta.setSaldo(saldo);
                return;
            }
        }
        throw new IllegalArgumentException("No existe el numero de cuenta");
    }
    public boolean existeCuenta(String titular){
        for (Cuenta cuenta : cuentas) {
            if(cuenta.getTitular().equals(titular)){
                return true;
            }
        }
        return false;
    }
}
