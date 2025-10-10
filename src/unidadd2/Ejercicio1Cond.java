package unidadd2;

import java.util.Scanner;

public class Ejercicio1Cond {

    public static void main(String[] args) {
       int nota;
       
       Scanner in = new Scanner(System.in);
       System.out.print("Introduzca su nota (entre 0 y 10): ");
       nota = in.nextInt();
       
       if ( nota >= 0 && nota <= 10){
           System.out.println("La nota es correcta");
       } else {
           System.out.println("La nota es incorrecta");
       }
    }

}