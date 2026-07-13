package sessao07;

public class FormatString {
    public static void main(String[] args) {

        String original = "AAA bbb abc DDD AAC    ";

        String s01 = original.toLowerCase();// letras minusculas
        String s02 = original.toUpperCase();// letras maiusculas
        String s03 = original.trim(); // remove os espaços em branco no fim e inicio de frase
        String s04 = original.substring(2);// pega somente o caracter da posicao dois em diante e monta uma nova string
        String s05 = original.substring(2, 9); // agora ele vai comar a sring com o argumento de começo e fim
        String S06 = original.replace('a', 'x'); // sempre que encontrar um caracter na posição 1 faz a troca  para a posição 02 nesse caso muda de a para x
        String S07 = original.replace("abc", "XXX");// Altera como o de cima, porém com mais caracteres
        int i = original.indexOf("B");// saber o index da primeira repetçao AA
        int j = original.lastIndexOf("AA");//saber o index da ultima repetiçao AA

        System.out.println("Original: -" + original + "-");
        System.out.println("toLoweCase: -" + s01 + "-");
        System.out.println("toUpperCase -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring" + s04 + "-");
        System.out.println("substring" + s05 + "-");
        System.out.println("replace('a', 'x')" + S06 + "-");
        System.out.println("replace('abc', 'XXX')" + S07 + "-");
        System.out.println("indexOF 'AA': ')" + i);
        System.out.println("LastIndexOF 'AA': ')" + j);

    }

}
