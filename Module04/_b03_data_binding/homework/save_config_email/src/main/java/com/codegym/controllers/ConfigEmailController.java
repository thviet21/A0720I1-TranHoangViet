package com.codegym.controllers;

import com.codegym.model.ConfigEmail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ConfigEmailController {

    static List<String> languageList = new ArrayList<>();
    static {
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("US");
    }

    static List<Integer> pageSizeList = new ArrayList<>();
    static {
        pageSizeList.add(5);
        pageSizeList.add(10);
        pageSizeList.add(25);
        pageSizeList.add(50);
        pageSizeList.add(100);
    }
    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("configEmail",new ConfigEmail());
        model.addAttribute("languageList",languageList);
        model.addAttribute("pageSizeList",pageSizeList);
        return "home";
    }

    @PostMapping("/created")
    public String saveConfig(@ModelAttribute ConfigEmail configEmail,Model model ){
        model.addAttribute("language",configEmail.getLanguage());
        model.addAttribute("pageSize", configEmail.getPageSize());
        model.addAttribute("spamFilter", configEmail.isSpamFilter());
        model.addAttribute("signature", configEmail.getSignature());
        return "created";
    }

}
