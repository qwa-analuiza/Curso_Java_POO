package sessao10;

import java.util.Locale;
import java.util.Scanner;

public class exe08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor?");
        int n = leia.nextInt();


        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for(int i = 0; i < n; i ++ ){
            System.out.print("Digite os valores do vetor A: ");
            a[i] = leia.nextInt();
        }
        for(int i = 0; i < n; i ++ ){
            System.out.print("Digite os valores do vetor B: ");
            b[i] = leia.nextInt();
        }


        System.out.println("VETOR RESULTANTE: ");

        for(int i = 0; i < n; i ++){
            c[i] = a[i] + b[i];
        }

        for(int i = 0; i < n; i ++){
            System.out.println(c[i]);
        }
    }

}
