package sessao04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int numF,horas ;
        double valorH, salario;


        numF = leia.nextInt();
        horas = leia.nextInt();
        valorH = leia.nextDouble();

        salario = horas * valorH;


        System.out.println("NUMBER = " + numF);
        System.out.println("SALARY = U$ "+ String.format("%.2f", salario));


    }
}
