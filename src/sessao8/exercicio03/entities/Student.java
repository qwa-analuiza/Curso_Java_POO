package sessao8.exercicio03.entities;

public class Student {
   public String name;
   public double nota1;
   public double nota2;
   public double nota3;

   public Student() {
   }

   public double notaFinal() {
      return this.nota1 + this.nota2 + this.nota3;
   }

   public double notaFaltante() {
      return this.notaFinal() < (double)60.0F ? (double)60.0F - this.notaFinal() : (double)0.0F;
   }
}
