package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CheckEmailController {

    /* Khai báo Regex */
   public static final String EMAIL_REGEX = "^[\\w.]+@[\\w&&[^_]]+([.][\\w&&[^_]]+){1,2}$";


    @GetMapping("/")
    String getIndex() {
        return "index";
    }

    @PostMapping("/validate")
    String validateEmail(@RequestParam String email, Model model) {
        boolean isValid = email.matches(EMAIL_REGEX);
        if (!isValid) {
            model.addAttribute("message", "Email is invalid");
            return "index";
        }
        else {
            model.addAttribute("email", email);
            return "success";
        }
    }


}
