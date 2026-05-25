package sessao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int num;

        num = leia.nextInt();

        if(num % 2 == 0 ){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }

    }
}