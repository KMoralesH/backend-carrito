package com.stickcode.backend.carrito.backendcarrito.repositories;

import org.springframework.data.repository.CrudRepository;

import com.stickcode.backend.carrito.backendcarrito.models.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
    
}
