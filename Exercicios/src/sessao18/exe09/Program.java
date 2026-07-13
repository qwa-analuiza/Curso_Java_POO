package sessao18.exe09;

import sessao18.exe09.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
     public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Enter fill file path");
        String path = leia.next();

        System.out.println("Enter salary");
        double valor = leia.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] campos = line.split(",");
                list.add(new Employee(campos[0], campos[1], Double.parseDouble(campos[2])));
                line = br.readLine();
            }
            System.out.println("Email of people whose salary is more than " + valor + ":");

            List<String> emails = list.stream().filter(e -> e.getSalary() > valor).map(e -> e.getEmail()).collect(Collectors.toList());

            double soma = list.stream().filter(e -> e.getName().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0, (x, y) -> x + y);

            emails.forEach(System.out::println);
            System.out.println("Soma of salary of people whose name starts with 'M' :" + String.format("%.2f", soma));


        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
