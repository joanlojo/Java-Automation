package com.company;

import java.util.Scanner;

public class ExternalClass{
    int notAccesible = 4;
    static int accesible = 40;
    private int[] array = new int[5];
    private static int alsoAccesible = 400;
    private int[] dinamicArray;

    //external class to show the results
    void showData(Scanner sc){
        for(int i = 0; i<array.length; i++){
            array[i] = sc.nextInt(); //store the inputs on the array
        }
        //create an instance of the private internal class so you can acces its methods
        InternalClass internalClass = new InternalClass();
        System.out.print("MAX " + internalClass.max());
    }
    void SetArray(Scanner sc){
        int size = sc.nextInt();
        dinamicArray = new int[size]; //inicialize the size of the array dinamically
        Methods.FillArray(sc, dinamicArray);
        //Methods.FillArray(sc, 1,2,3,4,5); //you can pass an array also
        InternalClass internalClass = new InternalClass();
        System.out.print("MAX " + internalClass.maxDinamic());
    }

    //internal class where for example, all the calculations are done
    private class InternalClass{
        //because it's an internal class, you can access to all the methods and vars from the external class, even if they are private
        //without the need of creating an instance of the class
        int max(){
            int auxMax = array[0];
            for (int i=1;i<array.length;i++){
                if(array[i] > auxMax){
                    auxMax = array[i];
                }
            }
            return auxMax;
        }

        int maxDinamic(){
            int auxMax = dinamicArray[0];
            for (int i=1;i<dinamicArray.length;i++){
                if(dinamicArray[i] > auxMax){
                    auxMax = dinamicArray[i];
                }
            }
            return auxMax;
        }
    }

}
