package com.codegym.spring_security_blog.services;

import com.codegym.spring_security_blog.models.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> findAllBlog();

    Blog findById(int id);

    void save(Blog blog);

    void delete(int id);
}
