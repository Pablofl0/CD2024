package pablo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test para la clase Persona.
 */
public class TestPersona {
    private static final int QUINCE = 15;
    private static final int DIECISEIS = 16;
    private Persona alejandro = new Persona("Alejandro", 15);

    @Test
    public void testContructor() {
        assertEquals("Alejandro", alejandro.getNombre());
        assertEquals(QUINCE, alejandro.getEdad());
    }

    @Test
    public void testSetters() {
        alejandro.setNombre("Ale");
        alejandro.setEdad(DIECISEIS);
        assertEquals("Ale", alejandro.getNombre());
        assertEquals(DIECISEIS, alejandro.getEdad());
        alejandro.imprimirDetalles();
    }
}
