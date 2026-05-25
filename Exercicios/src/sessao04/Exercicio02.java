package sessao04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

       double raio, a;


       raio = leia.nextDouble();
      a = Math.PI * Math.pow(raio, 2);
        System.out.println("A = "+ String.format("%.4f", a));


    }


}
