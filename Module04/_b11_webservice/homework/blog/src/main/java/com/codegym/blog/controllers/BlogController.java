package com.codegym.blog.controllers;


import com.codegym.blog.models.Blog;
import com.codegym.blog.services.impl.BlogServiceImpl;
import com.codegym.blog.services.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogServiceImpl blogService;

    @Autowired
    CategoryServiceImpl categoryService;

    @GetMapping(value = "/")
    public ResponseEntity<List<Blog>> listBlog() {
        List<Blog> blogList = blogService.findAllBlog();
        return blogList.isEmpty() ? new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT) : new ResponseEntity<List<Blog>>(blogList, HttpStatus.OK);
    }


    @PostMapping("/save")
    public ResponseEntity<Void> saveBlog(@RequestBody Blog blog) {
        System.out.println("Creating Customer " + blog.getTitleBlog());
        blogService.save(blog);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @PutMapping("/edit/{id}")
    public ResponseEntity<Blog> edit(@RequestBody Blog blog, @PathVariable int id) {
        Blog crBlog = blogService.findById(id);
        if (crBlog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blog.setId(id);
        blogService.save(blog);
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Blog> deleteCustomer(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting Customer with id " + id);

        Blog blog = blogService.findById(id);
        if (blog == null) {
            System.out.println("Unable to delete. Customer with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }

        blogService.delete(id);
        return new ResponseEntity<Blog>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<Blog> view(@PathVariable int id) {
        Blog blog =  blogService.findById(id);
        return blog == null ? new ResponseEntity<Blog>(HttpStatus.NOT_FOUND) : new ResponseEntity<Blog>(blog,HttpStatus.OK);
    }
}
