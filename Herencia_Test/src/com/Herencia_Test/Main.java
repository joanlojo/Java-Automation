package com.Herencia_Test;

public class Main {

    public static void main(String[] args) {

        DosDimensiones formas[]=new DosDimensiones[4];
        formas[0]=new Triangulo("Estilo 1",8.0,12.0);
        formas[1]=new Rectangulo(10);
        formas[2]=new Rectangulo(10,4);
        formas[3]= new Triangulo(7.0);
        //formas[x] = new DosDimensiones(); this won't work because DosDimensiones is an abstract class so you can't initialize an object



        for (int i=0; i<formas.length;i++){
            System.out.println("El objeto es: "+formas[i].getName());
            formas[i].printData();
            System.out.println("El área es: "+formas[i].area());
            System.out.println();
        }


    }
}
