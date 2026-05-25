package sessao15.exe07.exemplo;


import sessao15.exe07.exemplo.entities.Product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US); //deixa os dados de entrada serem digitados com .
        Scanner sc = new Scanner(System.in); // le as entradas digitadas pelo usuário

        List<Product> list = new ArrayList<>();// cria um arrayList do tipo Produto(classe)

        System.out.println("Enter file path: ");// solicita um caminho de uma pasta ao usuário
        String sourceFileStr = sc.nextLine(); // armazena o caminho digitado pelo usuário na var sourceFileStr

        File sourceFile = new File(sourceFileStr);// cria um objeto e referencia o caminho da pasta fornecido pelo usuário
        String sourceFolderStr = sourceFile.getParent();// pega o diretorio pai do arquivo e armazena em sourceFolderStr ignora o nome do arquivo

        boolean success = new File(sourceFolderStr + "\\out").mkdir();// pega o diretorio pai cria um novo diretorio \\out o .mkdir tenta fazer a criação do diretorio

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";// ele implememta "\\out\\summary.csv" no sourceFolderStr

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) { // cria um objeto br de leitura

            String itemCsv = br.readLine(); //Cria uma string e faz ela ler a linha do objeto de leitura
            while (itemCsv != null) { // enquanto o objeto de leitura for diferente de nulo

                String[] fields = itemCsv.split(","); // ele vai cortar a string quando achar uma ,
                String name = fields[0]; // e vai armazenar em cada posição, nome =0
                double price = Double.parseDouble(fields[1]);// price = posição 1
                int quantity = Integer.parseInt(fields[2]); // quantidade posição 2

                list.add(new Product(name, price, quantity)); // vai adicionar um novo produto na lista de produtos

                itemCsv = br.readLine(); // vai ler a proxima linha
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) { // cria um objeto de escrita

                for (Product item : list) {// faz um for para percorrer os itens da lista produto
                    bw.write(item.getName() + "," + String.format("%.2f", item.total())); // escreve nome+ valor total
                    bw.newLine(); //pula a linha para a proxima escrita
                }

                System.out.println(targetFileStr + " CREATED!");// avisa o usuário

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage()); // se der erro ele vai mostrar essa msg error (erro de escrita)
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage()); //(excessão erro de leitura )
        }

        sc.close();// fecha o objeto de leitura de entrada de dados
    }
}