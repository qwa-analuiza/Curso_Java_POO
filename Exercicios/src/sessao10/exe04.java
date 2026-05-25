package sessao10;


import java.util.Locale;
import java.util.Scanner;

public class exe04 {
   public  static  void main(String[] args){

       Locale.setDefault(Locale.US);
       Scanner leia = new Scanner(System.in);

       int n = leia.nextInt();
       double [] vet = new double[n];

       for (int i = 0 ; i < vet.length; i ++){
           System.out.print("Digite um numero: ");
           vet[i] = leia.nextDouble();
       }

       System.out.print("VALORES  = ");
       for (int i = 0; i < vet.length; i ++){
           System.out.print(vet[i] + "  ");
       }

       System.out.println();
       double soma = 0.0;
       for (int i = 0; i < vet.length; i ++){
           soma += vet[i];
       }
       System.out.println("SOMA = "+String.format("%.2f", soma));

       double media = (soma / vet.length);
       System.out.printf("MEDIA = " + String.format("%.2f", media));


       leia.close();
   }
}
