package sesssao17.exe08;

import com.sun.source.tree.TryTree;
import sesssao17.exe08.entities.LogsAcessos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        Set<LogsAcessos> set = new TreeSet<>();

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o caminho da pasta:");
        String path = leia.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] campos = line.split(" ");
                String name = campos[0];
                Date moment = Date.from(Instant.parse(campos[1]));

                set.add(new LogsAcessos(moment, name));
                line = br.readLine();
            }
            System.out.println("Total users:" + set.size());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        leia.close();

    }
}
