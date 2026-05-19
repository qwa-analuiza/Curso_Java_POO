package sesssao17.exe06;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args){

        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

       // set.removeIf(x -> x.length() >=3); REMOVER SE TIVER MAIS QUE 3 LETRAS
        set.removeIf(x -> x.charAt(0) == 'T'); // REMOVE SE A LETRA DA POSIÇÃO 0 FOR T

        for(String p : set){
            System.out.println(p);
        }
    }
}
