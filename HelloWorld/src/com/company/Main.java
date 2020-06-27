package com.company;

import TestPackage.*;
import java.util.Scanner; //library to import the scanner class
import java.util.ArrayList; //library to import the array list

enum Colores{ //example of an enum
    verde, rojo, azul;
}


public class Main {


    public static void main(String[] args) {

        Main auxClass = new Main();
        TestPackageMain testPackageMain = new TestPackageMain();
        Scanner sc = new Scanner(System.in); //create an instance of the class to get the inputs

        Methods method = new Methods(); //method variable to be able to create a method
        //method.GetName(name); //store the name
        //method.ContinueFunc();
        //method.Categoria1();
        //method.Fibonacci();
        //method.Matrix2D(); //overloading of a method, you have to change the parameters, it's the beginning of the polymorfism
        //method.Matrix2D(3,4);
        //System.out.println(method.Recursividad(4));
        //System.out.println(Methods.globalValue);

        //System.out.print("Escribe 5 numeros" + "\n");

        ExternalClass externalClass = new ExternalClass();
        //externalClass.showData(sc);

        System.out.println("Escribe el tamaño del array");
        externalClass.SetArray(sc);

        //System.out.println("Como te llamas?");
        //String name = sc.nextLine(); //get the name from console

        /*CreateProfile.maxAge = 100; //you can access to the static variables and change its value
        ArrayList<String> months = new ArrayList<String>();
        System.out.println(months.size());
        CreateProfile.MatrixDays(months);
        System.out.println(months.size());*/
        //Count(1,6);
    }
}
