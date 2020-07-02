package com.Herencia_Test;

public class Rectangulo extends DosDimensiones {
    //Constructor por defecto
    Rectangulo(){
        super();
    }
    //Constructor para Rectangulo
    public Rectangulo(double base, double height){
        //when you have a class that is a sub class from another sub class, so there is multi inheritance
        //you have to call the constructor of the nearest sub class, that constructor will first call the constructor of the super calss
        //and then create an object of the other subclass
        super(base,height,"Rectangulo");
    }
    //Un cuadrado
    public Rectangulo(double x){
        super(x,"Rectangulo");
    }
    //Objeto desde un objeto
    Rectangulo(Rectangulo ob){
        super(ob);
    }
    boolean esCuadrado(){
        if (getHeight() == getBase()) return true;
        return false;
    }
   /*
    @Override //Override the hasCode method from the Object class
    public int hashCode(){
        return 1;
    }*/
    //overriding a method from the super class
    public void printData(){
        //with this and the getters, I can acces to the vars of the object, this will be the dimensions of a rectangulo
        //with super.getBase(), I could acces to the dimensions of the superclass, in this case dos dimensiones

        System.out.println("La base y la altura son: "+ this.getBase()+" y "+ this.getHeight() + " . " + this.get());
        System.out.println("El objeto es: "+ this.getName());
        System.out.println("El área es: "+ this.area());
        System.out.println();
        if (esCuadrado()) {
            System.out.println("Es Cuadrado");
        }else{
            System.out.println("NO es Cuadrado");
        }
    }
    double area(){
        return getBase()* getHeight();
    }
}
