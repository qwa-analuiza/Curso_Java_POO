package sessao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);


        String valores1;

        valores1 = leia.nextLine();

        String[] dados1 = valores1.split(" ");

        int inicio = Integer.parseInt(dados1[0]);
        int fim = Integer.parseInt(dados1[1]);

        int duracao ;

        if (inicio > fim) {
            duracao = 24 - inicio + fim;
            System.out.print("O JOGO DUROU "+duracao+" HORA(S)");
        } else if (inicio < fim) {
            duracao = fim - inicio;
            System.out.print("O JOGO DUROU "+duracao+" HORA(S)");
        } else {
            System.out.print("O JOGO DUROU 24 HORA(S)");
        }

    }
}
