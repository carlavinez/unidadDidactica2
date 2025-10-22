package unidadd2;
import java.util.Scanner;
public class Ejercicio2Repet {

    public static void main(String[] args) {
      double sumaTotal = 0;
      double media;
      Scanner in = new Scanner(System.in);
      
      for (int i = 0; i < 5; i++) {
         System.out.println("Introduce el numero: ");
         sumaTotal =+ in.nextDouble();
        }
      media = sumaTotal / 5;
      System.out.println(media);
    }

}