package com.lulufan12.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lulufan12.products.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
  
}
