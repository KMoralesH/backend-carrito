package com.stickcode.backend.carrito.backendcarrito.services;

import java.util.List;

import com.stickcode.backend.carrito.backendcarrito.models.entities.Product;

public interface ProductService {
    List<Product> findAll();
}
