package unidadd2;
import java.util.Scanner;
public class Ejercicio11Cond {

    public static void main(String[] args) {
       int year;
       Scanner in = new Scanner(System.in);
       year = in.nextInt();
       
       if (year % 4 == 0 || year % 100 != 0 || year % 400 == 0){
           System.out.printf("%d es un año bisiesto",year);
       } else{
           System.out.printf("%d no es un año bisiesto",year);
       }
    }

}