package unidadd2;
import java.util.Scanner;

public class Ejercicio7Cond {

    public static void main(String[] args) {
       int hora;
       int minutos;
       
       System.out.println("escribe una hora: ");
       Scanner in = new Scanner(System.in);
       hora = in.nextInt();
       
       System.out.println("escribe los minutos: ");
       minutos = in.nextInt();
       
        System.out.printf("%0d:%0d\n",hora,minutos);
    }

}