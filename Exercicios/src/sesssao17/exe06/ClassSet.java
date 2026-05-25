package sesssao17.exe06;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ClassSet {
    public static void main(String[] args){

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        System.out.println("Lista a ------------------"+ a );

        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
        System.out.println("Lista b ------------------" + b);

        // união das duas listas em uma só
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b); // ele vai adicionar todos da b na a, mas, se tiver número igual ele não repete
        System.out.println("Lista c ------------------" + c);

        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b); // esse eu pego somente elementos que temos em comum nos dois conjunto
        System.out.println("Lista d ------------------"+d);

        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println("Lista e ------------------" + e );
    }
}
