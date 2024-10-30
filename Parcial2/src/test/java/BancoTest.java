/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.parcial2.Pregunta5.Banco;
import com.mycompany.parcial2.Pregunta5.Cuenta;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


/**
 *
 * @author santi
 */
public class BancoTest {
    
    @BeforeAll
    public void iniciar(){
        System.out.println("Iniciando pruebas");
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(new Cuenta("pepe", "123", 25000));
        cuentas.add(new Cuenta("pepo", "1234", 15000));
        cuentas.add(new Cuenta("pepi", "12345", 20000));
        Banco banco = new Banco(cuentas);
    }
    
    @Test
    public void existeCuentatest(){
        
    }
    
}
