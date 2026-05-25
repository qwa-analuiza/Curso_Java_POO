package sessao18.exe05.service;

import sessao18.exe05.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double somaFiltrada (List<Product> list, Predicate<Product> comparacao ){
        double soma = 0.0;
        for (Product p : list){
            if(comparacao.test(p)){
                soma += p.getPrice();
            }
        }
        return soma;
    }
}
