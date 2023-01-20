package com.java.jse.basico.e6;

import java.io.Console;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        //Lectura usando Scanner
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
        */

        //Lectura usando Console

        Console console = System.console();

        if (console == null) {
            System.err.println("No hay consola.");
            System.exit(1);
        }

        String nombre = console.readLine("%s", "Escribe tu nombre: ");

        System.out.println("Hola " + nombre);


        //RETO
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe la palabra que se analizará: ");

        String palabra = scanner.nextLine();

        int conteoVocales = 0;

        for (char caracter : palabra.toLowerCase().toCharArray()) {

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                conteoVocales++;
            }
        }

        System.out.println(palabra + ": " + conteoVocales);
    }
}
