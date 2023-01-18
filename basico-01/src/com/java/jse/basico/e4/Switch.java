package com.java.jse.basico.e4;

public class Switch {
    public static void main(String[] args) {

        //Estructura de decision:
        //Estructura que permite alterar el flujo de ejecucion de acuerdo a una condicion
        //Una condicion es un valor booleano (Verdadero o falso)

        //if decision simple
        //if-else decision doble
        //if-else-if, switch decision multiple

        //Switch nos usa condiciones explicitas, usa valores

        /*
        if(calificacion == 10){
            mensaje = "¡Excelente!";
        } else if (calificacion == 9 || calificacion == 8){
            mensaje = "¡Muy bien!";
        } else if(calificacion == 7){
            mensaje = "Bien hecho";
        } else if (calificacion == 6){
            mensaje = "Pasaste";
        } else {
            mensaje = "Mejor vuelve a intentarlo";
        }
        */

        //Primer switch, calificaciones

        /*
        String mensaje;
        byte calificacion = 5;
        switch(calificacion) {
            case 10:
                mensaje = "¡Excelente!";
                break;
            case 9:
            case 8:
                mensaje = "¡Muy bien!";
                break;
            case 7:
                mensaje = "Bien hecho";
                break;
            case 6:
                mensaje = "Pasaste";
                break;
            default :
                mensaje = "Mejor vuelve a intentarlo";
        }
        System.out.println("Tu calificación es " + calificacion + ". " + mensaje);
*/


        /*

        String mesActual = "enero";

        if(mesActual == "enero"){
            System.out.print("febrero,");
            mesActual = "febrero";
        }
        if(mesActual == "febrero"){
            System.out.print(" marzo,");
            mesActual = "marzo";
        }
        if(mesActual == "marzo"){
            System.out.print(" abril,");
            mesActual = "abril";
        }
        if(mesActual == "abril"){
            System.out.print(" mayo,");
            mesActual = "mayo";
        }
        if(mesActual == "mayo"){
            System.out.print(" junio,");
            mesActual = "junio";
        }
        if(mesActual == "junio"){
            System.out.print(" julio,");
            mesActual = "julio";
        }
        if(mesActual == "julio"){
            System.out.print(" agosto,");
            mesActual = "agosto";
        }
        if(mesActual == "agosto"){
            System.out.print(" septiembre,");
            mesActual = "septiembre";
        }
        if(mesActual == "septiembre"){
            System.out.print(" octubre,");
            mesActual = "octubre";
        }
        if(mesActual == "octubre"){
            System.out.print(" noviembre,");
            mesActual = "noviembre";
        }
        if(mesActual == "noviembre"){
            System.out.print(" diciembre.");
        }

        */

        //Segundo switch, meses para terminar el año
        String mesActual = "enero";

        switch (mesActual){
            case "enero":
                System.out.print("febrero,");
            case "febrero":
                System.out.print(" marzo,");
            case "marzo":
                System.out.print(" abril,");
            case "abril":
                System.out.print(" mayo,");
            case "mayo":
                System.out.print(" junio,");
            case "junio":
                System.out.print(" julio,");
            case "julio":
                System.out.print(" agosto,");
            case "agosto":
                System.out.print(" septiembre,");
            case "septiembre":
                System.out.print(" octubre,");
            case "octubre":
                System.out.print(" noviembre,");
            case "noviembre":
                System.out.print(" diciembre.");
        }


    }
}
