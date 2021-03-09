package com.codegym.blog_jpa_hibernate.services;

import com.codegym.blog_jpa_hibernate.models.Blog;

import java.util.List;


public interface BlogService {
    List<Blog> findAllBlog();

    Blog findById(int id);

    void save(Blog blog);

    void delete(int id);
}
