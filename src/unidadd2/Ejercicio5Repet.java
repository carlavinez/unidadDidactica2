package unidadd2;
import java.util.Scanner;
public class Ejercicio5Repet {

    public static void main(String[] args) {
       int repeticiones;
       double resultado = 1;
       Scanner in = new Scanner(System.in);
       System.out.println("Ingrese el numero de repeticiones que desea realizar: ");
       repeticiones = in.nextInt();
       
        for (double i = 1; i <= repeticiones; i++) { //tengo que hacer que la i o el 1 sean double
            resultado =+ 1 / i;
        }
        System.out.println(resultado);
    }
}