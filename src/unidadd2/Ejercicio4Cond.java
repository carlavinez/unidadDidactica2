package unidadd2;

public class Ejercicio4Cond {

    public static void main(String[] args) {
       int n1 = 5;
       int n2 = 8;
       int n3 = 6;
       int n4 = 10;
       int menor;
       
       if (n1 < n2)
           menor = n1;
       else
           menor = n2;
       if (n3 < menor)
           menor = n3;
       if (n4 < menor)
           menor = n4;
       
        System.out.println(menor);
    }

}