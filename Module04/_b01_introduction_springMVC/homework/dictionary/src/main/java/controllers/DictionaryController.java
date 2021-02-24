package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class DictionaryController {
    private static  HashMap<String,String> dictionaryList = new HashMap<>();
    static {
        dictionaryList.put("honey","mật ong");
        dictionaryList.put("money","tiền");
        dictionaryList.put("bee","ong");
        dictionaryList.put("sena","ông hoàng kiểm soát");
        dictionaryList.put("baga","tam kê đại ca");
    }
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView getHomeDictionary(){
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String translate(@RequestParam String english,  ModelMap modelMap){
        if (english.isEmpty()){
            return "home";
        }
        else {
            boolean check = dictionaryList.containsKey(english);
            String vietnamese = dictionaryList.get(english);
            if (!check){
                String massage = "Không tìm thấy từ khóa";
                modelMap.addAttribute("message",massage);
            }
            else {
                modelMap.addAttribute("english", english);
                modelMap.addAttribute("vietnamese", vietnamese);
            }
            return "result";
        }
    }
}
