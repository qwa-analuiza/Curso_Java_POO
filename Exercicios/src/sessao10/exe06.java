package sessao10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exe06 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = leia.nextInt();

        int[] vet = new int[n];
        for(int i = 0; i < vet.length; i ++){
            System.out.print("Digite um número");
            vet[i] = leia.nextInt();
        }

        System.out.println();
        int cont = 0;
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vet.length; i ++){
            if(vet[i] % 2 == 0 ){
                System.out.print(vet[i]+"  ");
                cont = cont + 1;
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("QUANTIDADE DE PARES = "+ cont);
    }
}
