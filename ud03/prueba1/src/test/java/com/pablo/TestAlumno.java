package com.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestAlumno {
    

    @Test
    public void comprobarconstructorvacio(){
        Alumno mengano = new Alumno();

        boolean resultado1 = mengano.getApellido1() == null;
        boolean resultado2 = mengano.getApellido2() == null;
        boolean resultado3 = mengano.getNombre() == null;
        boolean resultado4 = mengano.getCorreo() == null;
        boolean resultado5 = mengano.getDni() == null;
        boolean resultado6 = mengano.getFecNacimiento() == null;
        boolean resultado7 = mengano.getMovil() == null;
        boolean resultado8 = mengano.getCodigoXade() == null;
        boolean resultado9 = mengano.isAutorizaTutores() == false;

        assertTrue(resultado1);
        assertTrue(resultado2);
        assertTrue(resultado3);
        assertTrue(resultado4);
        assertTrue(resultado5);
        assertTrue(resultado6);
        assertTrue(resultado7);
        assertTrue(resultado8);
        assertTrue(resultado9);
    } 
    
    @Test
    public void comprobarConstructor(){
        LocalDate fecNacimiento = LocalDate.of(2012, 12, 12);
        Alumno pepito = new Alumno("22342342", "Pepe", "Bustelo", "Socastro", "abustelosocastro", 236423642,fecNacimiento,"3434",true);


        assertEquals("Pepe", pepito.getNombre());
        assertEquals("22342342",pepito.getDni());
        assertEquals("Bustelo", pepito.getApellido1());
        assertEquals("Socastro", pepito.getApellido2());
        assertEquals("abustelosocastro", pepito.getCorreo());
        assertEquals(236423642, pepito.getMovil());
        assertEquals(fecNacimiento, pepito.getFecNacimiento());
        assertEquals("3434", pepito.getCodigoXade());
        assertEquals(true, pepito.isAutorizaTutores());
    }

    @Test
    public void COmprobartoString(){
        LocalDate fecNacimiento = LocalDate.of(1990, 5, 15);
        Alumno pepito = new Alumno("22342342", "Pepe", "Bustelo", "Socastro", "abustelosocastro", 236423642,fecNacimiento,"3434",true);
        pepito.toString();
    }

    @Test
    public void ComprobarSetters(){
        Alumno pepito = new Alumno();


        LocalDate fecNacimiento = LocalDate.of(1990, 5, 15);
        pepito.setDni("22342342");
        pepito.setNombre("Pepe");
        pepito.setApellido1("Bustelo");
        pepito.setApellido2("Socastro");
        pepito.setCorreo("abustelosocastro");
        pepito.setMovil(236423642);
        pepito.setFecNacimiento(fecNacimiento);
        pepito.setCodigoXade("3434");
        pepito.setAutorizaTutores(true);

        assertEquals("Pepe", pepito.getNombre());
        assertEquals("22342342",pepito.getDni());
        assertEquals("Bustelo", pepito.getApellido1());
        assertEquals("Socastro", pepito.getApellido2());
        assertEquals("abustelosocastro", pepito.getCorreo());
        assertEquals(236423642, pepito.getMovil());
        assertEquals(fecNacimiento, pepito.getFecNacimiento());
        assertEquals("3434", pepito.getCodigoXade());
        assertEquals(true, pepito.isAutorizaTutores());
    }
}
