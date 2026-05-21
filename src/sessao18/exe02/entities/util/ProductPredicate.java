package sessao18.exe02.entities.util;

import java.util.function.Predicate;
import sessao18.exe02.entities.Product;

public class ProductPredicate implements Predicate<Product>{

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}

