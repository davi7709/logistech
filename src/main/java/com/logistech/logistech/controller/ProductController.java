package com.logistech.logistech.controller;

import com.logistech.logistech.model.Product;
import com.logistech.logistech.model.User;
import com.logistech.logistech.service.ProductService;
import com.logistech.logistech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAllProducts(@PathVariable Product product) {
        return productService.findAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        return productService.updateProduct(product);
    }

    @GetMapping("/{id}")
    public Optional<Product> findUserById(@PathVariable Long id) {
        return productService.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}
