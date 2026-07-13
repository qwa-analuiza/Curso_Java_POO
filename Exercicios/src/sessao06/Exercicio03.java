package sessao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int gasolina = 0,
                alcool = 0,
                diesel = 0,
                codigo;


        codigo = leia.nextInt();

        while (codigo != 4) {

            if (codigo == 1) {
                alcool = alcool + 1;
            } else if (codigo == 2) {
                gasolina = gasolina + 1;
            } else if (codigo == 0) {
                diesel = diesel + 1;
            }


            codigo = leia.nextInt();
        }

        System.out.println("MUITO OBRIGADO !");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina:  " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}