package com.lulufan12.products.controller;

import com.lulufan12.products.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class ProductController {
  
  private final ProductService service;
  
}
