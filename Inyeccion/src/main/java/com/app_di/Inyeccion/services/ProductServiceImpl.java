package com.app_di.Inyeccion.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app_di.Inyeccion.models.Product;
import com.app_di.Inyeccion.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repositoryProduct;

    public Product findById(Long id){
        return repositoryProduct.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return repositoryProduct.findAll().stream().map(p -> {
            Double priceImp = p.getPrice() * 1.45d;
            Product newProduct = new Product(p.getId(), p.getName(), priceImp.longValue());
            return newProduct;
        }).collect(Collectors.toList());
       
    }

}
