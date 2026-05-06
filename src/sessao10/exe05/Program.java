package sessao10.exe05;

import sessao10.exe02.Product;
import sessao10.exe05.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = leia.nextInt();
        Pessoas[] vet = new Pessoas[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa: ");
            leia.nextLine();
            System.out.print("Nome: ");
            String name = leia.nextLine();
            System.out.print("Idade: ");
            int idade = leia.nextInt();
            System.out.print("Altura: ");
            double altura = leia.nextDouble();
            vet[i] = new Pessoas(altura, name, idade);
        }

        double mediaAltura, somaAltura = 0.0;
        for (int i = 0; i < vet.length; i++) {
            somaAltura += vet[i].getAltura();
        }
        mediaAltura = somaAltura / vet.length;

        int contagemPessoasMenores = 0, porcentagemMenores = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getIdade() < 16) {
                contagemPessoasMenores = contagemPessoasMenores +1;
            }
        }
        porcentagemMenores = contagemPessoasMenores * 100 / vet.length;

        System.out.println("Altura média: "+ String.format("%.2f",mediaAltura ));
        System.out.println("Pessoas com menos de 16 anos: " + porcentagemMenores+"%");

        for (int i = 0; i < vet.length; i ++){
            if (vet[i].getIdade() < 16) {
                System.out.println(vet[i].getName());
            }
        }

    }

}
