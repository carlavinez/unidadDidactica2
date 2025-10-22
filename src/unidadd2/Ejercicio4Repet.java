package unidadd2;
import java.util.Scanner;
public class Ejercicio4Repet { //asumo que el segundo num es mayor 

    public static void main(String[] args) {
       int num1 = 0;
       int num2 = 0;
       double suma = num1;
       
       Scanner in = new Scanner(System.in);
       System.out.println("introduzca el primer numero");
       num1 = in.nextInt();
       System.out.println("introduzca el segundo numero");
       num2 = in.nextInt();
       
       if(num1 % 2 == 0){ 
            for (int i = num1; i < num2; i+=2)
            suma += i;
       } else {
           num1++;
            for (int i = num1; i < num2; i++)
             suma += i;
       }
        System.out.println(suma);
    }

}