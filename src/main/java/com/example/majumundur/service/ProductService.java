package com.example.majumundur.service;

import com.example.majumundur.entity.Product;
import com.example.majumundur.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findProductsByMerchant(Long merchantId) {
        return productRepository.findByMerchantId(merchantId);
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
