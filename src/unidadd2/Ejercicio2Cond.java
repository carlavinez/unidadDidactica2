package unidadd2;

import java.util.Scanner;

public class Ejercicio2Cond {

    public static void main(String[] args) {
       int nota;
       
       Scanner in = new Scanner(System.in);
       System.out.print("Introduzca su nota (entre 0 y 10): ");
       nota = in.nextInt();
       
       if ( nota >= 0 && nota <= 10){
           System.out.println("La nota es correcta");
           if (nota >= 5){
               System.out.println("Ha aprobado");
           } else {
               System.out.println("Ha suspendido");
           }
       } else {
           System.out.println("La nota es incorrecta");
       }
    }

}