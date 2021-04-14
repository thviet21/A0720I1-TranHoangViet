package com.codegym.spring_security_blog.services;

import com.codegym.spring_security_blog.models.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> findAllBlog();

    Category findById(int id);

    void save(Category category);

    void delete(int id);
}
