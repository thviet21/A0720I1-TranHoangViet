package com.codegym.blog_jpa_hibernate.controllers;


import com.codegym.blog_jpa_hibernate.models.Blog;
import com.codegym.blog_jpa_hibernate.services.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogCustomerController {

    @Autowired
    BlogServiceImpl blogService;

    @GetMapping("/")
    public String  index(Model model, RedirectAttributes redirectAttributes){
        model.addAttribute("blogs", blogService.findAllBlog());
        return "index";
    }

    @GetMapping("/blog/create")
    public ModelAndView getFormCreate(){
        return new ModelAndView("create","blog", new Blog());
    }

    @PostMapping("/blog/save")
    public String saveBlog(Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("success", "Saved blog successfully!");
        return "redirect:/";
    }


    @GetMapping("/blog/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "edit";
    }

    @PostMapping("/blog/update")
    public String update(Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addAttribute("success","Updated blog successfully!");
        return "redirect:/";
    }

    @GetMapping("/blog/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "delete";
    }

    @PostMapping("/blog/delete")
    public String delete(Blog blog, RedirectAttributes redirect) {
        blogService.delete(blog.getId());
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/";
    }

    @GetMapping("/blog/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "view";
    }
}
