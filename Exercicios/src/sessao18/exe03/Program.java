package sessao18.exe03;

import sessao18.exe03.entities.Product;
import sessao18.exe03.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD case", 80.90));

        final double factor = 1.1;

        list.forEach(p ->  p.setPrice(p.getPrice()* factor)); // vai percorrer a lista aplicando o método de porcentagem em cada elemento

        list.forEach(System.out::println);
    }
}
