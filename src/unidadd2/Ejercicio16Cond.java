package unidadd2;

public class Ejercicio16Cond {

    public static void main(String[] args) {
       double a = 2;
       double b = 8;
       double c = 6;
       /*
       -b+-(Math.sqrt(Math.pow(b,2) - 4 * a * c )/ 2 * a
       */
       double x1; //solucion con +
       double x2; //solución con -
       
       if (a == 0){
           System.out.println("no se puede dividir entre 0");
       }else{
           x1 = -b+(Math.sqrt(Math.pow(b,2) - 4 * a * c ))/ 2 * a;
           System.out.println(x1);
           x2 = -b-(Math.sqrt(Math.pow(b,2) - 4 * a * c ))/ 2 * a;
           System.out.println(x2);
       }
    }

}