package com.logistech.logistech.bootstrap;

import com.logistech.logistech.model.Product;
import com.logistech.logistech.model.User;
import com.logistech.logistech.repository.ProductRepository;
import com.logistech.logistech.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapDatabase implements CommandLineRunner{
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public BootStrapDatabase(UserRepository userRepository, ProductRepository productRepository){
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }
    @Override
    public void run(String... args) {
        try {
            /*User user = new User("Davi", "43721789806", "davi@gmail", "98390120");
            User user2 = new User("jonas", "8920348532", "jonas@gmail", "98348759");
            userRepository.save(user);
            userRepository.save(user2);*/

            Product product = new Product(123456, "Arroz", 10.00, 100, "Tio Joao");
            Product product2 = new Product(789101, "Feijao", 10.00, 150, "Urbano");
            productRepository.save(product);
            productRepository.save(product2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
