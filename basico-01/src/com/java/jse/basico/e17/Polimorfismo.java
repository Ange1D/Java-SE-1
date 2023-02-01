package com.java.jse.basico.e17;

import java.time.LocalDate;
import java.time.Month;

public class Polimorfismo {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor ("Juan", "Hernández García", "Prof 22-387-11");
        Profesor profesor2 = new ProfesorInterino("Maria", "Morales Pérez", "Temp 2020", LocalDate.of(2020, Month.OCTOBER, 14));

        profesor1.mostrarDatos();
        System.out.println();
        profesor2.mostrarDatos();
    }
}
