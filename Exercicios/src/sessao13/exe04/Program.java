package sessao13.exe04;


import sessao13.exe04.entities.Circle;
import sessao13.exe04.entities.Recttangle;
import sessao13.exe04.entities.Shape;
import sessao13.exe04.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = leia.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char sh = leia.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(leia.next());
            if (sh == 'r') {
                System.out.print("Width: ");
                double width = leia.nextDouble();
                System.out.print("Height");
                double height = leia.nextDouble();
                list.add(new Recttangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = leia.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list) {
            System.out.printf("%.2f%n", shape.area());
        }
        leia.close();
    }
}
