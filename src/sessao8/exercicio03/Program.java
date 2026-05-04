package sessao8.exercicio03;

import java.util.Locale;
import java.util.Scanner;
import sessao8.exercicio03.entities.Student;

public class Program {
   public Program() {
   }

   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner leia = new Scanner(System.in);
      Student estudante = new Student();
      estudante.name = leia.nextLine();
      estudante.nota1 = leia.nextDouble();
      estudante.nota2 = leia.nextDouble();
      estudante.nota3 = leia.nextDouble();
      System.out.println("FINAL GRADE = " + estudante.notaFinal());
      if (estudante.notaFinal() > (double)60.0F) {
         System.out.println("PASS");
      } else {
         System.out.println("FAILED");
         System.out.println("MISSING " + estudante.notaFaltante() + " POINTS");
      }


      leia.close();
   }
}