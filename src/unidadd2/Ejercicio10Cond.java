package unidadd2;
import java.util.Scanner;
public class Ejercicio10Cond {

    public static void main(String[] args) {
        
       int año;
       System.out.println("Introduce el ano");
       Scanner in = new Scanner(System.in);
       año = in.nextInt();
       
       int a = año % 19;
       int b = año % 4;
       int c = año % 7;
       int d = (19 * a + 24) % 30;
       int e = (2 * b + 4 * c + 6 * d + 5) % 7;
       int f = (22 + d + e);
       
       if(f <= 31){
           System.out.printf("Pascua es el %d de marzo\n",f);
       }else{
           int f2 = f - 31;
           System.out.printf("Pascua es el %d de abril\n", f2);
       }
    }

}