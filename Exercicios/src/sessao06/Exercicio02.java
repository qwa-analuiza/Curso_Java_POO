package sessao06;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        String valores1;
        Scanner leia = new Scanner(System.in);




        valores1 = leia.nextLine();

        String[] dados1 = valores1.split(" ");

        int x = Integer.parseInt(dados1[0]);
        int y = Integer.parseInt(dados1[1]);

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo ");
            }


            x = leia.nextInt();
            y = leia.nextInt();
        }

    }
}