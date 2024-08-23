package com.arquitectura.Hexagonal.infrastructure.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arquitectura.Hexagonal.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
 
    
}
