package com.educandoweb.coursespring.repositories;

import com.educandoweb.coursespring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
