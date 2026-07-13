package sessao04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static  void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);


        String valores1;

        valores1 = leia.nextLine();

        String[] dados1= valores1.split(" ");

        double a = Double.parseDouble(dados1[0]);
        double b = Double.parseDouble(dados1[1]);
        double c = Double.parseDouble(dados1[2]);


        double areaTriangulo;
        double areaCirculo;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;

        areaTriangulo = (a * c)/2;
        areaCirculo = Math.pow(c, 2) * Math.PI;
        areaTrapezio = ((a + b)*c)/ 2;
        areaQuadrado  = b * b;
        areaRetangulo = a * b;

        System.out.println("TRIANGULO: "+String.format("%.3f", areaTriangulo));
        System.out.println("CIRCULO: "+ String.format("%.3f",areaCirculo));
        System.out.println("TRAPEZIO: "+ String.format("%.3f", areaTrapezio));
        System.out.println("QUADRADO: "+ String.format("%.3f", areaQuadrado));
        System.out.println("RETANGULO: "+ String.format("%.3f", areaRetangulo));
    }
}
