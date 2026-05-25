package sessao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int n = leia.nextInt();
int in= 0, out = 0, x;
        for(int i = 0; i < n; i ++){
          x =  leia.nextInt();

          if(x >= 10 && x <= 20){
             in = in + 1;
          }else{
              out = out + 1;
          }
        }

        System.out.println(in +" in");
        System.out.println(out +" out");
    }
}
