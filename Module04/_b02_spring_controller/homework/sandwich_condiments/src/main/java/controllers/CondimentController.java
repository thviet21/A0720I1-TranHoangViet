package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CondimentController {
    @GetMapping("/")
    public String showCondiments(){
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam(value = "condiments",required = false) String[] condiments, Model model) {
        if (condiments == null){
            model.addAttribute("massage", "This sandwich not condiments");
        }
        model.addAttribute("condiments", condiments);
        return "index";
    }
}
