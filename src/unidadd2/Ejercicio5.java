package unidadd2;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
       int a;
       
       Scanner in = new Scanner(System.in);
       System.out.print("Escriba la opcion del menu: ");
       a = in.nextInt();
       
       if ( a >= 1 && a <= 15){
           System.out.println("El numero es valido");
       } else {
           System.out.println("El numero no es valido");
       }
    }

}