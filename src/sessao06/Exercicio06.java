package sessao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        int n;
        n = leia.nextInt();

        double mediaPond,  nota1,nota2, nota3 ;



        for (int i = 0; i < n; i++) {

            nota1 = leia.nextDouble();
            nota2 = leia.nextDouble();
            nota3 = leia.nextDouble();


            mediaPond = ((nota1 * 2) + (nota2 * 3) + (nota3 *5)) / 10;
            System.out.println(mediaPond);

        }

    }
}
