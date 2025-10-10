package unidadd2;

public class Ejercicio8Cond {

    public static void main(String[] args) {
       int a = 2;
       int b = 6;
       int c = 8;
       int d = 3;
       
       if(b > 5 || c > 5 || d > 5){
           System.out.println(a + "." + ++b + 0 + 0);
       }else{
           System.out.println(a +"."+ b + c + d);
       }
    }

}