package com.codegym.blog.controllers;

import com.codegym.blog.models.Category;
import com.codegym.blog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public ResponseEntity<List<Category>> showListCategories(){
        List<Category> categoryList = categoryService.findAllBlog();
        return categoryList.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<List<Category>>(categoryList,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> showCreateCategory(@RequestBody Category category){

        if (category == null){
            System.out.println("Object Null");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        System.out.println("Creating Category: " + category.getNameCategory());
        categoryService.save(category);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/edit/{id}")
    public String showEditCategory(@RequestParam int id, Model model){
        model.addAttribute("category", categoryService.findById(id));
        return "edit_category";
    }

    @PostMapping("/edit")
    public String editCategory(){
//        categoryService.save(category);
//        model.addAttribute("success", "Edited Category!");
        return "redirect:/";
    }


    @GetMapping("/delete")
    public String showDeleteCategory(){
//        model.addAttribute("category", categoryService.findById(id));
        return "delete_category";
    }

    @PostMapping("/delete")
    public String deleteCategory(){
//        categoryService.delete(category.getId());
//        model.addAttribute("success", "Deleted Category!");
        return "redirect:/categories";
    }

    @GetMapping("view")
    public String viewCategory(){
//        model.addAttribute("category",  categoryService.findById(id));
        return "view_category";
    }



}
