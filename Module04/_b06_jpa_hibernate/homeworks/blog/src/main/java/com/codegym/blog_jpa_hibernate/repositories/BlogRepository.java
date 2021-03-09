package com.codegym.blog_jpa_hibernate.repositories;

import com.codegym.blog_jpa_hibernate.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
