package com.java.jse.basico.e2;

public class OrientacionObjetos {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNombre("A");
        autor.setApellido("B");
        autor.setEdad(50);

        Libro libro = new Libro();
        libro.setAutor(autor);
        libro.setTitulo("C");
        libro.setNumeroPaginas(365);

        System.out.println("Libro: " + libro.getTitulo() );
        System.out.println("Autor: " + libro.getAutor().getNombre() + " " + libro.getAutor().getApellido());

    }
}
