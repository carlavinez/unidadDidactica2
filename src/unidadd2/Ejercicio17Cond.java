package unidadd2;
import java.util.Scanner;
public class Ejercicio17Cond {

    public static void main(String[] args) {
       int dia;
       int mes;
       int ano;
       double a,b,c,d,e,f,g,h,i;
       double diaSemana;
       
       Scanner in = new Scanner(System.in);
       System.out.println("Introzuca el dia");
       dia = in.nextInt();
       
       System.out.println("Introzuca el mes");
       mes = in.nextInt();
       
       System.out.println("Introduzca el ano");
       ano = in.nextInt();
       
       a = (12 - mes) / 10;
       b = ano - a;
       c = mes + (12 * a);
       d = b / 100;
       e = d / 4;
       f = 2 - d + e;
       g = Math.floor(365.25 * b);
       h = Math.floor(30.6001 * (c + 1));
       i = f + g+ h + dia + 5;
       diaSemana = i % 7;
       
       switch ((int)diaSemana){
           case 0:
               System.out.println("Sabado");
               break;
           case 1:
               System.out.println("Domingo");
               break;
           case 2:
               System.out.println("Lunes");
               break;
           case 3:
               System.out.println("Martes");
               break;
           case 4:
               System.out.println("Miercoles");
               break;
           case 5:
               System.out.println("Jueves");
               break;
           case 6:
               System.out.println("Viernes");
               break;
       }
    }

}