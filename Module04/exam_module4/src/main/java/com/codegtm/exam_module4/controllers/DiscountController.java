package com.codegtm.exam_module4.controllers;

import com.codegtm.exam_module4.models.Discount;
import com.codegtm.exam_module4.services.IDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class DiscountController {
    @Autowired
    IDiscountService discountService;

    @GetMapping
    public String showList(Model model){
        model.addAttribute("listDiscounts", discountService.findAllDiscount());
        return "list";
    }

    @GetMapping("/create")
    public String showFormCreateDiscount(Model model){
        model.addAttribute("discount",new Discount());
        return "form_discount";
    }

    @PostMapping("/create")
    public String createDiscount(@Valid @ModelAttribute Discount discount, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "form_discount";
        }else {
            discountService.save(discount);
            return "redirect:/";
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        discountService.delete(id);
        return "redirect:/";
    }



}