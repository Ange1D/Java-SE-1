package com.java.jse.basico.e2;

public class Autor {

    //Atributos: Caracteristicas o propiedades del objeto
    private String nombre;
    private String apellido;
    private int edad;

    //Metodos:Acciones, lo que puede hacer el objeto
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
