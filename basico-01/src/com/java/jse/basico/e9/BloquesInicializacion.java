package com.java.jse.basico.e9;

public class BloquesInicializacion {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();

        System.out.println("sesión: " + alumno.getSesion());
        System.out.println("curso: " + alumno.getCurso());
        System.out.println("objetivo " + alumno.getObjetivo());
    }
}
