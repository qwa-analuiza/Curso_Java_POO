package sesssao17.exe11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Map<String, Integer> votes = new LinkedHashMap<>();

        System.out.println("Enter file full path: ");
        String path = leia.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {

                String[] campos = line.split(",");
                String nomeCandidato = campos[0];
                Integer quantidadeVotos = Integer.valueOf(campos[1]);

                if (votes.containsKey(nomeCandidato)) {
                    int votoAtualizacao = votes.get(nomeCandidato);
                    votes.put(nomeCandidato, quantidadeVotos + votoAtualizacao);
                } else {
                    votes.put(nomeCandidato, quantidadeVotos);
                }
                line = br.readLine();
            }
            for (String key : votes.keySet()) {
                System.out.println(key + ":" + votes.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
