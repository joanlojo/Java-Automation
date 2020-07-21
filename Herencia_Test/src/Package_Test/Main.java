package Package_Test;

import com.Herencia_Test.*;

public class Main{
    public static void main(String[] args) {

        DosDimensiones formas[]=new DosDimensiones[4];
        formas[0]=new Triangulo("Estilo 1",8.0,12.0);
        formas[1]=new Rectangulo(10);
        formas[2]=new Rectangulo(10,4);
        formas[3]= new Triangulo(7.0);
        //formas[x] = new DosDimensiones(); this won't work because DosDimensiones is an abstract class so you can't initialize an object

        for (int i=0; i<formas.length;i++){
            //manera para controlar errores, dentro del try se ejecutara el codigo, en el caso de que encuentre algun fallo, saltara al catch
            //puede haber mas de 1 catch y de esta manera puedes controlar los posibles errores
            try{
                formas[i+1].printData();

            }catch (ArrayIndexOutOfBoundsException test){
                test.printStackTrace();
            }
            catch (Throwable exec){ //throwable detecta todas las excepciones salvo las que has especificado arriba
                System.out.print("Algo ha pasado");
            }
            finally {
                System.out.print("Saliendo del try");

            }
        }
    }
}
