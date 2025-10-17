package unidadd2;

public class Ejercicio13Cond {

    public static void main(String[] args) {
       double facturas;
       final double IMPORTE_KM_TRAMO2 = 0.20;
       final double IMPORTE_KM_TRAMO3 = 0.15;
       final int LIMITE_TRAMO1 = 300;
       final int LIMITE_TRAMO2 = 700;
       final double KILOMETROS = 1000;
       
       if(KILOMETROS <= LIMITE_TRAMO1)
           facturas = 30;
       else if(KILOMETROS <= LIMITE_TRAMO2)
           facturas = 30 + (KILOMETROS - LIMITE_TRAMO2) * IMPORTE_KM_TRAMO2;
       else
           facturas = 30 + (LIMITE_TRAMO2 - LIMITE_TRAMO1) * IMPORTE_KM_TRAMO2 + (KILOMETROS - LIMITE_TRAMO2) * IMPORTE_KM_TRAMO3 ;
       
        System.out.printf("La factura es de %f euros",facturas);
       }
}