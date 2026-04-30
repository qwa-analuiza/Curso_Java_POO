package sessao06;

import java.util.Scanner;

public class Exercicio10 {

    public static void main (String[] args ){

        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();

        for(int i = 1; i <=n; i ++){

            int quadradoNum = i * i;
            int cubo = i * i * i;

            System.out.printf("%d %d %d%n",i, quadradoNum, cubo);

        }
    }

}
