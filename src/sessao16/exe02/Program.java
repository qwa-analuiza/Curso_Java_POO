package sessao16.exe02;

import sessao16.exe02.model.entities.Contract;
import sessao16.exe02.model.entities.Installment;
import sessao16.exe02.model.service.ContractService;
import sessao16.exe02.model.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int number = leia.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(leia.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = leia.nextDouble();

        Contract obj = new Contract(date, number, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = leia.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(obj,n);

        System.out.println();
        System.out.print("Parcelas: ");
       for(Installment installment : obj.getInstalments()){
           System.out.println(installment);
       }
        leia.close();
    }

}
