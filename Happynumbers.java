import java.util.Scanner;

public class Happynumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        int cifra,suma;

        while((numero = in.nextInt()) != 0){
            while (numero != 1 && numero != 4) {
                suma = 0;

                while (numero != 0) {
                    cifra = numero % 10;
                    suma += cifra * cifra;
                    numero = numero / 10;
                }
                numero = suma;
            }

            if (numero == 1)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}
