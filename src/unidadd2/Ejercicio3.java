package unidadd2;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int valor;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba un valor para decidir turno: ");
        valor = in.nextInt();
        
        boolean turnoA = valor % 2 == 0;
        boolean turnoB = valor % 2 != 0;
        
        if (turnoA){
            System.out.println("El valor es par, le toca al jugador A");
        } else {
            System.out.println("El valor es impar, le toca al jugador B");
        }
        
        if(turnoA){
            turnoA = false;
            turnoB = true;
        } else {
            turnoB = false;
            turnoA = true;
        }
    }

}