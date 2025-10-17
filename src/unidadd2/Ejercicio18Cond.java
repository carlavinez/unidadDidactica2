package unidadd2;
import java.util.Scanner;

public class Ejercicio18Cond {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double x;
       double n;
       double resultado;
       System.out.println("Introduzca el valor de x: ");
       x = in.nextDouble();
       System.out.println("Introduzca el valor de n: ");
       n = in.nextDouble();
       
       if ( x >= 0){
           if(n < 0){
               System.out.println("Error por division por cero");
           }else{
               resultado = x + (Math.pow(x,2) / n) - (Math.pow(x,n + 2) / n + 2);
               System.out.println(resultado);
           }
       } else {
           if (n <= 0){
               System.out.println("Error por division por cero");
           }else{
               resultado = (Math.pow(x,n + 1) / n + 1) - (Math.pow(x,n - 1) / n - 1);
               System.out.println(resultado);
           }
       }
    }

}