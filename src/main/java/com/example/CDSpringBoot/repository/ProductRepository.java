package com.example.CDSpringBoot.repository;

import com.example.CDSpringBoot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
