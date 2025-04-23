package pablo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test para la clase Circulo.
 */
public class TestCirculo {
    private static final int TRES = 3;
    private static final int CUATRO = 4;
    private Circulo circulo = new Circulo(1, 1, 2);

    @Test
    public void testContructor() {
        assertEquals(1, circulo.obtenerX());
        assertEquals(1, circulo.obtenerY());
        assertEquals(2, circulo.obtenerRadio());
    }

    @Test
    public void testSetters() {
        circulo.establecerX(2);
        circulo.establecerY(2);
        circulo.establecerRadio(TRES);
        assertEquals(2, circulo.obtenerX());
        assertEquals(2, circulo.obtenerY());
        assertEquals(TRES, circulo.obtenerRadio());
        circulo.establecerRadio(-1);
        assertEquals(0, circulo.obtenerRadio());
    }

    @Test
    public void testMetodos() {
        assertEquals(CUATRO, circulo.obtenerDiametro());
        assertEquals(Math.PI * CUATRO, circulo.obtenerCircunferencia());
        assertEquals(Math.PI * 2 * 2, circulo.obtenerArea());
    }

    @Test
    public void testToString() {
        assertEquals("Centro = [1,1]; Radio = 2.0", circulo.toString());
    }
}
