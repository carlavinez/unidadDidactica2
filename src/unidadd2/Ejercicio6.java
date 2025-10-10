package unidadd2;

public class Ejercicio6 {

    public static void main(String[] args) {
        
    //a)
    double ud1 = 8;
    double ud2 = 7;
    double ud3 = 0;
    double media = (ud1 + ud2 + ud3) / 3;
    
    if(media >= 5)
            System.out.println("Ha aprobado");
    else
            System.out.println("Ha suspendido");
    
    //b)
    if(media >= 4.5 && ud1 > 3 && ud2 > 3 & ud3 > 3)
            System.out.println("Ha aprobado");
    else
            System.out.println("Ha suspendido");
    
    //c)
    boolean practicas = true; //Las practicas estan entregadas
     
    if(media >= 4.5 && ud1 > 3 && ud2 > 3 & ud3 > 3 && practicas == true)
            System.out.println("Ha aprobado");
    else
            System.out.println("Ha suspendido");
    
    //d)
    final int NOTA_MIN = 4;
    final int NOTA_MIN_PRACT = 4;
    int nota1 = 4;
    int nota2 = 6;
    int nota3 = 7;
    int notaPractica;
    boolean practEntre;
    
    double notaMedia = (double) (nota1 + nota2 + nota3) / 3;
    boolean contenidoMinimo = 
            nota1 >= NOTA_MIN &&
            nota2 >= NOTA_MIN &&
            nota3 >= NOTA_MIN;
    boolean aprueba;
            notaPractica = NOTA_MIN_PRACT;
    double notaFinal = notaMedia *  0.8 + notaPractica * 0.2;
    }

}