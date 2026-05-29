package com.educandoweb.coursespring.config;


import com.educandoweb.coursespring.entities.*;
import com.educandoweb.coursespring.entities.enums.OrderStatus;
import com.educandoweb.coursespring.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrdemItemRepository ordemItemRepository;


    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null, "Lorem ipsum dolor sit amet, consectetur.", "", "The Lord of the Rings", 90.5);
        Product p2 = new Product(null, "Nulla eu imperdiet purus. Maecenas ante.", "", "Smart TV", 2190.0);
        Product p3 = new Product(null, "Nam eleifend maximus tortor, at mollis.", "", "Macbook Pro", 1250.0);
        Product p4 = new Product(null, "Donec aliquet odio ac rhoncus cursus.", "", "PC Gamer", 1200.00);
        Product p5 = new Product(null, "Cras fringilla convallis sem vel faucibus.", "", "Rails for Dummies", 100.99);
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888", "1234556");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "97777777777", "123456");

        Order o1 = new Order(u1, null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID);
        Order o2 = new Order(u2, null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT);
        Order o3 = new Order(u1, null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

        OrdemItem oi1 = new OrdemItem(o1, p1, p1.getPrice(), 2);
        OrdemItem oi2 = new OrdemItem(o1, p3, p3.getPrice(), 1);
        OrdemItem oi3 = new OrdemItem(o2, p3, p3.getPrice(), 2);
        OrdemItem oi4 = new OrdemItem(o3, p5, p5.getPrice(), 2);

        ordemItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));
    }
}
