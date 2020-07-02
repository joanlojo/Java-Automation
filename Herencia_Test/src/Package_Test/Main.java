package Package_Test;

import com.Herencia_Test.*;

public class Main{
    int test1 = 1;
    private int test2 = 2;
    protected int test3 = 3;
    public int test4 = 4;

    public static void main(String[] args) {

        DosDimensiones formas[]=new DosDimensiones[4];
        formas[0]=new Triangulo("Estilo 1",8.0,12.0);
        formas[1]=new Rectangulo(10);
        formas[2]=new Rectangulo(10,4);
        formas[3]= new Triangulo(7.0);
        //formas[x] = new DosDimensiones(); this won't work because DosDimensiones is an abstract class so you can't initialize an object

        for (int i=0; i<formas.length;i++){
            formas[i].printData();
        }
    }
}
