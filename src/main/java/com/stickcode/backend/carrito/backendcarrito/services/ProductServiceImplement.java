package com.stickcode.backend.carrito.backendcarrito.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.stickcode.backend.carrito.backendcarrito.models.entities.Product;
import com.stickcode.backend.carrito.backendcarrito.repositories.ProductRepository;

@Service
public class ProductServiceImplement implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

}
