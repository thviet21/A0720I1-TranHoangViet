package com.codegym.demospringjpa.controllers;

import com.codegym.demospringjpa.models.Student;
import com.codegym.demospringjpa.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public ModelAndView getStudentList(@PageableDefault(size = 5) Pageable pageable){
        return new ModelAndView("list", "students", studentService.findAll(pageable));
    }

    @GetMapping("/create")
    public ModelAndView getFormCreate(){
       return new ModelAndView("create", "student", new Student());
    }

    @PostMapping("/create")
    public String saveStudent(@ModelAttribute Student student){
        studentService.save(student);
        return "redirect:/";
    }
}
