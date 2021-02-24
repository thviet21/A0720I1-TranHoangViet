package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExchangeController {
    @RequestMapping( value = "/exchange", method = RequestMethod.GET)
    public String getHomeExchange(){
        return "exchange";
    }
    @RequestMapping( value = "/exchange", method = RequestMethod.POST)
    public String exchangeMoney(@RequestParam String USD, Model model){
        if (USD.isEmpty()){
            return "exchange";
        }else {
            int vnd = Integer.parseInt(USD) * 23000;
            model.addAttribute("usd" , USD);
            model.addAttribute("vnd", vnd);
            return "result";
        }
    }
}
