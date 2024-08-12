package com.app_di.Inyeccion.repositories;

import java.util.Collection;

import com.app_di.Inyeccion.models.Product;

public interface ProductRepository {
    Product findById(Long id);

    Collection<Product> findAll();
}
