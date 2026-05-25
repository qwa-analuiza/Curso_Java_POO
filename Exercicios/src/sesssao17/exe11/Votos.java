package sesssao17.exe11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Votos {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Map<String, Integer> votes = new HashMap<>();

        System.out.println("Enter file full path:");
        String path = leia.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {

                String[] campos = line.split(",");
                String nome = campos[0];
                Integer contagem = Integer.parseInt(campos[1]);

                if (votes.containsKey(nome)) {
                    int contAtualiza = votes.get(nome);
                    votes.put(nome, (contagem + contAtualiza));
                } else {
                    votes.put(nome, contagem);
                }
                line = br.readLine();
            }
            for (String resultado : votes.keySet()) {
                System.out.println(resultado + ":" + votes.get(resultado));
            }
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
