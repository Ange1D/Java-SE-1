package com.java.jse.basico.e7;

/**
 * Clase encargada de amnejar la lectura de datos por parte del usuario
 */
import java.util.Scanner;
public class Lector {
    /** ObjetoScaner encargada de realizar la lectura de datos*/
    private Scanner scanner = new Scanner(System.in);

    //PARTES DE UN METODO
    // 1 Modificador de acceso: public, private, protected
    // 2 Tipo de regreso: Cualquier ttipo o clase definido en Java
    // 3 Nombre: Identificador
    // 4 Parametro: Parejas de tipo y nombre
    // 5 Cuerpo del metodo

    // Entrada => Acciones => Salida

    public void muestraMensaje(String mensaje){
        System.out.print(mensaje);
    }

    public String leeEntrada(){
        return scanner.nextLine();
    }
}
