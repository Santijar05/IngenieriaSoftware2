

import com.mycompany.taller13.Calculadora;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private static Calculadora calculadora;

    @BeforeAll
    public static void init() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
        assertNotEquals(4, resultado);
        assertTrue(resultado > 0);
        assertFalse(resultado < 0);
    }

    @Test
    public void testRestar() {
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
        assertNotEquals(0, resultado);
        assertTrue(resultado >= 0);
        assertFalse(resultado < -5);
    }

    @RepeatedTest(3)
    public void testMultiplicar() {
        int resultado = calculadora.multiplicar(4, 2);
        assertEquals(8, resultado);
        assertNotEquals(0, resultado);
        assertTrue(resultado > 0);
        assertFalse(resultado < 0);
    }

    // Prueba para el método de división
    @Test
    public void testDividir() {
        double resultado = calculadora.dividir(10, 2);
        assertEquals(5.0, resultado);
        assertNotEquals(3.0, resultado);
        assertTrue(resultado > 0);
        assertFalse(resultado < 0);
    }

    // Prueba para división por cero (debe lanzar una excepción)
    @Test
    public void testDividirPorCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(10, 0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }
}
