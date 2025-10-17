package unidadd2;

public class Ejercicio15Cond {

    public static void main(String[] args) {
        
       double nota1 = 100;
       double nota2 = 80;
       double nota3 = 40;
       double nota4 = 70;
       
       double media = (nota1 + nota2 + nota3 + nota4) / 4;
       
       if(media >= 90 && media <= 100){
           System.out.println("A");
       }else if (media >= 80 && media <= 89){
           System.out.println("B");
       }else if (media >= 70 && media <= 79){
           System.out.println("C");
       }else if (media >= 60 && media <= 69){
           System.out.println("D");
       }else if (media >= 0 && media <= 59){
           System.out.println("E");
       }else{
           System.out.println("La media no es valida");
       }
       
    }

}