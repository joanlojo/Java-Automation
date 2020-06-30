package com.Herencia_Test;

public class Actividad extends Dia {
    String activity;

    Actividad(String name, int hora, String nameC, float Kc, int unit, int price, String activity){
        //when you have a class that is a sub class from another sub class, so there is multy inheritance
        //you have to call the constructor of the last sub class, the constructor of the class that extends this class
        //that constructor will contruct an object of the class and call the super constructor of his parent class, in this case "Comida"
        super(name, hora, nameC, Kc, unit, price);
        this.activity = activity;
    }
}
