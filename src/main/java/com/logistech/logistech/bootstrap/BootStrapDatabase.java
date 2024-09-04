package com.logistech.logistech.bootstrap;

import com.logistech.logistech.model.Employee;
import com.logistech.logistech.model.Product;
import com.logistech.logistech.repository.EmployeeRepository;
import com.logistech.logistech.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapDatabase implements CommandLineRunner{
    private final EmployeeRepository employeeRepository;
    private final ProductRepository productRepository;

    public BootStrapDatabase(EmployeeRepository employeeRepository, ProductRepository productRepository){
        this.employeeRepository = employeeRepository;
        this.productRepository = productRepository;
    }
    @Override
    public void run(String... args) {
        try {
            Employee user = new Employee("Davi", "43721789806", "davi@gmail", "98390120");
            Employee user2 = new Employee("jonas", "8920348532", "jonas@gmail", "98348759");
            employeeRepository.save(user);
            employeeRepository.save(user2);

            Product product = new Product(123456, "Arroz", 10.00, 100, "Tio Joao");
            Product product2 = new Product(789101, "Feijao", 10.00, 150, "Urbano");
            productRepository.save(product);
            productRepository.save(product2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
