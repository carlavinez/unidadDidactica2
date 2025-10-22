package unidadd2;

public class Ejercicio6Repet {

    public static void main(String[] args) {
       double resultado = 0;
       double numerador = 0;
       double denominador = 2;
        for (int i = 0; i <= 5; i++) {
            resultado = numerador / denominador;
            numerador =+5;
            denominador = denominador * 3;
        }
        System.out.println(resultado);
    }

}