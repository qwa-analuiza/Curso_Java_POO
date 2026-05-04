// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package sessao8.exercicio04.entities;

public class CurrencyConverter {
   public CurrencyConverter() {
   }

   public static double converter(double dollaarPrice, double value) {
      double tax = dollaarPrice * 0.06;
      double totalTax = tax * value;
      return value * dollaarPrice + totalTax;
   }
}
