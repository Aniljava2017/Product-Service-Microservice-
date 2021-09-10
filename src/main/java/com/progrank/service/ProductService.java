package com.progrank.service;

import com.progrank.entity.ProductMain;
import com.progrank.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired

    ProductRepo repo;

    public List<ProductMain> getAllProduct(){
        return repo.findAll();
    }

    public Optional<ProductMain> getProductById(int pid){
        return repo.findById(pid);
    }

    public ProductMain saveProduct(ProductMain product){
        return repo.save(product);
    }
}
