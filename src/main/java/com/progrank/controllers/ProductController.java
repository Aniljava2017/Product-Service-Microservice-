package com.progrank.controllers;

import com.progrank.entity.ProductMain;
import com.progrank.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired

    ProductService service;

    @GetMapping("/")
    public List<ProductMain> getProducts(){
        return service.getAllProduct();
    }

    @PostMapping("/")
    public ProductMain saveProduct(@RequestBody ProductMain p){
        return service.saveProduct(p);
    }

    @GetMapping("{id}")
    public Optional<ProductMain> getProductByID(@PathVariable("id") int pid){
        return service.getProductById(pid);
    }
}
