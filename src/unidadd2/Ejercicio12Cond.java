package unidadd2;

public class Ejercicio12Cond {

    public static void main(String[] args) {
       int n1 = 6;
       int n2 = 8;
       int n3 = 2;
       int mayor;
       
       mayor = Math.max(n1, n2);
       mayor = Math.min(mayor, n3);
       
       //alternativa
       //mayor = Math.max(Math.max(n1,n2), n3);
       
    }

}