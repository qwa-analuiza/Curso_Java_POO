package sesssao17.exe05;

import sesssao17.exe05.entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("ana", "ana@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); // Compara o conteúdo
        System.out.println(c1 == c2); // compra referência de memoria

    }
}
