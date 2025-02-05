package com.pablo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestCentro {
    

    //@Test
    public void comprobarconstructorvacio(){
        Centro mengano = new Centro();

        boolean resultado1 = mengano.getNombre() == null;
        boolean resultado2 = mengano.getLocalidad() == null;
        boolean resultado3 = mengano.getCodigo() == null;
        boolean resultado4 = mengano.getCalle() == null;
        boolean resultado5 = mengano.getNumero() == null;
        boolean resultado6 = mengano.getCodigoPostal() == null;

        assertTrue(resultado1);
        assertTrue(resultado2);
        assertTrue(resultado3);
        assertTrue(resultado4);
        assertTrue(resultado5);
        assertTrue(resultado6);
        
    } 
    
    @Test
    public void comprobarConstructor(){
        Centro pepito = new Centro(22342342, "Pepe", "Bustelo", "Socastro", "17", 236423642);


        assertEquals("Pepe", pepito.getNombre());
        assertEquals(22342342,pepito.getCodigo());
        assertEquals("Bustelo", pepito.getLocalidad());
        assertEquals("Socastro", pepito.getCalle());
        assertEquals("17", pepito.getNumero());
        assertEquals(236423642, pepito.getCodigoPostal());
        
    }

    @Test
    public void COmprobartoString(){
        Centro pepito = new Centro(22342342, "Pepe", "Bustelo", "Socastro", "17", 236423642);
        pepito.toString();
    }

    @Test
    public void ComprobarSetters(){
        Centro pepito = new Centro();

        pepito.setCodigo(22342342);
        pepito.setNombre("Pepe");
        pepito.setLocalidad("Bustelo");
        pepito.setCalle("Socastro");
        pepito.setNumero("17");
        pepito.setCodigoPostal(236423642);


        assertEquals("Pepe", pepito.getNombre());
        assertEquals(22342342,pepito.getCodigo());
        assertEquals("Bustelo", pepito.getLocalidad());
        assertEquals("Socastro", pepito.getCalle());
        assertEquals("17", pepito.getNumero());
        assertEquals(236423642, pepito.getCodigoPostal());
    }
}
