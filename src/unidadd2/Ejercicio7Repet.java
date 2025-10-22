package unidadd2;

public class Ejercicio7Repet {

    public static void main(String[] args) {
       double suma = 0;
       double numerador = 0;
       double denominador = 2;
        for (int i = 1; i <= 10; i++) 
            //no hay que hacer un cast pq el metodo math.pow devuelve un double
            suma += i / Math.pow(2,i);
            
        System.out.println(suma);
    }

}