package sessao16.exe04;

import sessao16.exe04.entities.BrazilInterestService;
import sessao16.exe04.entities.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = leia.nextDouble();
        System.out.println("Months: ");
        int month = leia.nextInt();
        InterestService is = new BrazilInterestService(1.0);
        double payment = is.payment(amount, month);
        System.out.print("Payment after 3 months");
        System.out.print("Result: " + String.format("%.2f", payment));

        leia.close();
    }
}
