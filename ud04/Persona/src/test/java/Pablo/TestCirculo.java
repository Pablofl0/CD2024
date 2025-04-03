package Pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCirculo {
    Circulo circulo = new Circulo(1, 1, 2);

    @Test
    public void testContructor(){
        assertEquals(1, circulo.obtenerX());
        assertEquals(1, circulo.obtenerY());
        assertEquals(2, circulo.obtenerRadio());
    }

    @Test
    public void testSetters(){
        circulo.establecerX(2);
        circulo.establecerY(2); 
        circulo.establecerRadio(3);
        assertEquals(2, circulo.obtenerX());
        assertEquals(2, circulo.obtenerY());
        assertEquals(3, circulo.obtenerRadio());
        circulo.establecerRadio(-1);
        assertEquals(0, circulo.obtenerRadio());
    }

    @Test
    public void testMetodos(){
        assertEquals(4, circulo.obtenerDiametro());
        assertEquals((Math.PI*4), circulo.obtenerCircunferencia());
        assertEquals((Math.PI*2*2), circulo.obtenerArea());
    }

    @Test
    public void testToString(){
        assertEquals("Centro = [1,1]; Radio = 2.0", circulo.toString());
    }
}
