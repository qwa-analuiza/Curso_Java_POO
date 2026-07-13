package sessao04;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int a, b, c, d, diferenca;

        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        d = leia.nextInt();

    diferenca = (a*b) - (c*d);

        System.out.println("DFERENCA = "+ diferenca);
    }


}
