package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculaterController {
    @GetMapping("/")
    public String showForm(){
        return "index";
    }

    @PostMapping("/")
    public String calculate(@RequestParam float number1, @RequestParam float number2, @RequestParam String cal, Model model){
        float result;
        switch (cal){
            case "Sum":
                result = number1 + number2;
                break;
            case "Des":
                result = number1 - number2;
                break;
            case "Mul":
                result = number1 * number2;
                break;
            case "Div":
                if (number2 == 0){
                    model.addAttribute("massage", "Division by Zero");
                    return "index";
                }else result = number1/number2;
                break;
            default:
                return "index;";
        }
        model.addAttribute("result", result);
        return "index;";
    }
}
