package sessao18.exe03.util;

import sessao18.exe03.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);// muda o preço de valor atual para a porcentagem 100
    }
}
