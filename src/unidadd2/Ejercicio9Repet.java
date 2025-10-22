package unidadd2;
import java.util.Scanner;
public class Ejercicio9Repet {

    public static void main(String[] args) {
       //apartado a)
       Scanner in = new Scanner(System.in);
       byte n;
       double factorial = 1; //lo inicializo en 1 pq si pongo un 0 me da 0 todo el rato
       
       System.out.println("Numero: ");
       n = in.nextByte();
       
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        
        factorial = 1;
        for (int i = n; i < i; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }
}