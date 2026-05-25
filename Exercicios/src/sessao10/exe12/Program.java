package sessao10.exe12;

import sessao10.exe12.entities.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        double notaMinima = 6.0;

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = leia.nextInt();
        Alunos[] vet = new Alunos[n];

        for(int i = 0; i < vet.length; i ++){
            System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"º aluno: ");
            leia.nextLine();
            String nome = leia.nextLine();
            double primeiraNota = leia.nextDouble();
            double segundaNota = leia.nextDouble();
            vet[i] = new Alunos(nome, primeiraNota, segundaNota);
        }

        double  media;
        System.out.println("Alunos aprovados: ");
        for(int i = 0; i < vet.length; i ++){
            media = (vet[i].getPrimeiraNota() + vet[i].getSegundaNota()) / 2;

            if (media >= notaMinima){
                System.out.println(vet[i].getNome());
            }
        }
    }
}
