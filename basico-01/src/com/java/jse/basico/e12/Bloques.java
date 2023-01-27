package com.java.jse.basico.e12;

public class Bloques {
    private static final int VALOR;

    static {
        VALOR = 2;
    }

    public static void muestaValor(){
        System.out.println("valor: " + VALOR);
    }
}
