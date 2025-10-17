package unidadd2;

import java.util.Scanner;

public class Ej7CondPrueba {

    public static void main(String[] args) {
       int hora;
       int minutos;
       String franjaHoraria;
       
       System.out.println("escribe una hora: ");
       Scanner in = new Scanner(System.in);
       hora = in.nextInt();
       
       System.out.println("escribe los minutos: ");
       minutos = in.nextInt();
       System.out.println(franjaHoraria = (hora >= 12)? "PM" : "AM");
       
       if(hora > 12)
           hora -= 12;
       
        System.out.printf("%02d:%02d %s\n",hora, minutos, franjaHoraria);
    }

}