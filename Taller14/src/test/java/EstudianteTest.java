
import com.mycompany.taller14.Estudiante;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */
public class EstudianteTest {
    private static Estudiante estudiante;

    @BeforeAll
    public static void setup() {
        estudiante = new Estudiante("Santiago", 19);
        System.out.println("Inicio de las pruebas...");
    }

    @AfterAll
    public static void teardown() {
        System.out.println("Fin de las pruebas.");
    }

    @Test
    public void agregarCalificacionTest() {
        estudiante.agregarCalificacion(8.5);
        assertEquals(8.5, estudiante.obtenerPromedio(), "La calificación agregada no es la esperada.");
    }

    @Test
    public void obtenerPromedioTest() {
        estudiante.agregarCalificacion(9.0);
        estudiante.agregarCalificacion(7.0);
        double promedioEsperado = (8.5 + 9.0 + 7.0) / 3;
        System.out.println(estudiante.getNumeroCalificaciones());
        assertEquals(promedioEsperado, estudiante.obtenerPromedio(), 0.001, "El promedio no es el esperado.");
    }

    @Test
    public void getNumeroCalificacionesTest() {
        int numeroEsperado = 3;  
        System.out.println(estudiante.getNumeroCalificaciones());
        assertEquals(numeroEsperado, estudiante.getNumeroCalificaciones(), "El número de calificaciones no es el esperado.");
    }

    @Test
    public void agregarCalificacionExcepcionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estudiante.agregarCalificacion(-1);
        });
        assertEquals("La calificacion debe estar entre 0 y 10.", exception.getMessage());
    }
}
