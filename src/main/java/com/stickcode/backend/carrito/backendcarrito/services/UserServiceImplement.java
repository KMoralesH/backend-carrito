package com.stickcode.backend.carrito.backendcarrito.services;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.stickcode.backend.carrito.backendcarrito.models.entities.User;
import com.stickcode.backend.carrito.backendcarrito.repositories.UserRepository;

public class UserServiceImplement implements UserService {

    private UserRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        repository.deleteById(id);
    }

}
