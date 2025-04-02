package Pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestEstudiante {
    Estudiante alejandro = new Estudiante("Alejandro", 14);


    @Test
    public void testContructor(){
        assertEquals("Alejandro", alejandro.getNombre());
        assertEquals(14, alejandro.getEdad());
        assertEquals(0, alejandro.getCalificacion());
    }

    @Test
    public void testSetters(){
        alejandro.setNombre("Ale");
        alejandro.setEdad(15);
        alejandro.setCalificacion(9);
        assertEquals("Ale", alejandro.getNombre());
        assertEquals(15, alejandro.getEdad());
        assertEquals(9, alejandro.getCalificacion());
    }

    @Test
    public void testMetodos(){
        assertEquals(false, alejandro.aprobo());
        assertEquals(false, alejandro.esUniversitario());
        assertEquals(1, alejandro.edadEscolar());
        alejandro.setEdad(19);
        alejandro.setCalificacion(5);
        assertEquals(true, alejandro.aprobo());
        assertEquals(true, alejandro.esUniversitario());
        alejandro.imprimirInformacion();
    }

}
