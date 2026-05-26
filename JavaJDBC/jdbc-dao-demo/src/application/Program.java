package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {


    public static void main(String[] args) {

        Department obj  = new Department(1, "Books");

        Seller seller = new Seller(3000.00,new Date(), "bob@gmail.com", 21, "bob", obj);

        System.out.println(seller);
    }
}
