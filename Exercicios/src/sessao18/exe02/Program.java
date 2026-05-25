package sessao18.exe02;

import sessao18.exe02.entities.Product;

import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 9000.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD case", 80.90));

        final double min = 100.00;
        list.removeIf(p -> p.getPrice() >= min);


        for (Product prod : list) {
            System.out.println(prod);
        }

    }
}