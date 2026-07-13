package com.educandoweb.coursespring.repositories;

import com.educandoweb.coursespring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
