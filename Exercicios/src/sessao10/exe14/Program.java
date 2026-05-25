package sessao10.exe14;

import sessao10.exe14.entities.Pensionato;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("How many rooms will be rented?");
        int n = leia.nextInt();
        Pensionato[] vet = new Pensionato[10];

        for (int i = 1; i <= n; i++) {
            System.out.println("");
            System.out.println("Rent #" + i + ":");
            leia.nextLine();

            System.out.print("Name: ");
            String name = leia.nextLine();

            System.out.print("Email: ");
            String email = leia.nextLine();

            System.out.print("Room: ");
            int numberRoom = leia.nextInt();

            vet[numberRoom] = new Pensionato(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms");
        for (int i = 0; i < 10; i++) {
                if (vet[i] != null) {
                    System.out.println(i +":"+vet[i]);
                }
        }
        leia.close();
    }
}
