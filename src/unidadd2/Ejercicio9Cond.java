package unidadd2;
import java.util.Scanner;
public class Ejercicio9Cond {

    public static void main(String[] args) {
       int mes;
       System.out.println("Introduzca el numero de mes: ");
       Scanner in = new Scanner(System.in);
       mes = in.nextInt();
       
       switch (mes){
           case 1:
               System.out.println("Enero tiene 31 días");
               break;
           case 2:
               int year;
               System.out.println("Introduzca el ano");
               year = in.nextInt();
               if ( year % 4 == 0){
                   System.out.println("Febrero tiene 29 dias (ano bisiesto)");
               }else{
                   System.out.println("Febrero tiene 28 dias (no es ano bisiesto)");
               }
               break;
           case 3:
               System.out.println("Marzo tiene 31 dias");
               break;
           case 4:
               System.out.println("Abril tiene 30 dias");
               break;
           case 5:
               System.out.println("Mayo tiene 31 dias");
               break;
           case 6:
               System.out.println("Junio tiene 30 dias");
               break;
           case 7:
               System.out.println("Julio tiene 31 dias");
               break;
           case 8:
               System.out.println("Agosto tiene 31 dias");
               break;
           case 9:
               System.out.println("Septiembre tiene 30 dias");
               break;
           case 10:
               System.out.println("Octubre tiene 31 dias");
               break;
           case 11:
               System.out.println("Noviembre tiene 30 dias");
               break;
           default:
               System.out.println("Diciembre tiene 31 dias");
              
       }
    }

}