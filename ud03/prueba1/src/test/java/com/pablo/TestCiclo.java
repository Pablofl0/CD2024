package com.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCiclo {
    Nivel nivel = new Nivel("Bustelo");
    Centro pepita = new Centro(22342342, "Pepe", "Bustelo", "Socastro", "17", 236423642);

    @Test
    public void comprobarConstructor() {
        Ciclo pepito = new Ciclo("22342342", "Pepe", nivel, pepita);

        assertEquals("Pepe", pepito.getNombre());
        assertEquals("22342342", pepito.getCodigo());
        assertEquals(nivel, pepito.getNivel());
        assertEquals(pepita, pepito.getCentro());

    }

    @Test
    public void COmprobartoString() {
        Ciclo pepito = new Ciclo("22342342", "Pepe", nivel, pepita);
        pepito.toString();
    }

    @Test
    public void ComprobarSetters() {
        Ciclo pepito = new Ciclo();

        pepito.setCodigo("22342342");
        pepito.setNombre("Pepe");
        pepito.setNivel(nivel);
        pepito.setCentro(pepita);

        assertEquals("Pepe", pepito.getNombre());
        assertEquals("22342342", pepito.getCodigo());
        assertEquals(nivel, pepito.getNivel());
        assertEquals(pepita, pepito.getCentro());
        
    }
}
