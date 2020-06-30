package com.Herencia_Test;

public class Main {

    public static void main(String[] args) {
       //Main main = new Main(); //creas un objeto del tipo de la clase principal
        //super.getData();
        Dia Lunes = new Dia("Lunes", 20, "Hamburguesas", 345.45f, 3, 6);
        Comida comida = new Comida();
        Comida Jueves = Lunes;
        Jueves.getName();
        Lunes.getName(); //overriding
        comida.getName();
        /*Dia Martes = new Dia();
        Dia Miercoles = Lunes;
        Martes.get().hora = 6; //llama al metodo get, printa y luego devuelve la instancia de la clase donde se modifica el valor de hora
        Miercoles.hora = 15; //al copiar el objeto lunes al miercoles, si modificas el valor de miercoles, tambien se modifica el de lunes
        Lunes.printData();
        Martes.printData();
        Miercoles.printData();*/


    }
}
