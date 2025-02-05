package com.pablo;

import org.junit.jupiter.api.Test;

public class TestMatematica {
    @Test
    public void Comprobarfibonacci(){
        Matematica num = new Matematica();
        num.fibonacciIterative(0);
        num.fibonacciIterative(3);
    }


    
}
