package com.lulufan12.products.service;

import com.lulufan12.products.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService {
  
  private final CategoryRepository repository;
  
  
  
}
