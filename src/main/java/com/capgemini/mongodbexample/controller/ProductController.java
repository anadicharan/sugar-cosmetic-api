package com.capgemini.mongodbexample.controller;

import com.capgemini.mongodbexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public ResponseEntity<?> getProducts() {
        return ResponseEntity.ok(this.productRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.productRepository.findById(id));
    }
}
