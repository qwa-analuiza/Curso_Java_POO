package sessao18.exe08;

import sessao18.exe08.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("entre com o caminho da pasta");
        String path = leia.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String fields[] = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double mediaPrice = list.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / list.size();
            System.out.println("Media de preços" + String.format("%.2f", mediaPrice));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream().filter(p -> p.getPrice() < mediaPrice).map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());

            System.out.println("Produtos abaixo da média: ");
            names.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
