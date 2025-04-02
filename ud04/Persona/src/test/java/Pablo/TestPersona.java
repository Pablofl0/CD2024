package Pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPersona {
    Persona alejandro = new Persona("Alejandro", 15);

    @Test
    public void testContructor(){
        assertEquals("Alejandro", alejandro.getNombre());
        assertEquals(15, alejandro.getEdad());
    }

    @Test 
    public void testSetters(){
        alejandro.setNombre("Ale");
        alejandro.setEdad(16);
        assertEquals("Ale", alejandro.getNombre());
        assertEquals(16, alejandro.getEdad());
        alejandro.imprimirDetalles();
    }


}
