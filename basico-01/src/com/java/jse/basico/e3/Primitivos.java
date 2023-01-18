package com.java.jse.basico.e3;

//S2E1
public class Primitivos {
    public static void main(String[] args) {

        //Declaracion
        //tipo nombre;

        //Inicializacion
        //nombre = valor;

        //Declaracion e inicializacion
        //tipo nombre = valor;

        //Creación de variables y asignación de valores.

        //Enteros
        byte valorByte = 1; // 1 byte = 8 bits desde -127 hasta 127
        short valorShort = 1; // 2 bytes = 16 bits
        int valorInt = 1; // 4 bytes = 32 bits
        long valorLong = 1; // 8 bytes = 64 bits

        //Decimales / Reales / Flotantes
        float valorFloat = 1.5F;// 4 bytes = 32 bits
        double valorDouble = 1.5;// 8 bytes = 64 bits

        boolean valorBoolean = true;
        char valorChar = 'B';

        System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);

        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);

        System.out.println("boolean: " + valorBoolean);
        System.out.println("char: " + valorChar);


        //casteo de valores primitivos
        float numFloat = 1.5f;
        int numInt1 = (int)numFloat;
        System.out.println("numInt1: " + numInt1);

        char numChar = 'M';
        int numInt2 = (int)numChar;
        System.out.println("numInt2: " + numInt2);

        boolean numBool = true;
        //int numInt3 = (int)numBool;//En Java no son compatibles


        //Operaciones aritméticas
        System.out.println("valorInt: " + valorInt);
        valorInt = valorInt + 1;
        System.out.println("valorInt: " + valorInt);
        valorInt++;
        System.out.println("valorInt: " + valorInt);

        valorChar++;
        System.out.println("valorChar: " + valorChar);
        valorChar = (char)(valorChar + valorInt);
        System.out.println("valorChar: " + valorChar);


        //Reto
        byte valorByte2 = Byte.MAX_VALUE;
        System.out.println(valorByte2);

        valorByte2 += 1;
        System.out.println(valorByte2);

        valorByte2 = Byte.MIN_VALUE;
        System.out.println(valorByte2);
        valorByte2 -= 1;
        System.out.println(valorByte2);
    }
}
