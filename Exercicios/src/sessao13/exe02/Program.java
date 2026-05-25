package sessao13.exe02;

import sessao13.exe02.entities.Empoyee;
import sessao13.exe02.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        List<Empoyee> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = leia.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n)?");
            char ch = leia.next().charAt(0);
            System.out.print("Name:");
            leia.nextLine();
            String name = leia.nextLine();
            System.out.println("Hours: ");
            double hours = leia.nextDouble();
            System.out.println("Value per hour:");
            int valuePerHours = leia.nextInt();

            if(ch == 'y'){
                System.out.println("Additional charge:");
                double additionaCharge = leia.nextDouble();
                Empoyee emp = new OutsourcedEmployee(valuePerHours, name, hours, additionaCharge);

                list.add(emp);
            }else{
             list.add( new Empoyee(valuePerHours, name, hours));
            }

        }


        System.out.println();
        System.out.println("PAYMENTS:");
        for(Empoyee emp : list){
            System.out.println(emp.getName() + " - $ "+ String.format("%.2f", emp.payment()));
        }

        leia.close();
    }

}
