package unidadd2;

import java.util.Scanner;

public class Ejercicio3Repet {

    public static void main(String[] args) {
      int numeros;
      Scanner in = new Scanner(System.in);
      System.out.println("Introduce el numero: ");
      numeros = in.nextInt();
      double sumaTotal = 0;
      double media;
      
      for (int i = 0; i < numeros; i++) {
         System.out.println("Introduce el numero: ");
         sumaTotal =+ in.nextDouble();
        }
      media = sumaTotal / numeros;
      System.out.println(media);
    }

}