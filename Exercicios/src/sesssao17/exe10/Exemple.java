package sesssao17.exe10;

import sesssao17.exe10.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Exemple {
    public static void main(String[] args){

        Map<Product, Double> estoque = new HashMap<>();

        Product p1 = new Product("Tv", 900.00);
        Product p2 = new Product("Notebook", 1200.00);
        Product p3 = new Product("Tablet", 400.00);

        estoque.put(p1, 10000.0);
        estoque.put(p2, 20000.0);
        estoque.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contém 'ps' nas chaves: " + estoque.containsKey(ps));
    }
}
