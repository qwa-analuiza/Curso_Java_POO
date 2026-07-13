package sessao04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);


        String produto1, produto2;
        double valorPagar;


        produto1 = leia.nextLine();
        produto2 = leia.nextLine();


        String[] dadosP1 = produto1.split(" ");
        String[] dadosP2 = produto2.split(" ");

        int codigo1 = Integer.parseInt(dadosP1[0]);
        int quantidade1 = Integer.parseInt(dadosP1[1]);
        double valorUnidade1 = Double.parseDouble(dadosP1[2]);

        int codigo2 = Integer.parseInt(dadosP2[0]);
        int quantidade2 = Integer.parseInt(dadosP2[1]);
        double valorUnidade2 = Double.parseDouble(dadosP2[2]);


        valorPagar = (quantidade1 * valorUnidade1) + (quantidade2 * valorUnidade2);
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorPagar));


    }


}
