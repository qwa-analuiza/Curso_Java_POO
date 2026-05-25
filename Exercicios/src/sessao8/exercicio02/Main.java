package sessao8.exercicio02;

import sessao8.exercicio02.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Employee funcionario = new Employee();


        System.out.print("Name");
        funcionario.name = leia.nextLine();

        System.out.print("Gross salary: ");
        funcionario.grossSalary = leia.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = leia.nextDouble();

        System.out.println();
        System.out.print("Employee:" + funcionario);
        System.out.println();
        System.out.print("Which percentage to increase salary?");
        double percentage = leia.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println();
        System.out.print("Updated data: "+ funcionario);
        leia.close();

    }
}
