package sessao12.exercicio04;

import sessao12.exercicio04.entities.Cliente;
import sessao12.exercicio04.entities.Order;
import sessao12.exercicio04.entities.OrderItem;
import sessao12.exercicio04.entities.Product;
import sessao12.exercicio04.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner leia = new  Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = leia.nextLine();
        System.out.print("Email: ");
        String email = leia.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(leia.next());

        Cliente cliente = new Cliente(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(leia.next()); // value of converte o string pra o indice do enums

        Order order = new Order(new Date(), status, cliente);

        System.out.print("How many items to this order? ");
        int n = leia.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            leia.nextLine();
            String productName = leia.nextLine();
            System.out.print("Product price: ");
            double productPrice = leia.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = leia.nextInt();

            OrderItem it = new OrderItem(quantity, productPrice, product);
            order.addItem(it);
        }
        System.out.println();
        System.out.println(order);
        leia.close();
    }

}
