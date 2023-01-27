package com.java.jse.basico.e12;

public class Contador {
    private static short contadorClase;
    private short contadorInstancia;

    public Contador() {
        contadorClase++;
        contadorInstancia++;
    }

    public static short getContadorClase() {
        return contadorClase;
    }

    public short getContadorInstancia() {
        return contadorInstancia;
    }
}
