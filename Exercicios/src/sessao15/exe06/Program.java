package sessao15.exe06;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void  main (String[] args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String srtPath = leia.nextLine();

        File path = new File(srtPath);

        System.out.println("GetName: " + path.getName());
        System.out.println("GetParent" + path.getParent());

        leia.close();
    }
}
