package sessao10;

import java.util.Locale;
import java.util.Scanner;

public class exe01 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();

       double [] vet = new double[n];
       double media, soma= 0;

       for(int i = 0; i < n; i ++){
           vet[i] = leia.nextDouble();
           soma = soma + vet[i];
       }

       media = soma/n;
        System.out.println("AVERAGE HEIGHT = "+ String.format("%.2f", media));


leia.close();
    }

}
