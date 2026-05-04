package sessao8.exercicio04;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

import sessao8.exercicio04.entities.CurrencyConverter;

public class Program {
   public Program() {
   }

   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner leia = new Scanner(System.in);
      System.out.println("What is the dollar price ?");
      double dollaarPrice = leia.nextDouble();
      System.out.println("How many dollar will be bought?");
      double value = leia.nextDouble();
      PrintStream var10000 = System.out;
      double var10001 = CurrencyConverter.converter(dollaarPrice, value);
      var10000.println("Amount to be paid in reais  =  " + var10001);


      leia.close();
   }
}
