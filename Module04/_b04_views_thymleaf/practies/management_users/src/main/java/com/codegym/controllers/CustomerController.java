package com.codegym.controllers;

import com.codegym.models.Customer;
import com.codegym.services.CustomerService;
import com.codegym.services.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/customer/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "/create";
    }
    @PostMapping("/customer/save")
    public String save(Customer customer) {
        customer.setId((int)(Math.random() * 10000));
        customerService.save(customer);
        return "redirect:/";
    }

    @GetMapping("/")
    public String index(Model model) {

        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "index";
    }
}
