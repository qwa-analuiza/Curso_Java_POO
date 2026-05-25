package sessao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args){


        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);


        double senha ;
        senha = leia.nextDouble();



        while (senha!= 2002) {
            System.out.print("Senha Invalida");
            senha = leia.nextDouble();
        }

        System.out.print("Acesso permitido !");


    }
}
