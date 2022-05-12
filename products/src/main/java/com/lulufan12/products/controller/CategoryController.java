package com.lulufan12.products.controller;

import com.lulufan12.products.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class CategoryController {
  
  private final CategoryService service;

}
