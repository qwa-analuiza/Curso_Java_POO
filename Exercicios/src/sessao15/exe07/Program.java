package sessao15.exe07;

import sessao15.exe07.entities.Produto;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\teste\\sumaryum.csv";// define o caminho do arquivo a ser lido
        String caminho = "c:\\teste\\out\\summary.csv"; // define o caminho do arquivo a ser criado

        try (BufferedReader br = new BufferedReader(new FileReader(path));// vai ler o arquivo do caminho path
             BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {// cria o arquivo da variavel caminho

            String line = br.readLine(); //vai ler cada linha e armazenar no line

            while (line != null) { //enquanto line for diferente de nulo

                String[] partes = line.split(","); // o partes vai ser um array que vai separar os dados, antes e depois da virgula

                if (partes.length >= 3) { //verifica se é maior ou igual a tres
                    String nome = partes[0]; // pega a primeira parte e armazena na variavel nome
                    double price = Double.parseDouble(partes[1]); // segunda parte e armazena no preco
                    int quantity = Integer.parseInt(partes[2].trim()); // terceira parte e armazena na quantidade

                    Produto produto = new Produto(nome, price, quantity); // pega todas as variaveis lidas acima e armazena em um novo produto

                    String conteudo = produto.getNome() + String.format("%.2f", produto.valorTotal()); // armazena o nome+valorTotal na variavel conteudo

                    bw.write(conteudo); // escreve o conteudo acima
                    bw.newLine();// passa para a proxima linha e armazena o proximo conteudo
                }
                line = br.readLine(); // le a proxima linha para repetir o processo
            }
            System.out.println("Criado com sucesso"); // mostra a mensagem de sucesso ao usuário
        } catch (IOException e) { // execessões caso apresente, e precise tratar
            System.out.println("Error" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Erro ao processar linha: " + e.getMessage());
        }
    }
}
