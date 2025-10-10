package unidadd2;

public class Ejercicio6Cond {

    public static void main(String[] args) {
       final double SALARIO = 1500;
       int hijos = 200;
       double salarioFinal;
       
       if(hijos <= 2){
           salarioFinal = SALARIO * 0.20;
           System.out.println(salarioFinal);
           
       }else if(hijos >= 3 && hijos <= 5){
           salarioFinal = SALARIO * 0.15;
           System.out.println(salarioFinal);
           
       }else if(hijos >= 6 && hijos <= 7){
           salarioFinal = SALARIO * 0.10;
           System.out.println(salarioFinal);
           
       }else if(hijos >= 8 && hijos <= 9){
           salarioFinal = SALARIO * 0.05;
           System.out.println(salarioFinal);
           
       }else if(hijos >= 10){
           salarioFinal = SALARIO;
           System.out.println(salarioFinal);
       }
    }

}