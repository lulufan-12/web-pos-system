package com.lulufan12.products.service;

import com.lulufan12.products.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {
  
  private final ProductRepository repository;

  
}
