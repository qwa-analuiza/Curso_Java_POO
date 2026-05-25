package sessao10.exe02;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            leia.nextLine();
            String name = leia.nextLine();
            double price = leia.nextDouble();
            vect[i] = new Product(name, price);
        }
        double soma = 0.0;

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }

        double precoMedio = soma / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", precoMedio);

        leia.close();
    }

}
