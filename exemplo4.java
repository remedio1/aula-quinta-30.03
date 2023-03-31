package quinta.feira.pkg30.pkg03;

import java.util.Scanner;

public class exemplo4 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int contador = 0;
        double nota = 0;

        while (contador < 3) {
            System.out.printf("Nota %d:", contador + 1);
            nota += tc.nextDouble();
            contador++;
        }

        System.out.printf("Media =%.2f", nota / contador);

        tc.close();
    }
}
