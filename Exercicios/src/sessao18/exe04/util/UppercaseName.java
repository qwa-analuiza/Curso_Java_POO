package sessao18.exe04.util;

import sessao18.exe04.entities.Product;

import java.util.function.Function;

public class UppercaseName implements Function<Product, String> {


    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
