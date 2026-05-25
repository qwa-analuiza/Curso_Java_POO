package sessao10;

import java.util.Locale;
import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas??");
        int n = leia.nextInt();

        double[] altura = new double[n];
        String[] genero = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + " pessoa:");
            altura[i] = leia.nextDouble();

            leia.nextLine();
            System.out.print("Genero da" + (i + 1) + " pessoa:");
            genero[i] = leia.nextLine();
        }

        double maior = altura[0];
        double menor = altura[0];
        double mediamulheres = 0;
        int contadorH = 0, contadorF = 0;
        double soma = 0;

        for (int i = 0; i < n; i++) {
            if (altura[i] > maior) {
                maior = altura[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (altura[i] < menor) {
                menor = altura[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (genero[i].equals("M")) {
                contadorH = contadorH + 1;

            } else if (genero[i].equals("F")) {
                soma = soma + altura[i];
                contadorF = contadorF + 1;
            }
        }

        mediamulheres = soma / contadorF;
        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);
        System.out.println("Media das alturas das mulheres =  " + String.format("%.2f", mediamulheres));
        System.out.println("Numero de homens = " + contadorH);
    }
}

