package com.Herencia_Test;

import Interfaces.*;

//because I have a method that is abstract, I have to declare the superclass as abstract too
public abstract class DosDimensiones implements Interfaces{
    private double base;
    private double height;
    private String name;

    int test1 = 1;
    private int test2 = 2;
    protected int test3 = 3;
    public int test4 = 4;

    //Constructor por defecto
    DosDimensiones(){
        base = height = ddfaultvalue;
        name = "ninguno";
    }
    //Parametrizando constructor
    DosDimensiones(double base, double height, String name){
        this.base= base;
        this.height = height;
        this.name = name;
    }
    //Construir objeto con misma base y altura
    DosDimensiones(double x, String name){
        base = height = x;
        this.name = name;
    }
    //Construir un objeto desde un objeto
    DosDimensiones(DosDimensiones dd){
        height = dd.height;
        base= dd.base;
        name = dd.name;
    }
    //you can't override a final method, so the subclasses won't be able to override this
    final void PrivateMethod(){
        System.out.print("Esto es un metodo final");
    }
    //because the vars are private, it's very common and important to define the setters and getter, to be able to access to the vars
    //and modify them from where ever I want, because the methods are public or default in this case
    //Getters
    double getBase() { return base; }
    double getHeight()  {return height; }
    String getName() { return name; }
    //Setters
    void setBase(double b) { base = b; }
    void setHeight(double h) { height = h; }

    DosDimensiones get(){
        return this;
    }

    //because this is an abstract class, I don't need to implement the method printData(), declared in the interface
    //with this and the getters, I can acces to the vars of the object, this will be the dimensions of a rectangulo
    /*public void printData(){
        /*System.out.println("La base y la altura son: "+ this.getBase()+" y "+ this.getHeight() + " El objeto es: " + this.get());
        System.out.println("El objeto es: "+this.getName());
        System.out.println("El área es: "+this.area());
        System.out.println();
    }*/

    abstract double area();
    //with this, you declare that the sub classes will have to/ will be able to implement a method called area
    //but you make it abstact because the superclass doesn't have to/can't implement it, so you just defined
    //abstract makes that the class is not fully completed so you can't create an object of the class
    //you have to use abstract when you know 100% that the sublcases will need it
    //you could also create a method that returns 0 or null and then override it in case you need it
    //but it's not that efficient
}