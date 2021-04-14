package com.codegym.spring_security_blog.repositories;


import com.codegym.spring_security_blog.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUserName(String userName);
}
