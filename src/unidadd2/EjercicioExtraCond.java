package unidadd2;
import java.util.Scanner;
public class EjercicioExtraCond {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       byte dia;
       boolean clienteFrecuente;
       String frecuente;
       double precio;
       
        System.out.println("Indique el dia de la semana");
        dia = in.nextByte();
        
        System.out.println("¿Es un cliente frecuente? (S/N): ");
        frecuente = in.next(); //me lee la siguiente palabra (nextLine lee hasta sig linea)
        clienteFrecuente = frecuente.toUpperCase().charAt(0) == 'S'; //lo convierto todo a mayusculas para que no me de error con las minusculas
                                                    //charAt coge la primera letra convirtiendolo en un tipo char
       precio = switch (dia) {
           case 1, 2, 3, 4, 5 -> 12;
           default -> 15;
       };
       
       if (clienteFrecuente)
           precio *= 0.85; //rebaja 15%
       
        System.out.println("Precio: " + precio + "$");
    }
}