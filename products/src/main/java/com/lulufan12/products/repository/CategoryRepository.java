package com.lulufan12.products.repository;

import com.lulufan12.products.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
  
}
