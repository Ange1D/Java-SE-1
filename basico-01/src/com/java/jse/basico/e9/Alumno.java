package com.java.jse.basico.e9;

public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;


    {
        curso = "Java Standard edition";
        sesion = 4;
        objetivo = "Dominar Java";
    }

    {
        curso = "Java Standard edition 2023";
    }


    public String getCurso() {
        return curso;
    }

    public byte getSesion() {
        return sesion;
    }

    public String getObjetivo() {
        return objetivo;
    }
}
