package com.codegym.controllers;


import com.codegym.models.Feedback;
import com.codegym.services.impl.FeedbackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FeedbackController {
    static List<Integer> stars = new ArrayList<>();
    static {
        stars.add(1);
        stars.add(2);
        stars.add(3);
        stars.add(4);
        stars.add(5);
    }
    @Autowired
    FeedbackServiceImpl feedbackService;

    @GetMapping("/createFeedback")
    public String getViewFeedBack(Model model) {
        model.addAttribute("stars",stars);
        model.addAttribute("feedback", new Feedback());
        return "view";
    }



    @GetMapping("/")
    public ModelAndView getListFeedback(){
        return new ModelAndView("list","listFeedback",feedbackService.findAll() );
    }
}
