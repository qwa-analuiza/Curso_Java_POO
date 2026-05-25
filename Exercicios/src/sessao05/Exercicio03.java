package sessao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        String valores1;

        valores1 = leia.nextLine();

        String[] dados1= valores1.split(" ");

        int a = Integer.parseInt(dados1[0]);
        int b = Integer.parseInt(dados1[1]);

        if(a % b ==  0  || b % a == 0 ){
            System.out.println("Sao multiplos ");
        }else{
            System.out.print("Nao sao multiplos ");
        }



    }
}