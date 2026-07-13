package sessao10;

import java.util.Locale;
import java.util.Scanner;

public class exe07 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = leia.nextInt();

        double[] vet = new double[n];
        for(int i = 0; i < vet.length; i ++){
            System.out.print("Digite um número: ");
            vet[i] = leia.nextDouble();
        }

        System.out.println();
        int posicao =0;
        double maior = vet[0];
        for (int i = 0; i < vet.length; i ++){
            if(vet[i] > maior){
                maior = vet[i];
                posicao = i;
            }
        }

        System.out.println("MAIOR VALOR = "+ maior);
        System.out.println("POSICAO DO MAIOR VALOR = "+ posicao);
    }

}
