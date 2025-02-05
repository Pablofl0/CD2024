package com.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class TestNivel {
    @Test
    public void comprobarConstructor(){
        Nivel pepito = new Nivel("Pepe");

        assertEquals("Pepe", pepito.getNivel());
        
    }

    @Test
    public void ComprobartoString(){
        Nivel pepito = new Nivel("Pepe");
        pepito.toString();
    }

    @Test
    public void ComprobarSetters(){
        Nivel pepito = new Nivel();

        pepito.setNivel("Pepe");

        assertEquals("Pepe", pepito.getNivel());
    }
}
