package sessao14.exe02;

import sessao14.exe02.entities.Account;
import sessao14.exe02.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number :");
        int number = leia.nextInt();
        System.out.print("Holder :");
        leia.nextLine();
        String holder = leia.nextLine();
        System.out.print("Initial Balance");
        double inicialBalance = leia.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = leia.nextDouble();

        Account account = new Account(inicialBalance, holder, number, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw:");
        double amount = leia.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
        leia.close();
    }

}
