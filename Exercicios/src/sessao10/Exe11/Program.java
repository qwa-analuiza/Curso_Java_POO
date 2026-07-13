package sessao10.Exe11;

import sessao10.Exe11.entities.OlderPeople;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = leia.nextInt();
        OlderPeople[] vet = new OlderPeople[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa: ");
            leia.nextLine();
            System.out.print("Nome:");
            String name = leia.nextLine();
            System.out.print("Idade:");
            int idade = leia.nextInt();
            vet[i] = new OlderPeople(name, idade);
        }

        int maior = vet[0].getIdade();
        int posicao = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getIdade() > maior) {
                maior = vet[i].getIdade();
                posicao = i;
            }
        }
        System.out.print("PESSOA MAIS VELHA: " + vet[posicao].getName());
    }
}
