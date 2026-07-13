package sessao06;

import java.util.Scanner;

public class Exercicio08 {

    public static void main( String [] args ){

        Scanner leia = new Scanner(System.in );

        int n = leia.nextInt();

        int fatorial = 1;
        for(int i = 1; i <= n; i ++){

            fatorial = fatorial * i;


        }
        System.out.println(fatorial);


    }



}
