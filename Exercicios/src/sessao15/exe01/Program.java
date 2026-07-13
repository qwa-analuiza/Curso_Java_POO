package sessao15.exe01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("C:\\in.txt"); // variavel file guarda o caminho de acesso para o arquivo
        Scanner leia = null;
        try {
            leia = new Scanner(file);
            while (leia.hasNextLine()) {
                System.out.println(leia.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (leia != null) {
                leia.close();
            }
        }
    }

}
