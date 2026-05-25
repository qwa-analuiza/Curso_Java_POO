package sesssao17.exe01;

import sesssao17.exe01.entities.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        PrintService<String> ps = new PrintService<String>() ;

        System.out.println("How many values:");
        int n = leia.nextInt();

        for(int i = 0; i < n; i ++){
            String value = leia.next();
            ps.addValue(value);
        }
        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);
        leia.close();
    }
}