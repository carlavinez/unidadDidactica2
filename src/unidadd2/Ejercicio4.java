package unidadd2;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
       int x; //filas
       int y; //columnas
       
       Scanner in = new Scanner(System.in);
       System.out.println("Escriba la coordenada X:  ");
       x = in.nextInt();
       
       System.out.println("Escriba la coordenada Y:  ");
       y = in.nextInt();
       
       if ((x >= 1 && x <= 5) && (x >= 1 && y <= 5)){
           System.out.println("El elemento esta dentro de la matriz");
       } else {
           System.out.println("El elemento no esta dentro de la matriz");
       }
    }

}