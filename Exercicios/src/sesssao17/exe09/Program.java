package sesssao17.exe09;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new TreeSet<>();
        Set<Integer> c = new TreeSet<>();

        System.out.print("quantos estudantes estão na turma A");
        int n = leia.nextInt();
        for (int i = 0; i < n; i ++){
            int codigo = leia.nextInt();
            a.add(codigo);
        }

        System.out.print("quantos estudantes estão na turma B");
         n = leia.nextInt();
        for (int i = 0; i < n; i ++){
            int codigo = leia.nextInt();
            b.add(codigo);
        }


        System.out.print("quantos estudantes estão na turma C");
        n = leia.nextInt();
        for (int i = 0; i < n; i ++){
            int codigo = leia.nextInt();
            c.add(codigo);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total de estudantes :" + total.size());

    }
}
