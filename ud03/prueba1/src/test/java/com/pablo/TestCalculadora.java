package com.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TestCalculadora {
    private final Calculadora calculadora = new Calculadora();

    @ParameterizedTest
    @CsvSource({
    "1, 2",
    "4, 5",
    "6, 7"
    })
    public void SumarTest(int a, int b){
        assertEquals(calculadora.sumar(a, b), a+b);
    }

    @ParameterizedTest
    @CsvSource({
    "1, 2",
    "4, 5",
    "6, 7"
    })
    public void RestarTest(int a, int b){
        assertEquals(calculadora.restar(a, b), a-b);
    }
    @ParameterizedTest
    @CsvSource({
    "1, 2",
    "4, 5",
    "6, 7"
    })
    public void MultiplicarTest(int a, int b){
        assertEquals(calculadora.multiplicar(a, b), a*b);
    }
    @ParameterizedTest
    @CsvSource({
    "1, 1",
    "4, 1",
    "6, 1"
    })
    public void DivisionTest(int a, int b){
        assertEquals(calculadora.dividir(a, b), a/b);
    }

    @Test
    public void testDivision0(){
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}
