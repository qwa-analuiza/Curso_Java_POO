package sessao8.exercicio01;

import sessao8.exercicio01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();

        System.out.println("Enter ractangle width and height: ");
        retangulo.width = leia.nextDouble();
        retangulo.height = leia.nextDouble();

        System.out.println("AREA = "+ String.format("%.2f", retangulo.area()));
        System.out.println("PERIMETER = "+ String.format("%.2f", retangulo.perimeter()));
        System.out.println("DIAGONAL = "+ String.format("%.2f", retangulo.diagonal()));

    }

}
