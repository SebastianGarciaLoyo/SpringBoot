package com.app_di.Inyeccion.services;

import java.util.List;

import com.app_di.Inyeccion.models.Product;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
}
