package com.Herencia_Test;

//extends is the key word for the inheritance
public class Dia extends Comida{
    String name;
    int hora;

    //constructors of the class
    Dia(){
        //llamas al constructor de la clase actual
        this("Test", 4, "tast", 4.f, 3, 5);
    }
    Dia(String name, int hora, String nameC, float Kc, int unit, int price){
        //contrusctor de la clase padre
        super(nameC, Kc, unit, price);

        this.name = name;
        this.hora = hora;
    }

    //method to test different usses of this
    Dia get(){
        this.printData(); //llamas a un metodo de la propia clase
        return this; //devolver la instancia de la clase actual

    }

    void printData(){
        System.out.print("Dia: " + name + " a la hora: " + hora + "\n");
        System.out.print("He comido un total de " + getCal() + " Kilo Calorias" + "\n");   //utilizo super para acceder a un metodo de la clase padre
        return; // fuerzas para que salga del metodo aunq en los metodos void no suele ser necesario ni aconsejable
    }

    //Overriding, create a class with the same name and parameters(same firm) in the parent class and child classes
    void getName(){
        System.out.println("Hijo" + this.name);
        //with super you can access to any data(var or method) from the superclass, this is usefull when two vars has the same name
        //System.out.println("Padre" + super.name);
    }
}
