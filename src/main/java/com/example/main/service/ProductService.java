package com.example.main.service;

import com.example.main.dto.ProductDTO;
import com.example.main.entity.Product;
import com.example.main.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product create(ProductDTO dto) {
        return productRepository.save(Product.builder()
                .name(dto.getName())
                .amount(dto.getAmount())
                .build());
    }

    public List<Product> readAll() {
        return productRepository.findAll();
    }
    public Product update(Product product) {
        return productRepository.save(product);
    }
    public void delete(Long id){
        productRepository.deleteById(id);
    }
}
