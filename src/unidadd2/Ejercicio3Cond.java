package unidadd2;
import java.util.Scanner;
public class Ejercicio3Cond {

    public static void main(String[] args) {
       int numero;
       System.out.println("Introduzca un numero: ");
       Scanner in = new Scanner(System.in);
       numero = in.nextInt();
       
       if(numero != 0){
           if(numero % 2 == 0){
               System.out.println("El numero es par");
           } else{
               System.out.println("El numero es impar");
           }
       }else{
           System.out.println("El numero no es valido");
       }
    }

}