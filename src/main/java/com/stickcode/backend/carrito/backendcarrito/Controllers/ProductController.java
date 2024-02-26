package com.stickcode.backend.carrito.backendcarrito.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.stickcode.backend.carrito.backendcarrito.models.entities.Product;
import com.stickcode.backend.carrito.backendcarrito.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")

public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")    
    public List<Product> list(){
        return service.findAll();
    }

}
