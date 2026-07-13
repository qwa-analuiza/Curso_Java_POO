package sessao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static  void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);


        String valores1;

        valores1 = leia.nextLine();

        String[] dados1 = valores1.split(" ");

        double x = Double.parseDouble(dados1[0]);
        double y = Double.parseDouble(dados1[1]);

        if( x > 0 && y < 0){
            System.out.print("Q4");
        } else if (x > 0 && y > 0) {
            System.out.print("Q1");
        } else if (x == 0 && y== 0) {
            System.out.print("Origem");
        }else if (y == 0 ){
            System.out.print("Eixo X");
        }else if(x < 0 && y > 0.0){
            System.out.print("Q2");
        }else if(x < 0 && y < 0.0){
            System.out.print("Q2");
        }else if (x == 0 ){
            System.out.print("Eixo y");
        }

    }
}
