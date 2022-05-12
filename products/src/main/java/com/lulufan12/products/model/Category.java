package com.lulufan12.products.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "en_category")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Category {
  
  @Id
  @GeneratedValue
  @Column(name = "category_id")
  private Long id;
  
  @Column(nullable = false, length = 100)
  private String name;
  
  @Column(nullable = false, length = 1000)
  private String description;
  
  @OneToMany(mappedBy = "category")
  Set<Product> products;
}
