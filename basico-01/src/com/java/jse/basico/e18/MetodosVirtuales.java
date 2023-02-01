package com.java.jse.basico.e18;

public class MetodosVirtuales {
    public static void main(String[] args) {
        Figura figura = null;

        figura = new Triangulo();
        llamaCalculaArea(figura);

        figura = new Cuadrado();
        llamaCalculaArea(figura);

        figura = new Rectangulo();
        llamaCalculaArea(figura);
    }

    static void llamaCalculaArea(Figura figura) {
        figura.formulaCalculaArea();
    }
}
