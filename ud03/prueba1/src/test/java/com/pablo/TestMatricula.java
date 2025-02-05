package com.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestMatricula {
    LocalDate fecNacimiento = LocalDate.of(2012, 12, 12);
    Alumno pepita = new Alumno("22342342", "Pepe", "Bustelo", "Socastro", "abustelosocastro", 236423642, fecNacimiento,
            "3434", true);
    Modulo modulott = new Modulo("22342342", "Pepe", "lala", 2, 2);

    @Test
    public void comprobarConstructor() {
        Matricula pepito = new Matricula(pepita, modulott, 2, "tete");

        assertEquals(pepita, pepito.getAlumno());
        assertEquals(modulott, pepito.getModulo());
        assertEquals(2, pepito.getNota());
        assertEquals("tete", pepito.getCurso());

    }

    @Test
    public void COmprobartoString() {
        Matricula pepito = new Matricula(pepita, modulott, 2, "tete");
        pepito.toString();
    }

    @Test
    public void ComprobarSetters() {
        Matricula pepito = new Matricula();

        pepito.setAlumno(pepita);
        pepito.setModulo(modulott);
        pepito.setNota(2);
        pepito.setCurso("tete");

        assertEquals(pepita, pepito.getAlumno());
        assertEquals(modulott, pepito.getModulo());
        assertEquals(2, pepito.getNota());
        assertEquals("tete", pepito.getCurso());

    }
}
