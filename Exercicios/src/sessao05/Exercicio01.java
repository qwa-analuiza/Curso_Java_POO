package sessao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);


        int num1;

       num1 =  leia.nextInt();

       if (num1 < 0 ){
           System.out.println("NEGATIVO");
       } else if (num1 > 0) {
           System.out.println("NÃO NEGATIVO");
       }

    }
}