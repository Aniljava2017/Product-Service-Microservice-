package com.progrank.repo;

import com.progrank.entity.ProductMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductMain,Integer> {
}
