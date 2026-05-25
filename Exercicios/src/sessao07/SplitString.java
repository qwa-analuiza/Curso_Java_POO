package sessao07;

public class SplitString {

    public static void main(String[] args) {

        String s = "potato apple lemon"; // s recebe a frase

        String[] vet = s.split(" "); // vetor corta a frase de acordo com os " " espaços entre palavras, deixando cada palavra em uma posição.
        String word1 = vet[0]; // variável word1 recebe a posisção 0 do vetor (primeira palavra)
        String word2 = vet[1]; // variavel woord02 recebe a palavra dois do vetor(posisção 01)
        String word3 = vet[2];  // variavel woord03 recebe a palavra tres do vetor(posisção 02)

        System.out.println(vet[0] + " " + vet[2]);// aqui eu mando ele imprimir a primeira e ultima palavra

    }
}