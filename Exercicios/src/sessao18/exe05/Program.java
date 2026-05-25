package sessao18.exe05;

import sessao18.exe05.entities.Product;
import sessao18.exe05.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD case", 80.90));


        ProductService ps = new ProductService();
        double soma = ps.somaFiltrada(list,p -> p.getPrice() < 100.00);


        System.out.println("Soma = " + String.format("%.2f", soma));
    }
}
