package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods { //to create more clases appart from the main one, the one that has the same name as the file
                    //the other classes can't be public
    String name[] = {"Luis", "Joan", "Julia"} ; // array of strings. in Java you can't create an array of dinamic size
    int[] test = new int [10]; //manera de declarar el tamaño concreto de un array
    private int med = 2;
    private int b = 5;
    final int CONSTANTEVALUE;
    static final int CONSTANTFINALVALUE;
    int min = (med<b)?med:b; //si a<b, el valor de min sera = a, si no se cumple, el valor de min = b

    static int maxAge = 99; //with static variables you can acces to them from anywhere wihtout needing to create an instance of the class
    static final int minAge = 0; //final = const, you can't edit this variable even if it's static. You can access to this var anywhere but you can't never edit it
    ArrayList<String> Names = new ArrayList<String>(); //this is is the closest to an array with dinamic size, it's very similar to a list from C++

    //static block
    //it's something that is executed when the class is loaded for the first time
    static {
        CONSTANTFINALVALUE = 15;
    }
    //bloque para incializar una var final
    {
        CONSTANTEVALUE = 15;
    }

    static int GetDiv(int a){
        //you can't use this or try to access to a non static var on a static method
        return a / 2;
    }

    // func to get the names and store them
    void GetName(String name){
        Names.add(name);//add func with array list
        /*for (int i = 0; i < this.name.length ; ++i){ //typical loop, or you do lenght -1 or you to ++1
            this.name[i] = name;
        }*/
    }

    //for Break example
    void ForBreak (){
        for(int i = 0; i< 10; i++){
            System.out.println(i);
            if (i == 9){
                break;//jumps to the next line
            }
            System.out.println("Bucle acabado");
        }
        //for each
        /*for(String a: Names){ // very useful for arrays or arraylists, it's an "upgraded" for
            System.out.println(a);
        }*/
    }

    //use for loop when you know the range
    //use do while when you need that the code is executed at least 1 time
    //use while when you don't know the range
    void ContinueFunc(){
        for (int i = 0; i < 10; i++){
            if (i%2 == 0) //if the number is even
                continue; //continue to the next line, next {

            System.out.print(i + " ");
        }
    }

    //overloading of a method, you have to change the parameters, it's the beginning of the polymorfism
    //arrays 2D
    void Matrix2D(int a, int b){
        int[][]matrix = new int[a][b];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){ //bucle para acceder al array
                matrix[0][matrix.length-1] = 5;
                matrix[0][0] = 2;
                matrix[matrix.length-1][0] = 5;
                matrix[matrix.length-1][matrix.length-1] = 2;
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        /*for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.println(matrix[i][j]);
            }
        }*/

    }

    //overloading of a method, you have to change the parameters, it's the beginning of the polymorfism
    //arrays 2D
    void Matrix2D(){
        int[][]matrix = new int[2][2]; //declarar e inicializar un array 2D
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){ //bucle para acceder al array
                matrix[0][matrix.length-1] = 5;
                matrix[0][0] = 2;
                matrix[matrix.length-1][0] = 5;
                matrix[matrix.length-1][matrix.length-1] = 2;
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        /*for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.println(matrix[i][j]);
            }
        }*/

    }

    static void MatrixDays(ArrayList<String> months){
        months.add("Test"); //because we use a method of the object arraylist, the object is modified outside this method
        for(int i = 0; i < months.size(); i++){
            int aux = i + 1;
            System.out.println("[" + i + "]" + " " + months.get(i) + " = " + aux);
        }
    }

    void Categoria1(){
        /*for(int i = 0; i <= 10; i++){
            if(i == 10){
                System.out.print(i);
            }else{
                System.out.print(i + ",");
            }
        }*/
        /*int i = 1;
        while (i<10){
            System.out.print(i + ",");
            i++;
        }
        System.out.print(i);*/
       /* int max = 100;
        for(int i = 1; i < max; i++){
            --max;
            if(max == 95){
                System.out.print(i +"," +max);
            }else{
                System.out.print(i +"," +max + ",");
            }
            if(i == 5){
                break;
            }
        }*/
    }

    //Fibonacci test
    void Fibonacci(){
        //0,1,1,2,3,5,8,13
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0; i < 4; i++){
            c = a+b;
            System.out.print(a + "," + b + "," + c + ",");
            a = b+c;
            b = c+a;
        }

    }

    //recursividad
    int Recursividad(int number){
        if (number != 1){
            int aux = 0;
            aux = number * Recursividad(number - 1);
            //System.out.println(aux);
            System.out.println(number);
            return  aux;
        }
        else {
            //System.out.println(number);
            return 1;
        }

    }

    //way to define an undefined size of the arguments
    //one method can only have one variable parameter
    static void FillArray(Scanner sc, int ... v){
        System.out.println("Tamaño " + v.length);
        for(int i = 0; i < v.length; i++){
            v[i] = sc.nextInt();
        }
        /*for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " , ");
        }*/

    }
}
