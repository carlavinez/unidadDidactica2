package unidadd2;

public class Ejercicio5Cond {

    public static void main(String[] args) {
       final double PRECIO = 25.00;
       int unidadesCompr = 200;
       double precioFinal;
       
       if(unidadesCompr > 100){
           precioFinal = PRECIO * 0.40;
           System.out.println(precioFinal);
           
       }else if(unidadesCompr >= 25 && unidadesCompr <= 100){
           precioFinal = PRECIO * 0.20;
           System.out.println(precioFinal);
           
       }else if(unidadesCompr >= 10 && unidadesCompr <= 24){
           precioFinal = PRECIO * 0.10;
           System.out.println(precioFinal);
           
       }else if(unidadesCompr <= 10){
           precioFinal = PRECIO;
           System.out.println(precioFinal);
       }
    }

}