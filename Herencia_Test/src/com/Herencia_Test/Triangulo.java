package com.Herencia_Test;

public class Triangulo extends DosDimensiones{
    private String style;


    //Constructor por defecto
    public Triangulo(){
        super();
        style ="ninguno";
    }
    //constructor with parameters
    public Triangulo(String style, double base, double height){
        //super calls at the constructor of the superclass, this is the first that is executed,
        //that's why it has to be on the first line
        super(base,height,"Triangulo");
        this.style = style ;
    }
    //Constructor con un argumento
    public Triangulo(double x){
        super(x,"Triangulo"); //Llama al constuctor de la superclase
        style ="Estilo 1";
    }

    //Construir un objeto desde un objeto
    Triangulo(Triangulo t){
        super(t); //Pasa el objeto al constructor de DosDimensiones
        style = t.style;
    }
    double area(){
        //because the superclass has the method as abstact, all the sub class must implement the method or declase the sub class also as Abstract
        return getHeight()*getBase()/2;
    }
    //overriding a method from the super class
    //because it's a method implemented from an interface,
    //you have to declare the method or make the class abstract and you have to declare the method public
    public void printData(){
        //with this and the getters, I can acces to the vars of the object, this will be the dimensions of a rectangulo
        mostrarEstilo();
        System.out.println("La base y la altura son: "+ this.getBase()+" y "+ this.getHeight() + " . " + this.get());
        System.out.println("El objeto es: "+ this.getName());
        System.out.println("El área es: "+ this.area());
        System.out.println();
    }
    void mostrarEstilo(){
        System.out.println("El triángulo tiene: "+ style);
    }
}
