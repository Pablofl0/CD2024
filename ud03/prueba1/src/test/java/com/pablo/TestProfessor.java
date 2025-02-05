package com.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestProfessor {
    LocalDate fecNacimiento = LocalDate.of(2012, 12, 12);
    LocalDate fecOpo = LocalDate.of(2012, 12, 12);

    @Test
    public void comprobarConstructor() {
        
        Profesor pepito = new Profesor("22342342", "Pepe", "Bustelo", "Socastro", "abustelosocastro", 236423642,
                fecNacimiento, "3434", "34",true,fecOpo);

        assertEquals("Pepe", pepito.getNombre());
        assertEquals("22342342", pepito.getDni());
        assertEquals("Bustelo", pepito.getApellido1());
        assertEquals("Socastro", pepito.getApellido2());
        assertEquals("abustelosocastro", pepito.getCorreo());
        assertEquals(236423642, pepito.getMovil());
        assertEquals(fecNacimiento, pepito.getFecNacimiento());
        assertEquals("3434", pepito.getEspecialidad());
        assertEquals("34", pepito.getCuerpo());
        assertEquals(true, pepito.getSustituto());
        assertEquals(fecOpo, pepito.getFecOposicion());
    }

    @Test
    public void COmprobartoString() {
        Profesor pepito = new Profesor("22342342", "Pepe", "Bustelo", "Socastro", "abustelosocastro", 236423642,
        fecNacimiento, "3434", "34",true,fecOpo);
        pepito.toString();
    }

    @Test
    public void ComprobarSetters() {
        Profesor pepito = new Profesor();

        LocalDate fecNacimiento = LocalDate.of(1990, 5, 15);
        pepito.setDni("22342342");
        pepito.setNombre("Pepe");
        pepito.setApellido1("Bustelo");
        pepito.setApellido2("Socastro");
        pepito.setCorreo("abustelosocastro");
        pepito.setMovil(236423642);
        pepito.setFecNacimiento(fecNacimiento);
        pepito.setEspecialidad("3434");
        pepito.setSustituto(true);
        pepito.setCuerpo("34");
        pepito.setFecOposicion(fecOpo);

        assertEquals("Pepe", pepito.getNombre());
        assertEquals("22342342", pepito.getDni());
        assertEquals("Bustelo", pepito.getApellido1());
        assertEquals("Socastro", pepito.getApellido2());
        assertEquals("abustelosocastro", pepito.getCorreo());
        assertEquals(236423642, pepito.getMovil());
        assertEquals(fecNacimiento, pepito.getFecNacimiento());
        assertEquals("3434", pepito.getEspecialidad());
        assertEquals("34", pepito.getCuerpo());
        assertEquals(true, pepito.getSustituto());
        assertEquals(fecOpo, pepito.getFecOposicion());
    }
}
