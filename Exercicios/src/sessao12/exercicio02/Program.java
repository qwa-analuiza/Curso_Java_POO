package sessao12.exercicio02;

import sessao12.exercicio02.entities.Department;
import sessao12.exercicio02.entities.HourContract;
import sessao12.exercicio02.entities.Worker;
import sessao12.exercicio02.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento :");
        String departmentName = leia.nextLine();

        System.out.println("Digite os dados do trabalhador :");

        System.out.print("Nome :");
        String workerName = leia.nextLine();

        System.out.print("Nivel  :");
        String workerLevel = leia.nextLine();

        System.out.print("Salario base :");
        double baseSalary = leia.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("Quantos contratos para esse trabalhador ? :");
        int n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Insira um contrato # " +  i + " data");
            System.out.print("Data DD/MM/yyyy" );
            Date contractDate = sdf.parse(leia.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = leia.nextDouble();
            System.out.print("Duração (horas)");
            int hours = leia.nextInt();
            HourContract contract = new HourContract(contractDate, valorPorHora, hours);
            worker.addContract(contract);
        }

        System.out.println("");
        System.out.print("Digite o mes e ano para calcularmso o salario (MM/yyyy)");
        String mesEano = leia.next();

        int month = Integer.parseInt(mesEano.substring(0,2)) ;
        int year =  Integer.parseInt(mesEano.substring(3));

        System.out.println("Name: " + workerName);
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Salario no:  " + mesEano + ":"+ worker.income(year,month));

        leia.close();
    }

}
