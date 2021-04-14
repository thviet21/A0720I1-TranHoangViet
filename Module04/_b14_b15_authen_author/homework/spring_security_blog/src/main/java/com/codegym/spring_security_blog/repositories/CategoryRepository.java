package com.codegym.spring_security_blog.repositories;


import com.codegym.spring_security_blog.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
