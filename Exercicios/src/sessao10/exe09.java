package sessao10;

import java.util.Locale;
import java.util.Scanner;

public class exe09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor?");
        int n = leia.nextInt();

        double soma = 0, media;
        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = leia.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            soma = soma + vet[i];
        }

        media = soma / n;
        System.out.println("");
        System.out.println("MEDIA DO VETOR =  " + String.format("%.3f", media));


        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < n; i++) {
            if (vet[i] < media) {
                System.out.println(String.format("%.1f", vet[i]));
            }
        }
    }
}
