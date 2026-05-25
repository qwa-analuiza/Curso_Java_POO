package sessao06;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();

        for(int i = 1; i <= n; i ++)
            if (n % i == 0) {
                System.out.println(i);
            }



    }
}
