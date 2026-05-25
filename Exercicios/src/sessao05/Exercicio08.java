package sessao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        double salario, salarioAtual = 0;
        salario = leia.nextDouble();

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario > 2000.00 && salario <= 3000.00) {
            salarioAtual = (salario - 2000.00) * 0.08;
        } else if (salario > 3000.00 && salario <= 4500.00) {
            salarioAtual = (salario - 3000.00) * 0.18 + 1000 * 0.08;
        } else if (salario > 4500.00) {
            salarioAtual = (salario - 4500.00) * 0.28 + 1500 * 0.18 + 1000.00 * 0.08;
        }

        if (salarioAtual > 0) {
            System.out.println("R$ " + String.format("%.2f", salarioAtual));
        }


    }
}
