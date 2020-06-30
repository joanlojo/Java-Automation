package com.Herencia_Test;

public class Comida{
    String name;
    private float kiloCal;
    private int units;
    int price;

    //constructors
    Comida(){
        name = "Por defecto";
    }
    Comida(String name, float kiloCal, int units, int price){
        this.name = name;
        this.kiloCal = kiloCal;
        this.units = units;
        this.price = price;
    }

    float getCal(){
        return (units *  kiloCal);
    }
    //Overriding, create a class with the same name and parameters(same firm) in the parent class and child classes
    void getName(){
        System.out.println("padre" + this.name);
    }

}
