package com.stickcode.backend.carrito.backendcarrito.services;

import java.util.List;
import java.util.Optional;

import com.stickcode.backend.carrito.backendcarrito.models.entities.User;

public interface UserService {

    List<User> findAll();
    
    Optional<User> findById(Long id);

    User save(User user);

    void remove(Long id);

}
