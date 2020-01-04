package am.kinoclub.web.controller;

import am.kinoclub.common.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/mainPage")
    public String mainPage(ModelMap modelMap){
        modelMap.addAttribute("user", new User());
        return "index";
    }
}
