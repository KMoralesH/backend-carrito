package com.stickcode.backend.carrito.backendcarrito.repositories;

import org.springframework.data.repository.CrudRepository;

import com.stickcode.backend.carrito.backendcarrito.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
