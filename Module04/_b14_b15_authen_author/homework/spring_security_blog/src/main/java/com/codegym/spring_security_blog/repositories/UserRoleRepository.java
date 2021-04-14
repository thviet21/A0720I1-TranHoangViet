package com.codegym.spring_security_blog.repositories;

import com.codegym.spring_security_blog.models.AppUser;
import com.codegym.spring_security_blog.models.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
