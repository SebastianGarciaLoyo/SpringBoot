package com.arquitectura.Hexagonal.application.service.product;

import java.util.List;
import java.util.Optional;

import com.arquitectura.Hexagonal.domain.entities.Product;

public interface ProductService {
    Optional<Product> findById(Long id);
    List<Product> getAll();
    Product save(Product product);
}
