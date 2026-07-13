package sessao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static  void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);




        String valores1;

        valores1 = leia.nextLine();

        String[] dados1 = valores1.split(" ");

        int codigo = Integer.parseInt(dados1[0]);
        int quantidade = Integer.parseInt(dados1[1]);

double valorProduto = 0, valor;
        switch (codigo) {
            case 1:
                valorProduto = 4.00;
                break;

            case 2 :
                valorProduto = 4.50;
                break;
            case 3 :
                valorProduto = 5.00;
                break;
            case 4 :
                valorProduto = 2.00;
                break;
            case 5 :
                valorProduto = 1.50;
                break;
            default:
                System.out.print("Código inválido");
                break;
        }



        valor = quantidade * valorProduto;

        System.out.print("Total R$ " + String.format("%.2f", valor));

    }
}
