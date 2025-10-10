package unidadd2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       System.out.println("escriba el valor de a: ");
       int a;
       a = in.nextInt();
       
       System.out.println("escriba el valor de b: ");
       int b;
       b = in.nextInt();
       
       if ( a % b == 0){
           System.out.println("El numero a es divisible por el numero b");
       } else {
           System.out.println("El numero a no es divisible por el numero b");
       }
    }

}