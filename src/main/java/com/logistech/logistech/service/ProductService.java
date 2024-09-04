package com.logistech.logistech.service;

import com.logistech.logistech.model.Product;
import com.logistech.logistech.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;

    public List<Product> findAllProducts(){
        return (List<Product>) productRepository.findAll();
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public Optional<Product> findProductById(Long id){
        return productRepository.findById(id);
    }

    public Product updateProduct(Product product) {
        productValidate(product);
        return productRepository.save(product);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    private void productValidate(Product product) {
        if (productRepository.existsBySku(product.getSku())) {
            throw new IllegalArgumentException("SKU já cadastrado.");
        }
    }

}
