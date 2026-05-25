package sessao13.exe03;

import sessao13.exe03.entities.ImportedProduct;
import sessao13.exe03.entities.Product;
import sessao13.exe03.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data ");
            System.out.print("Commom, user or imported (c/u/i)");
            char ch = leia.next().charAt(0);
            System.out.print("Name: ");
            leia.nextLine();
            String name = leia.nextLine();
            System.out.print("Price: ");
            double price = leia.nextDouble();

            if (ch == 'c') {
                list.add(new Product(name, price));
            } else if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = leia.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(leia.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            }
        }

        System.out.println();
        System.out.println("Price tags:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }
    }
}
