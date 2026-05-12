package sessao13.exe05;

import sessao13.exe05.entities.Company;
import sessao13.exe05.entities.Individual;
import sessao13.exe05.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = leia.nextInt();

        for (int i = 0; i < n; i ++){
            System.out.println("Tac payer #"+(i+1)+" data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = leia.next().charAt(0);
            System.out.print("Name: ");
            leia.nextLine();
            String name = leia.nextLine();
            System.out.print("Anual income ");
            double anualIncome = leia.nextDouble();

            if(ch == 'i'){
                System.out.print("Health expenditures:");
                double healthExpenditures = leia.nextDouble();
                list.add(new Individual(anualIncome, name, healthExpenditures));
            }else{
                System.out.print("Number of employees: ");
                int numberOfEmployees = leia.nextInt();
                list.add(new Company(anualIncome, name, numberOfEmployees));
            }
        }

        double soma = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");

        for (TaxPayer taxPayer : list){
        double tax = taxPayer.tax();
            System.out.println(taxPayer.getName()+ ": $"+ String.format("%.2f", tax));
            soma = soma + tax;
        }

        System.out.println();
        System.out.println("Total taxes: $ "+ String.format("%.2f", soma));
        leia.close();

    }
}
