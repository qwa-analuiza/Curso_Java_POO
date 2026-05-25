package sessao10;

import java.util.Locale;
import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter cada vetor?");
        int n = leia.nextInt();
        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero ");
            vet[i] = leia.nextInt();
        }

        int contador = 0;
        double mediaPares = 0;
        double soma = 0;

        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                soma = soma + vet[i];
                contador = contador + 1;
            }
        }

        if (contador == 0) {
            System.out.println("NENHUM NUMERO PAR  ");
        } else {
            mediaPares = soma/ contador;
            System.out.println("MEDIA DOS PARES = " + String.format("%.1f", mediaPares));
        }
    }
}
