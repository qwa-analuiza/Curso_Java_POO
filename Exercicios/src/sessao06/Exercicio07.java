package sessao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();

        double numerador ;
        double denominador;
        double  divisao;

        for(int i = 0 ; i < n; i ++){
            numerador = leia.nextDouble();
            denominador = leia.nextDouble();

            if(denominador != 0 ){
                divisao = numerador/ denominador;
                System.out.println(divisao);
            }else {
                System.out.print("Divisão impossivel");
            }


        }


    }

}
