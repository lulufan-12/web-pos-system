package com.lulufan12.products.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "en_category")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {
  @Id
  private Long id;
  
  @Column(length = 100, nullable = false)
  private String name;
  
  @Column(length = 1000, nullable = false)
  private String description;
  
  private Float weight;
  
  @Column(length = 100, nullable = false)
  private BigDecimal price;
  
  @ManyToOne
  @JoinColumn(name = "category_id", nullable = false)
  private Category category;
}
