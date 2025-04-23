package pablo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test para la clase Estudiante.
 */
public class TestEstudiante {
    private static final int CINCO = 5;
    private static final int NUEVE = 9;
    private static final int CATORCE = 14;
    private static final int QUINCE = 15;
    private static final int DIECINUEVE = 19;
    private Estudiante alejandro = new Estudiante("Alejandro", 14);

    @Test
    public void testContructor() {
        assertEquals("Alejandro", alejandro.getNombre());
        assertEquals(CATORCE, alejandro.getEdad());
        assertEquals(0, alejandro.getCalificacion());
    }

    @Test
    public void testSetters() {
        alejandro.setNombre("Ale");
        alejandro.setEdad(QUINCE);
        alejandro.setCalificacion(NUEVE);
        assertEquals("Ale", alejandro.getNombre());
        assertEquals(QUINCE, alejandro.getEdad());
        assertEquals(NUEVE, alejandro.getCalificacion());
    }

    @Test
    public void testMetodos() {
        assertEquals(false, alejandro.aprobo());
        assertEquals(false, alejandro.esUniversitario());
        assertEquals(1, alejandro.edadEscolar());
        alejandro.setEdad(DIECINUEVE);
        alejandro.setCalificacion(CINCO);
        assertEquals(true, alejandro.aprobo());
        assertEquals(true, alejandro.esUniversitario());
        alejandro.imprimirInformacion();
    }

}
