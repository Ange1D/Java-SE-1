package com.java.jse.basico.e8;

public class Combustible {
    private short litrosMaximos;
    private short litrosActuales;

    public void usa(){
        litrosActuales--;
        System.out.println("Quedan " + litrosActuales + " litros.");
    }

    public short getLitrosMaximos() {
        return litrosMaximos;
    }

    public void setLitrosMaximos(short litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }

    public short getLitrosActuales() {
        return litrosActuales;
    }

    public void setLitrosActuales(short litrosActuales) {
        this.litrosActuales = litrosActuales;
    }
}