package sessao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int num;
        num = leia.nextInt();

        for(int i = 0; i < num; i ++){
            if(i % 2 != 0){
                System.out.println(i );
            }
        }

    }
}
