package unidadd2;
import java.util.Scanner;

public class Ejercicio14Cond {

    public static void main(String[] args) {
       int numSerie;
       System.out.println("Introduzca el numero de serie");
       Scanner in = new Scanner(System.in);
       numSerie = in.nextInt();
       
       if (numSerie >= 14681 && numSerie <= 15681)
           System.out.println("El repuesto es defectuoso");
       else if (numSerie >= 70001 && numSerie <= 79999)
           System.out.println("El repuesto es defectuoso");
       else if (numSerie >= 88888 && numSerie <= 111111)
           System.out.println("El repuesto es defectuoso");
       else
            System.out.println("El repuesto no es defectuoso");
    }

}