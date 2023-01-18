package com.java.jse.basico;

public class For {

    //Estructuras de repeticion: Repiten bloques de codigo
    //while, do-while, for, for-each

    //1. Variable de control: la que controla el flujo de ejecucion
    //2. Condicion
    //3. Bloque de instrucciones
    //4. Acualizacion: cambia la variable de control
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("El valor de i es " + i);
        }

        short[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < valores.length; i++) {
            System.out.println("El valor actual del arreglo es " + valores[i]);
        }

        for (int i = 1; i < valores.length; i += 2) {
            System.out.println("El valor actual del arreglo es " + valores[i]);
        }

        // for-each
        for (short valor : valores) {
            System.out.println("El valor actual del arreglo es " + valor);
        }


        short i = 0;

        while (++i <= 10) {
            System.out.println("El valor de i es " + i);
        }

        //do-while Garantiza que se ejecuta al menos una vez
        i = 1;

        do {
            System.out.println("El valor de i es " + i);
        } while (i++ < 10);
    }
}
