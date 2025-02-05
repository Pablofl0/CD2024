package com.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestModulo {
     @Test
    public void comprobarConstructor() {
        Modulo pepito = new Modulo("22342342", "Pepe", "lala", 2, 2);

        assertEquals("Pepe", pepito.getNombre());
        assertEquals("22342342", pepito.getCodigo());
        assertEquals("lala", pepito.getDescripcion());
        assertEquals(2, pepito.getHoras());
        assertEquals(2, pepito.getSesiones());

    }

    @Test
    public void COmprobartoString() {
        Modulo pepito = new Modulo("22342342", "Pepe", "lala", 2, 2);
        pepito.toString();
    }

    @Test
    public void ComprobarSetters() {
        Modulo pepito = new Modulo();

        pepito.setCodigo("22342342");
        pepito.setNombre("Pepe");
        pepito.setDescripcion("lala");
        pepito.setHoras(2);
        pepito.setSesiones(2);

        assertEquals("Pepe", pepito.getNombre());
        assertEquals("22342342", pepito.getCodigo());
        assertEquals("lala", pepito.getDescripcion());
        assertEquals(2, pepito.getHoras());
        assertEquals(2, pepito.getSesiones());
        
    }
}
